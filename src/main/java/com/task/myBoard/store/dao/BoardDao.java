package com.task.myBoard.store.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BoardDao {

    @Autowired
    private SqlSession sqlSession;

    public int insertOne(BoardDto boardDto){
        return sqlSession.insert("insertOne", boardDto);
    }

    public BoardDto selectOne(Long docId){
        return sqlSession.selectOne("selectOne", docId);
    }

}
