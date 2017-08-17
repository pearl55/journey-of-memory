package com.fourth.community.controller;

import com.fourth.User.bean.User;
import com.fourth.community.bean.TravelComment;
import com.fourth.community.bean.TravelNotes;
import com.fourth.community.bean.UnifyUserAndNotesAndComment;
import com.fourth.community.service.TravelCommentService;
import com.fourth.community.service.TravelNotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by 染熙 on 2017/8/8.
 * 有关游记的前后台交互
 */
@Controller
@RequestMapping("/TravelNotes")
public class TravelNotesController {
    @Autowired
    private TravelNotesService travelNotesService;
    @Autowired
    private TravelCommentService travelCommentService;
    /*
   发表游记页面
    */
    @RequestMapping("/travelNotes")
    public String travelNotes(HttpSession session,Model model){
        User user = (User) session.getAttribute("useri");
        model.addAttribute("user",user);
        String str=user.getDeng();
        String ss = str.substring(0,str.length()-(str.substring(3)).length())+"****"+str.substring(7);
        model.addAttribute("deng1",ss);
        return "travel";
    }

    /*
    添加新的游记
     */
    @RequestMapping("/addTravelNotes")
    public String addTravelNotes(TravelNotes travelNotes, HttpSession session,Model model){
        User user = (User) session.getAttribute("useri");
        String str=user.getDeng();
        String ss = str.substring(0,str.length()-(str.substring(3)).length())+"****"+str.substring(7);
        model.addAttribute("deng1",ss);

        travelNotes.setN_releaseDate(new Date());
        travelNotes.setN_updateDate(travelNotes.getN_releaseDate());
        travelNotes.setN_page_view(0);
        travelNotes.setN_commentnum(0);
        travelNotesService.addTravelNotes(travelNotes);
        int n_id = travelNotes.getN_id();
        session.setAttribute("n_id",n_id);
        return "travelreview";
    }
    /*
  查询新添加的游记
   */
    @RequestMapping("/getTravelNotes")
    public String getTravelNotes(Model model,HttpSession session){
        User user = (User) session.getAttribute("useri");
        String str=user.getDeng();
        String ss = str.substring(0,str.length()-(str.substring(3)).length())+"****"+str.substring(7);
        model.addAttribute("deng1",ss);
       Integer  n_id =  (Integer) session.getAttribute("n_id");
        UnifyUserAndNotesAndComment travelNotesAndUser = travelNotesService.getTravelNotes(n_id);
        model.addAttribute("travelNotesAndUser",travelNotesAndUser);
        return "checkTravel";
    }
    /*
    查询此登陆用户的所有游记
     */
    @RequestMapping("/travelNotesList")
    public String travelNotesList(Model model,HttpSession session){
        User user = (User) session.getAttribute("useri");
        String str=user.getDeng();
        String ss = str.substring(0,str.length()-(str.substring(3)).length())+"****"+str.substring(7);
        model.addAttribute("deng1",ss);
        List<TravelNotes> notesList = travelNotesService.findTravelNotesListAndUserByUsername(user.getId());
        model.addAttribute("notesList",notesList);
        return "travel_notes_list";
    }

    /*
    根据id查询游记
   */
    @RequestMapping("/getTravelNotesByNid")
    public String getTravelNotesByNid(int n_id,Model model,HttpSession session){
        User user = (User) session.getAttribute("useri");
        String str=user.getDeng();
        String ss = str.substring(0,str.length()-(str.substring(3)).length())+"****"+str.substring(7);
        model.addAttribute("deng1",ss);
        //查询单个游记
        UnifyUserAndNotesAndComment travelNotesAndUser = travelNotesService.getTravelNotes(n_id);
        model.addAttribute("travelNotesAndUser",travelNotesAndUser);
        //根据ID查询评论
        List<TravelComment> commentList = travelCommentService.findTravelCommentList(n_id);
        model.addAttribute("commentList",commentList);
        return "checkTravel";
    }
    /*
    回显游记页面
    */
    @RequestMapping("/travelNotesUpdate")
    public String travelNotesUpdate(int n_id,Model model,HttpSession session){
        User user = (User) session.getAttribute("useri");
        String str=user.getDeng();
        String ss = str.substring(0,str.length()-(str.substring(3)).length())+"****"+str.substring(7);
        model.addAttribute("deng1",ss);
        UnifyUserAndNotesAndComment travelNotesByNid = travelNotesService.getTravelNotesByNid(n_id);
        model.addAttribute("travelNotesByNid",travelNotesByNid);
        return "travelUpdate";
    }
    /*
    修改游记
     */
    @RequestMapping("/updateTravelNotes")
    public String updateTravelNotes(TravelNotes travelNotes, HttpSession session,Model model){
        User user = (User) session.getAttribute("useri");
        String str=user.getDeng();
        String ss = str.substring(0,str.length()-(str.substring(3)).length())+"****"+str.substring(7);
        model.addAttribute("deng1",ss);
        Date n_releaseDate = travelNotes.getN_releaseDate();
        System.out.println(n_releaseDate+"------------");
        travelNotes.setN_releaseDate(n_releaseDate);
        travelNotes.setN_updateDate(new Date());
        travelNotesService.updateTravelNotes(travelNotes);
        int n_id = travelNotes.getN_id();
        session.setAttribute("n_id",n_id);
        return "travelreview";
    }

}
