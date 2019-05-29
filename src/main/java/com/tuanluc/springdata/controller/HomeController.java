package com.tuanluc.springdata.controller;

import com.tuanluc.springdata.common.RSSInterface;
import com.tuanluc.springdata.rss.VnExpressRSS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tuanluc.springdata.entities.Customer;
import com.tuanluc.springdata.repository.CustomerRepository;

import java.util.Optional;

@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/home"})
    public String listRss(Model model) {
        RSSInterface rss = new VnExpressRSS();
        model.addAttribute("logo", rss.getUrlLogo());
        model.addAttribute("date", rss.getDate());
        model.addAttribute("title", rss.getTitle());
        model.addAttribute("listRss", rss.getListItem());
        return "home";
    }
}