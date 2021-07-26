package com.task.myBoard.store.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDto {
    private Long docId;
    private String isDel;
    private String regUser;
    private String subject;
    private int hits;
    private String regDt;
    private String editDt;
    private String content;
}
