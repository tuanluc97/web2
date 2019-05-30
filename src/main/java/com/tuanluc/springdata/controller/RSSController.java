package com.tuanluc.springdata.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tuanluc.springdata.entities.RssData;
import com.tuanluc.springdata.repository.RssDataRepository;
@Controller
public class RSSController {
    @Autowired
    private RssDataRepository rssDataRepository;
    @RequestMapping(value = { "/rss-list" })
    public String listRss(Model model) {
        model.addAttribute("listRssData", rssDataRepository.findAll());
        return "rss-list";
    }
    @RequestMapping("/rss-save")
    public String insertRss(Model model) {
        model.addAttribute("rssData", new RssData());
        return "rss-save";
    }
    @RequestMapping("/rss-view/{id}")
    public String viewRss(@PathVariable String id, Model model) {
        Optional<RssData> rssData = rssDataRepository.findById(id);
        if (rssData.isPresent()) {
            model.addAttribute("rssData", rssData.get());
        }
        return "rss-view";
    }
    @RequestMapping("/rss-update/{id}")
    public String updateRss(@PathVariable String id, Model model) {
        Optional<RssData> rssData = rssDataRepository.findById(id);
        if (rssData.isPresent()) {
            model.addAttribute("rssData", rssData.get());
        }
        return "rss-update";
    }
    @RequestMapping("/saveRss")
    public String doSaveRss(@ModelAttribute("RssData") RssData rssData, Model model) {
        rssDataRepository.save(rssData);
        model.addAttribute("listRssData", rssDataRepository.findAll());
        return "rss-list";
    }
    @RequestMapping("/updateRss")
    public String doUpdateRss(@ModelAttribute("RssData") RssData rssData, Model model) {
        rssDataRepository.save(rssData);
        model.addAttribute("listRssData", rssDataRepository.findAll());
        return "rss-list";
    }

    /*@RequestMapping("/addRssItem")
    public String doaddRssItem(@ModelAttribute("RssDataItem") RssData rssData, Model model) {

        rssDataRepository.save(rssData);
        model.addAttribute("listRssData", rssDataRepository.findAll());
        return "rss-update";
    }

    @RequestMapping("/updateRssItem")
    public String doupdateRssItem(@ModelAttribute("RssDataItem") RssData rssData, Model model) {
        rssDataRepository.save(rssData);
        model.addAttribute("listRssData", rssDataRepository.findAll());
        return "rss-update";
    }*/

    @RequestMapping("/deleteRss/{id}")
    public String doDeleteRss(@PathVariable String id, Model model) {
        rssDataRepository.deleteById(id);
        model.addAttribute("listRssData", rssDataRepository.findAll());
        return "rss-list";
    }
}