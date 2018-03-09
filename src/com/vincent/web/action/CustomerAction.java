package com.vincent.web.action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vincent.bean.Customer;
import com.vincent.service.CustomerService;
import com.vincent.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @author Vincent
 * @Description:
 * @create 2018-03-04 13:19
 */
@Controller
@Scope("prototype")
public class CustomerAction extends ActionSupport implements ModelDriven {

    private Customer customer;

    @Autowired
    private CustomerService customerService;

    @Override
    public Customer getModel() {
        //为什么一定要加这一句???
        if (customer == null) {
            customer = new Customer();
        }
        return customer;
    }

    public String save() {
        customerService.save(customer);
        System.out.println("customer.........." + customer);
        return NONE;
    }
}
