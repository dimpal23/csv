package com.batch.chartexample.service;

import com.batch.chartexample.model.CSVData;
import com.batch.chartexample.repository.CSVDataRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@Service
public class CSVService {
    private final CSVDataRepository csvDataRepository;

    public CSVService(CSVDataRepository csvDataRepository) {
        this.csvDataRepository = csvDataRepository;
    }

    public void storeCSV(MultipartFile fileData) {
        try {
            Reader reader = new InputStreamReader(fileData.getInputStream());
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim());

            for (CSVRecord record : csvParser) {
                String column1 = record.get("end_year");
                String column2 = record.get("topic");
                String column3=record.get("citylng");
                String column4 = record.get("citylat");
                String column5 = record.get("intensity");
                String column6=record.get("sector");
                String column7 = record.get("insight");
                String column8 = record.get("swot");
                String column9=record.get("url");
                String column10 = record.get("region");
                String column11 = record.get("start_year");
                String column12=record.get("impact");
                String column13= record.get("added");
                String column14 = record.get("published");
                String column15=record.get("city");
                String column16=record.get("country");
                String column17=record.get("relevance");
                String column18= record.get("pestle");
                String column19 = record.get("source");
                String column20=record.get("title");
                String column21=record.get("likelihood");
                System.out.println(column21);
               // System.out.println(column2);

                CSVData csvData = CSVData.builder().
                        end_year(  record.get("end_year")).
                        citylng(record.get("citylng"))
                        .citylat(record.get("citylat"))
                        .intensity(record.get("intensity"))
                        .sector(record.get("sector"))
                        .topic(record.get("topic"))
                        .insight(record.get("insight").substring(0,2))
                        .swot(record.get("swot"))
                        .url(record.get("url"))
                        .region(record.get("region"))
                        .start_year(record.get("start_year"))
                        .impact(record.get("impact"))
                        .added(record.get("added"))
                        .published(record.get("published"))
                        .city(record.get("city"))
                        .country(record.get("country"))
                        .relevance(record.get("relevance"))
                        .pestle(record.get("pestle"))
                        .source(record.get("source"))
                        .title(record.get("title").substring(0,10))
                        .likelihood(record.get("likelihood"))
                        .build();




//                csvData.setCitylng(Integer.parseInt(column3));
//                csvData.setCitylat(Integer.parseInt(column4));
//
//                csvData.setIntensity(Integer.parseInt(column5));
//                csvData.setSector(column6);
//                csvData.setInsight(column7);
//                csvData.setSwot(column8);
//                csvData.setUrl(column9);
//                csvData.setRegion(column10);
//                csvData.setStart_year(Integer.parseInt(column11));
//                csvData.setImpact(Integer.parseInt(column12));
//                csvData.setAdded(column13);
//                csvData.setPublished(column14);
//                csvData.setCity(column15);
//                csvData.setCountry(column16);
//                csvData.setRelevance(Integer.parseInt(column17));
//                csvData.setPestle(column18);
//                csvData.setSource(column19);
//                csvData.setTitle(column20);

                csvDataRepository.save(csvData);
            }


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


    public List<CSVData> getData() {
        System.out.println(csvDataRepository);
        return csvDataRepository.findAll();
    }


}
