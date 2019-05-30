package com.tuanluc.springdata.controller;

import com.tuanluc.springdata.common.Constant;
import com.tuanluc.springdata.common.RSSInterface;
import com.tuanluc.springdata.common.RSSHelper;
import com.tuanluc.springdata.rss.HandlerRSS;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public String getHome(Model model) {
        model.addAttribute("listAll", Constant.LIST_ALL_RSS());
        return "home";
    }

    /*@RequestMapping(value = {"/newsss"})
    public String listRssss(Model model) {
        RSSInterface rss = new HandlerRSS("");
        model.addAttribute("logo", rss.getUrlLogo());
        model.addAttribute("date", rss.getDate());
        model.addAttribute("title", rss.getTitle());
        model.addAttribute("listRss", rss.getListItem());
        return "news";
    }

    @RequestMapping("/news")
    public String listRss() {
        return "news";
    }*/

}