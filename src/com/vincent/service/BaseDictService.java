package com.vincent.service;

import com.vincent.bean.BaseDict;

import java.util.List;

/**
 * @author Vincent
 * @Description:
 * @create 2018-03-04 16:52
 */
public interface BaseDictService {
    List<BaseDict> findByType(String type);
}
