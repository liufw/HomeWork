package com.lagou.sqlSession;

import com.lagou.pojo.Configuration;
import com.lagou.pojo.MappedStatement;

import java.util.List;

public interface Executor {

    public <E> List<E> query(Configuration configuration,MappedStatement mappedStatement,Object... params) throws Exception;
    public void  add(Configuration configuration,MappedStatement mappedStatement,Object... params) throws Exception;
    public void  update(Configuration configuration,MappedStatement mappedStatement,Object... params) throws Exception;
    public void  delete(Configuration configuration,MappedStatement mappedStatement,Object... params) throws Exception;

}
