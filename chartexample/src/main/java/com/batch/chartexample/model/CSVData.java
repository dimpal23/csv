package com.batch.chartexample.model;

import jakarta.persistence.*;

@Entity
public class CSVData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "end_year")
    private long end_year;
    @Column(name = "citylng")
    private int citylng;
    @Column(name = "citylat")
    private int citylat;
    @Column(name = "intensity")
    private int intensity;
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

    private int start_year;
    @Column(name = "impact")

    private int impact;
    @Column(name = "added")

    private String added;
    @Column(name = "published")

    private String published;
    @Column(name = "city")

    private String city;
    @Column(name = "country")

    private String country;
    @Column(name = "relevance")

    private int relevance;
    @Column(name = "pestle")

    private String pestle;
    @Column(name = "source")

    private String source;
    @Column(name = "title")

    private String title;
    @Column(name = "likelihood")

    private int likelihood;


    public CSVData() {
    }

    public CSVData(long end_year, int citylng, int citylat, int intensity, String sector, String topic, String insight, String swot, String url, String region, int start_year, int impact, String added, String published, String city, String country, int relevance, String pestle, String source, String title, int likelihood) {
        this.end_year = end_year;
        this.citylng = citylng;
        this.citylat = citylat;
        this.intensity = intensity;
        this.sector = sector;
        this.topic = topic;
        this.insight = insight;
        this.swot = swot;
        this.url = url;
        this.region = region;
        this.start_year = start_year;
        this.impact = impact;
        this.added = added;
        this.published = published;
        this.city = city;
        this.country = country;
        this.relevance = relevance;
        this.pestle = pestle;
        this.source = source;
        this.title = title;
        this.likelihood = likelihood;
    }

    public long getEnd_year() {
        return end_year;
    }

    public void setEnd_year(long end_year) {
        this.end_year = end_year;
    }

    public int getCitylng() {
        return citylng;
    }

    public void setCitylng(int citylng) {
        this.citylng = citylng;
    }

    public int getCitylat() {
        return citylat;
    }

    public void setCitylat(int citylat) {
        this.citylat = citylat;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getInsight() {
        return insight;
    }

    public void setInsight(String insight) {
        this.insight = insight;
    }

    public String getSwot() {
        return swot;
    }

    public void setSwot(String swot) {
        this.swot = swot;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getStart_year() {
        return start_year;
    }

    public void setStart_year(int start_year) {
        this.start_year = start_year;
    }

    public int getImpact() {
        return impact;
    }

    public void setImpact(int impact) {
        this.impact = impact;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRelevance() {
        return relevance;
    }

    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }

    public String getPestle() {
        return pestle;
    }

    public void setPestle(String pestle) {
        this.pestle = pestle;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(int likelihood) {
        this.likelihood = likelihood;
    }
}
