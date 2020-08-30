package com.example.demo.util;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DemoUtil {
    /**
     * reads the csv stored at src\\main\\resources\\inputdata.csv
     * returns the data in the form of List<String[]>
     * @return
     * @throws IOException
     * @throws CsvException
     */
    public static List<String[]> readCsv() throws IOException, CsvException {

        FileReader filereader = new FileReader("src\\main\\resources\\inputdata.csv");

        // create csvReader object and skip first Line
        CSVReader csvReader = new CSVReaderBuilder(filereader)
                .withSkipLines(1)
                .build();

        return csvReader.readAll();
    }
}

