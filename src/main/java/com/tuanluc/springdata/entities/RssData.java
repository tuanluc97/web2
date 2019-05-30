package com.tuanluc.springdata.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "rssData")
public class RssData {
    @Id
    private String id;
    private String title;
    private String url;
    private String logo;
    private String linkedItem;
    private RssData list;

    public String getLinkedItem() {
        return linkedItem;
    }

    public void setLinkedItem(String linkedItem) {
        this.linkedItem = linkedItem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public RssData getList() {
        return list;
    }

    public void setList(RssData list) {
        this.list = list;
    }
}