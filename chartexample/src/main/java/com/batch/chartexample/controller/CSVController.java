package com.batch.chartexample.controller;
import com.batch.chartexample.model.CSVData;
import com.batch.chartexample.service.CSVService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class CSVController {
    private final CSVService csvService;

    public CSVController(CSVService csvService) {
        this.csvService = csvService;
    }

    @PostMapping("/upload")
    public void uploadCSV(@RequestBody MultipartFile file) {


        csvService.storeCSV(file);
    }
    @GetMapping("/getall")
    public  List<CSVData> getAllData() {

        return csvService.getData();
    }

}
