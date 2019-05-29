package com.tuanluc.springdata.common;

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

public class RSSHelper {
    public static String getTitleFormRSS(String url) {
        try {
            URL feedUrl = new URL(url);
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedUrl));
            String title = feed.getTitle();
            return title.replace("RSS","");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }
}
