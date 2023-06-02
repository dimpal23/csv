package com.batch.chartexample.repository;

import com.batch.chartexample.model.CSVData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CSVDataRepository extends JpaRepository<CSVData ,Long> {

}
