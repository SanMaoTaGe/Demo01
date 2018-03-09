package com.vincent.dao.impl;

import com.vincent.bean.Customer;
import com.vincent.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author Vincent
 * @Description:
 * @create 2018-03-04 14:24
 */

@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(Customer customer) {
        this.hibernateTemplate.save(customer);
        System.out.println("CustomerDaoImpl#save......");
    }
}
