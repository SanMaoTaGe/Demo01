package com.vincent.dao.impl;

import com.vincent.bean.BaseDict;
import com.vincent.dao.BaseDictDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Vincent
 * @Description:
 * @create 2018-03-04 17:07
 */
@Component
@SuppressWarnings("all")
public class BaseDictDaoImpl implements BaseDictDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public List<BaseDict> findByType(String type) {
        String hql = "from BaseDict where dict_type_code=? ";

        return (List<BaseDict>) this.hibernateTemplate.find(hql, type);
    }
}
