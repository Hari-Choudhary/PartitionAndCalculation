package com.example.demo.controller;

import com.example.demo.service.DemoService;
import com.example.demo.util.DemoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {


    @Autowired
    private DemoService demoService;

    /**
     * takes the number of partitions as input ex 10
     * reads values from csv placed at src\\main\\resources\\inputdata.csv
     * calls service layer to create partitions and run calculation..
     * @param numberOfPartitions
     * @return
     */
    @GetMapping("partition/{numberOfPartitions}/calculate")
    public Double createPartitionFromCsvAndCalculateResult(@PathVariable("numberOfPartitions") int numberOfPartitions) {
        try {
            return demoService.updateCountOfPartitionAndCalculateResult(DemoUtil.readCsv(), numberOfPartitions);
        } catch (Exception ex) {
            //handle file read exception..
            return null;
        }
    }
}
