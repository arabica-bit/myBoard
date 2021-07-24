package com.task.myBoard.controller;

import com.task.myBoard.service.BoardService;
import com.task.myBoard.utils.TimeFormatUtil;
import com.task.myBoard.vo.BoardInsertVo;
import com.task.myBoard.vo.ResVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.stream.Collectors;

@Slf4j
@RestController
public class BoardController {

    @Autowired
    BoardService boardService;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public ResVo connectionTest(@RequestHeader MultiValueMap<String, String> headers) throws Exception {
        log.info("------- TEST API : connection Test --------");
        headers.forEach((key, value) -> {
            log.info("Headers: key["+key+"],Value["+value.stream().collect(Collectors.joining("|"))+"].");
        });

        ResVo resVo = new ResVo("0");
        HashMap result = resVo.getResult();
        result.put("message", "connection OK");
        result.put("time", TimeFormatUtil.getTimeStamp());
        log.debug("return: " + result);

        return resVo;
    }

    @RequestMapping(value="/api/board/doc", method= RequestMethod.POST)
    public ResVo boardInsert(@RequestBody BoardInsertVo body) throws Exception {
        log.info("------- BOARD API: TAG[IF-MBY-001] --------");
        log.info(body.toString());

        //insert new doc
        ResVo resVo = boardService.boardInsert();

        return resVo;
    }

}
