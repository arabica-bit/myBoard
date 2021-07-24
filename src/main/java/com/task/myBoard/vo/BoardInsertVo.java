package com.task.myBoard.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardInsertVo {
    private String reg_user;
    private String subject;
    private String content;

    @Override
    public String toString() {
        return "BoardInsertVo{" +
                "reg_user='" + reg_user + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
