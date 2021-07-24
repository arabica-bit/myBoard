package com.task.myBoard.service;

import com.task.myBoard.vo.ResVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Slf4j
@Component
public class BoardService {

    public ResVo boardInsert(){
        ResVo resVo = new ResVo("0");
        HashMap result = resVo.getResult();
        result.put("docId", 51);
        return resVo;
    }

    public ResVo boardSelect(){
        ResVo resVo = new ResVo("0");
        HashMap result = resVo.getResult();
        result.put("docId", 51);
        result.put("subject", "new document");
        result.put("content", "this is content");
        result.put("reg_dt", "2021-07-25");
        return resVo;
    }

    public ResVo boardUpdate(){
        ResVo resVo = new ResVo("0");
        return resVo;
    }

    public ResVo boardDelete(){
        ResVo resVo = new ResVo("0");
        return resVo;
    }

}
