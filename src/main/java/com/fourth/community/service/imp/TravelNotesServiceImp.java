package com.fourth.community.service.imp;

import com.fourth.community.bean.TravelNotes;
import com.fourth.community.bean.UnifyUserAndNotesAndComment;
import com.fourth.community.mapper.TravelNotesMapper;
import com.fourth.community.service.TravelNotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 染熙 on 2017/8/8.
 */
@Service
public class TravelNotesServiceImp implements TravelNotesService {

    @Autowired
    private TravelNotesMapper travelNotesMapper;

    @Override
    public int addTravelNotes(TravelNotes travelNotes) {
        int id = travelNotesMapper.addTravelNotes(travelNotes);
        return id;
    }

    @Override
    public UnifyUserAndNotesAndComment getTravelNotes(int n_id) {
        return travelNotesMapper.getTravelNotes(n_id);
    }

    @Override
    public List<TravelNotes> findTravelNotesListAndUserByUsername(int user_id) {
        return travelNotesMapper.findTravelNotesListAndUserByUsername(user_id);
    }

    @Override
    public List<TravelNotes> findTravelNotesByCity(int user_id) {
        return travelNotesMapper.findTravelNotesByCity(user_id);
    }

    @Override
    public UnifyUserAndNotesAndComment getTravelNotesByNid(int n_id) {
        return travelNotesMapper.getTravelNotesByNid(n_id);
    }

    @Override
    public void updateTravelNotes(TravelNotes travelNotes) {
        travelNotesMapper.updateTravelNotes(travelNotes);
    }
}
