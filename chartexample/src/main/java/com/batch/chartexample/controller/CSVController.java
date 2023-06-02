package com.batch.chartexample.controller;
import com.batch.chartexample.service.CSVService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class CSVController {
    private final CSVService csvService;

    public CSVController(CSVService csvService) {
        this.csvService = csvService;
    }

    @PostMapping("/upload")
    public void uploadCSV(@RequestParam("file") MultipartFile file) {
        System.out.println(file);
        csvService.storeCSV(file);
    }
}
