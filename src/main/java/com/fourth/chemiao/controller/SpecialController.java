package com.fourth.chemiao.controller;

import com.fourth.chemiao.bean.International_landmarik;
import com.fourth.chemiao.bean.Special_attractions;
import com.fourth.chemiao.service.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SpecialController {
    @Autowired
    private SpecialService specialService;

    @RequestMapping("Thematic_tour_homepage")
    public String goThematic_tour_homepage() {
        return "forward:attractions_one";
    }


    @RequestMapping("attractions_one")
    public String getQuerySpecial(Model model, Integer id){
        List<International_landmarik> querylandmarik = specialService.getQuerylandmarik(1);
        model.addAttribute("landmarik",querylandmarik);

        List<Special_attractions> one = specialService.getQueryAttractions_one(2);
        model.addAttribute("one",one);

        List<Special_attractions> two = specialService.getQueryAttractions_one(3);
        model.addAttribute("two",two);

        List<Special_attractions> three = specialService.getQueryAttractions_one(4);
        model.addAttribute("three",three);

        return "Thematic_tour_homepage";
    }

    @RequestMapping("byName")
    public String getQueryByName(Model model,String theme_name){
        Special_attractions queryByName = specialService.getQueryByName(theme_name);
        model.addAttribute("queryByName",queryByName);
        return "";
    }
}
