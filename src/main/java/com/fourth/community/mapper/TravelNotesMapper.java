package com.fourth.community.mapper;

import com.fourth.community.bean.TravelNotes;
import com.fourth.community.bean.UnifyUserAndNotesAndComment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 染熙 on 2017/8/8.
 * 操作与游记相关的数据
 */
@Mapper
@Component
public interface TravelNotesMapper {
    /*
    添加新的游记
     */
    int addTravelNotes(TravelNotes travelNotes);
    /*
   查询新添加的游记
    */
    UnifyUserAndNotesAndComment getTravelNotes(int n_id);
    /*
    查询所有的游记
     */
    List<TravelNotes> findTravelNotesListAndUserByUsername(int user_id);
    /*
    查询该登录用户去过的城市
     */
    List<TravelNotes> findTravelNotesByCity(int user_id);
    /*
   根据ID查询游记
    */
    UnifyUserAndNotesAndComment getTravelNotesByNid(int n_id);
    /*
    修改游记
     */
    void updateTravelNotes(TravelNotes travelNotes);
}
