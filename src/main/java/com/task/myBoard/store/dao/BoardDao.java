package com.task.myBoard.store.dao;

import com.task.myBoard.store.dto.BoardDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {

    @Autowired
    private SqlSession sqlSession;

    public int insertOne(BoardDto boardDto){
        return sqlSession.insert("insertOne", boardDto);
    }

    public int updateOne(BoardDto boardDto){
        return sqlSession.update("updateOne", boardDto);
    }

    public BoardDto selectOne(Long docId){
        return sqlSession.selectOne("selectOne", docId);
    }

    public int changeStatus(BoardDto boardDto){
        return sqlSession.update("changeStatus", boardDto);
    }

    public int deleteOne(BoardDto boardDto){
        return sqlSession.delete("deleteOne", boardDto);
    }


}
