package com.batch.chartexample.service;

import com.batch.chartexample.model.CSVData;
import com.batch.chartexample.repository.CSVDataRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Service
public class CSVService {
    private final CSVDataRepository csvDataRepository;
    public CSVService(CSVDataRepository csvDataRepository){
        this.csvDataRepository = csvDataRepository;
    }

    public void storeCSV(MultipartFile file) {
        try (BufferedReader reader= new BufferedReader(new InputStreamReader(file.getInputStream()))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                CSVData csvData = new CSVData();
                System.out.println("line"+line);
                for (String field : fields) {
                    System.out.println("fields"+field);
                }

                csvData.setEnd_year(Long.parseLong(fields[0]));

                csvData.setCitylng(Integer.parseInt((fields[1])));
                csvData.setCitylat(Integer.parseInt((fields[2])));
                csvData.setIntensity(Integer.parseInt(fields[0]));
                csvData.setSector(fields[0]);
                csvData.setTopic(fields[1]);
                csvData.setInsight(fields[2]);
                csvData.setSwot(fields[3]);
                csvData.setUrl(fields[4]);
                csvData.setRegion(fields[5]);
                csvData.setStart_year(Integer.parseInt(fields[6]));
                csvData.setImpact(Integer.parseInt(fields[7]));
                csvData.setAdded(fields[8]);
                csvData.setPublished(fields[9]);
                csvData.setCity(fields[10]);
                csvData.setCountry(fields[11]);
                csvData.setRelevance(Integer.parseInt(fields[12]));
                csvData.setPestle(fields[13]);
                csvData.setSource(fields[14]);
                csvData.setTitle(fields[15]);
                csvData.setLikelihood(Integer.parseInt(fields[16]));

                // Set other fields as per your CSV structure
                csvDataRepository.save(csvData);
            }
        }
        catch (Exception e) {
            // Handle exceptions
        }
    }

}
