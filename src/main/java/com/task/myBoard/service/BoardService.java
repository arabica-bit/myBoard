package com.task.myBoard.service;

import com.task.myBoard.store.dao.BoardDao;
import com.task.myBoard.store.dao.BoardDto;
import com.task.myBoard.utils.TimeFormatUtil;
import com.task.myBoard.vo.BoardInsertVo;
import com.task.myBoard.vo.ResVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Slf4j
@Component
public class BoardService {

    @Autowired
    BoardDao boardDao;

    public ResVo boardInsert(BoardInsertVo body){
        //Service Status
        ResVo resVo = new ResVo("1");

        BoardDto input = new BoardDto();
        input.setIsDel("N");
        input.setRegUser(body.getReg_user());
        input.setSubject(body.getSubject());
        input.setHits(0);
        input.setRegDt(TimeFormatUtil.getTimeStamp());
        input.setEditDt(null);
        input.setContent(body.getContent());

        int ret = boardDao.insertOne(input);
        log.info("insertOne result [" + ret + "]");
        Long docId = input.getDocId();


        if(ret > 0) resVo.setStatus("0");
        HashMap result = resVo.getResult();
        result.put("docId", docId);
        return resVo;
    }


    public ResVo boardUpdate(Long id, BoardInsertVo body){
        //Service Status
        ResVo resVo = new ResVo("1");

        BoardDto input = new BoardDto();
        input.setDocId(id);
        input.setRegUser(body.getEdit_user());
        input.setSubject(body.getSubject());
        input.setContent(body.getContent());

        int ret = boardDao.updateOne(input);
        log.info("updateOne result [" + ret + "]");

        if(ret > 0) resVo.setStatus("0");
        return resVo;
    }


    public ResVo boardSelect(Long id){
        //Service Status
        ResVo resVo = new ResVo("1");

        BoardDto board = boardDao.selectOne(id);

        if(board != null){
            resVo.setStatus("0");
            HashMap result = resVo.getResult();
            result.put("isDel", board.getIsDel());
            result.put("regUser", board.getRegUser());
            result.put("subject", board.getSubject());
            result.put("hits", board.getHits());
            result.put("regDt", board.getRegDt());
            result.put("editDt", board.getEditDt());
            result.put("content", board.getContent());
        }

        return resVo;
    }

    public ResVo boardChangeStatus(Long id, BoardInsertVo body){
        //Service Status
        ResVo resVo = new ResVo("1");

        BoardDto input = new BoardDto();
        input.setDocId(id);
        input.setRegUser(body.getEdit_user());
        input.setIsDel("Y");

        int ret = boardDao.changeStatus(input);
        log.info("changeStatus result [" + ret + "]");

        if(ret > 0) resVo.setStatus("0");
        return resVo;
    }

    public ResVo boardDelete(Long id, BoardInsertVo body){
        //Service Status
        ResVo resVo = new ResVo("1");

        BoardDto input = new BoardDto();
        input.setDocId(id);
        input.setRegUser(body.getEdit_user());

        int ret = boardDao.deleteOne(input);
        log.info("deleteOne result [" + ret + "]");

        if(ret > 0) resVo.setStatus("0");
        return resVo;
    }

}
