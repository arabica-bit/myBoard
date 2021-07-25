package com.task.myBoard.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardInsertVo {
    private String reg_user;
    private String subject;
    private String content;
    private String edit_user;

}
