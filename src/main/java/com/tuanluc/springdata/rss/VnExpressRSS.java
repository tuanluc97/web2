package com.tuanluc.springdata.rss;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import com.tuanluc.springdata.common.RSSInterface;
import com.tuanluc.springdata.entities.ItemRSS;

public class VnExpressRSS implements RSSInterface {

    public VnExpressRSS() {
        this.executeRSS();
    }

    private String urlLogo;

    private String title;

    private String date;

    private List<ItemRSS> listItem = new ArrayList<ItemRSS>();

    public String getUrlLogo() {
        if (urlLogo == null) {
            return "";
        }
        return urlLogo;
    }

    public String getTitle() {
        if (title == null) {
            return "";
        }
        return title;
    }

    public String getDate() {
        if (date == null) {
            return "";
        }
        return date;
    }

    public List<ItemRSS> getListItem() {
        if (listItem == null) {
            return new ArrayList<ItemRSS>();
        }
        return listItem;
    }

    private void executeRSS() {
        try {
            String url = "https://vnexpress.net/rss/tin-moi-nhat.rss";
            URL feedUrl = new URL(url);
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedUrl));
            this.title = feed.getImage().getTitle();
            this.date = feed.getUri();
            this.urlLogo = feed.getImage().getUrl();


            for (SyndEntry entry : (List<SyndEntry>) feed.getEntries()) {
                ItemRSS itemRSS = new ItemRSS();
                if(!entry.getLink().isEmpty()){
                    itemRSS.setLink(entry.getLink());
                }
                if(!entry.getDescription().getValue().isEmpty()){
                    itemRSS.setDescription(entry.getDescription().getValue());
                }
                if(!entry.getTitle().isEmpty()){
                    itemRSS.setTitle(entry.getTitle());
                }
                if(!(entry.getPublishedDate() == null)){
                    itemRSS.setPubDate(entry.getPublishedDate().toString());
                }
                if(!(entry.getUpdatedDate() == null)){
                    itemRSS.setPubDate(entry.getUpdatedDate().toString());
                }
                this.listItem.add(itemRSS);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
