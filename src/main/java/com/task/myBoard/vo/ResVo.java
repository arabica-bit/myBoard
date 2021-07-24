package com.task.myBoard.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;


public class ResVo {
    @Getter @Setter
    private String status;
    @Setter
    private HashMap<String,Object> result;

    public ResVo(String status){
        this.status = status;
        this.result = new HashMap<>();
    }

    public ResVo(String status, HashMap result){
        this.status = status;
        this.result = result;
    }

    public HashMap<String,Object> getResult(){
        if(result == null || result.isEmpty()){
            result = new HashMap<>();
        }
        return result;
    }

}
