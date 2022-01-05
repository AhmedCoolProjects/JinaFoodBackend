package me.ahmedbargady.jinafood.model;

import java.time.LocalDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FileInfo {
    private String name, url;
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FileInfo(String name, String url, LocalDate date) {
        this.name = name;
        this.url = url;
        this.date = date;
    }

}
