package com.tuanluc.springdata.common;

import com.tuanluc.springdata.entities.ItemRSS;

import java.util.List;

public interface RSSInterface {
    String getUrlLogo();
    String getTitle();
    String getDate();
    List<ItemRSS> getListItem();
}
