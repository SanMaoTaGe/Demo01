package com.vincent.service.impl;

import com.vincent.bean.Customer;
import com.vincent.dao.CustomerDao;
import com.vincent.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Vincent
 * @Description:
 * @create 2018-03-04 14:15
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerDao customerDao;

    @Override
    public void save(Customer customer) {
            customerDao.save(customer);
    }
}
