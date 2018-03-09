package com.vincent.service.impl;

import com.vincent.bean.BaseDict;
import com.vincent.dao.BaseDictDao;
import com.vincent.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Vincent
 * @Description:
 * @create 2018-03-04 17:04
 */
@Component
public class BaseDictServiceImpl implements BaseDictService {

    @Autowired
    private BaseDictDao baseDictDao;
    @Override
    public List<BaseDict> findByType(String type) {

        return baseDictDao.findByType(type);
    }
}
