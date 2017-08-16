package com.fourth.findscenery.controller;

import com.fourth.findscenery.bean.Tourist_attractions;

import com.fourth.findscenery.service.Tourist_attractionsService;
import com.fourth.findscenery.util.PageCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 赵翰 on 2017/8/5.
 */
@Controller
public class FindScenery {

    @Autowired
    private Tourist_attractionsService tourist_attractionsService;


   /*
   分页查询
    */
  @RequestMapping("/findTourist")
  public ModelAndView findTourist(String address_Name,HttpServletRequest request,Integer currentPage,HttpSession session){
      if(currentPage==null){
          currentPage = 0;
      }
      Map<String,Object> map = (Map)session.getAttribute("map");
      if(address_Name!=null){
          map.put("address_Name",address_Name);
      }
      List<Tourist_attractions> list = tourist_attractionsService.findTouristList1(map);
      Integer listCount = list.size();
      Integer pageSize = 10;
      int pageCount =  listCount / pageSize + (listCount % pageSize != 0 ? 1 : 0);


      PageCount count = new PageCount();
      count.setCurrentPage(currentPage*pageSize);
      count.setPageSize(pageSize);
      map.put("page",count);

      List<Tourist_attractions> list1 = tourist_attractionsService.findTouristList1(map);
      map.remove("page");
      String [] pageArray = new String[4];

      pageArray[0] = "0";

      if(currentPage == 0){
          pageArray[1] = "0";
      }else{
          pageArray[1] = currentPage-1+"";
      }
      if (currentPage < pageCount - 1) {
          pageArray[2] = (currentPage+1)+"";
      } else {
          pageArray[2] = (pageCount-1)+"";
      }

      pageArray[3] = (pageCount-1)+"";

      request.setAttribute("firstPage", pageArray[0]);
      //上一页
      request.setAttribute("precursorPage", pageArray[1]);
      //下一页
      request.setAttribute("nextPage", pageArray[2]);
      //末页
      request.setAttribute("lastPage", pageArray[3]);
      //当前页
      request.setAttribute("currentPage", String.valueOf(currentPage + 1));
      //总页数
      request.setAttribute("pageCount", String.valueOf(pageCount));
      //总记录数
      request.setAttribute("listCount", listCount);
      request.setAttribute("name",address_Name);

      session.setAttribute("map",map);

      ModelAndView mv = new ModelAndView();
      mv.setViewName("sceneryList");
      mv.addObject("scenery",list1);
      String deng1 = (String) session.getAttribute("deng1");
      mv.addObject("deng1",deng1);

      return mv;
  }
  @RequestMapping("/findAsc")
  public ModelAndView findAsc(HttpSession session,HttpServletRequest request,Integer currentPage){
      if(currentPage==null){
          currentPage = 0;
      }
      Map<String,Object> map = (Map)session.getAttribute("map");

      List<Tourist_attractions> asc = tourist_attractionsService.findAsc(map);
      System.out.println(asc);
      Integer listCount = asc.size();
      Integer pageSize = 10;
      int pageCount =  listCount / pageSize + (listCount % pageSize != 0 ? 1 : 0);


      PageCount count = new PageCount();
      count.setCurrentPage(currentPage*pageSize);
      count.setPageSize(pageSize);
      map.put("page",count);

      List<Tourist_attractions> list1 = tourist_attractionsService.findAsc(map);
      map.remove("page");
      String [] pageArray = new String[4];

      pageArray[0] = "0";

      if(currentPage == 0){
          pageArray[1] = "0";
      }else{
          pageArray[1] = currentPage-1+"";
      }
      if (currentPage < pageCount - 1) {
          pageArray[2] = (currentPage+1)+"";
      } else {
          pageArray[2] = (pageCount-1)+"";
      }

      pageArray[3] = (pageCount-1)+"";

      request.setAttribute("firstPage", pageArray[0]);
      //上一页
      request.setAttribute("precursorPage", pageArray[1]);
      //下一页
      request.setAttribute("nextPage", pageArray[2]);
      //末页
      request.setAttribute("lastPage", pageArray[3]);
      //当前页
      request.setAttribute("currentPage", String.valueOf(currentPage + 1));
      //总页数
      request.setAttribute("pageCount", String.valueOf(pageCount));
      //总记录数
      request.setAttribute("listCount", listCount);

      session.setAttribute("map",map);

      ModelAndView mv = new ModelAndView();

      mv.setViewName("sceneryList");
      mv.addObject("scenery",list1);
      String deng1 = (String) session.getAttribute("deng1");
      mv.addObject("deng1",deng1);
      return mv;
  }

}

