package com.example.demo.service;

import com.example.demo.model.CalcObj;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    /**
     * creates a partition of arrays of size : numberOfPartitions. and updates the postive and negative counts.
     * calls the method to runCalculation.
     * returns the result.
     *
     * @param csvData
     * @param numberOfPartitions
     * @return
     */
    public Double updateCountOfPartitionAndCalculateResult(List<String[]> csvData,
                                                           int numberOfPartitions) {
        CalcObj[] calcObjList = new CalcObj[numberOfPartitions];
        for (int i = 0; i < numberOfPartitions; i++) {
            calcObjList[i] = new CalcObj();
        }

        csvData.forEach(strings -> {
            double value = Double.parseDouble(strings[0]);
            boolean response = Integer.parseInt(strings[1]) == 1;
            if (response)
            /**
             * 0 to 0.99999 will be stored at index 0 of calcObjList
             * 1 to 1.99999 will be stored at index 1 of calcObjList and so on..
             */
                calcObjList[(int) Math.floor(value * 10)].incrementPositiveCount();
            else
                calcObjList[(int) Math.floor(value * 10)].incrementNegativeCount();
        });

        return runCalculationOnPartition(calcObjList);
    }

    /**
     * runs the said calculation on the partition and returns the result.
     *
     * @param calcObjList
     * @return
     */
    private Double runCalculationOnPartition(CalcObj[] calcObjList) {
        for (int i = 0; i < calcObjList.length; i++) {
            //todo
            /**
             * didnt understand the calculation formula, so keepoing it blank.
             * but we can iterate through the partitions and compute the result.
             */
        }
        return null;
    }
}
