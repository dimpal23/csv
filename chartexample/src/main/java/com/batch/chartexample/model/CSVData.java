package com.batch.chartexample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CSVData {
    @Id
    @Column(name = "end_year")
    private String end_year;
    @Column(name = "citylng")
    private String citylng;
    @Column(name = "citylat")
    private String citylat;
    @Column(name = "intensity")
    private String intensity;
    @Column(name = "sector")
    private String sector;
    @Column(name = "topic")
    private String topic;
    @Column(name = "insight")

    private String insight;
    @Column(name = "swot")

    private String swot;
    @Column(name = "url")

    private String url;
    @Column(name = "region")

    private String region;
    @Column(name = "start_year")

    private String start_year;
    @Column(name = "impact")

    private String impact;
    @Column(name = "added")

    private String added;
    @Column(name = "published")

    private String published;
    @Column(name = "city")

    private String city;
    @Column(name = "country")

    private String country;
    @Column(name = "relevance")

    private String relevance;
    @Column(name = "pestle")

    private String pestle;
    @Column(name = "source")

    private String source;
    @Column(name = "title")

    private String title;
    @Column(name = "likelihood")

    private String likelihood;




}