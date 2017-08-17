package com.fourth.community.controller;

import com.fourth.User.bean.User;
import com.fourth.community.bean.TravelComment;
import com.fourth.community.service.TravelCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by 染熙 on 2017/8/16.
 */
@Controller
@RequestMapping("/TravelComment")
public class TravelCommentController {
    @Autowired
    private TravelCommentService travelCommentService;

    @RequestMapping("/addTravelComment")
    @ResponseBody
    public void addTravelComment(TravelComment travelComment, Model model, HttpSession session){
        User user = (User) session.getAttribute("useri");
        travelComment.setC_head(user.getHead());
        travelComment.setC_username(user.getUsername());
        travelComment.setC_releaseDate(new Date());
        travelCommentService.addTravelComment(travelComment);
        TravelComment comments = travelCommentService.findTravelComment(travelComment.getCid());
    }


}
