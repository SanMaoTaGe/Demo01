package com.vincent.dao;

import com.vincent.bean.BaseDict;

import java.util.List;

/**
 * @author Vincent
 * @Description:
 * @create 2018-03-04 17:06
 */
public interface BaseDictDao {
    List<BaseDict> findByType(String type);
}
