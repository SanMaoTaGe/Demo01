package com.vincent.bean;

import javax.persistence.*;

/**
 * @author Vincent
 * @Description:
 * @create 2018-03-04 10:03
 */
@Entity
@Table(name = "cst_customer")
public class Customer {

    @Id
    @GeneratedValue
    private Long cust_id;

    private String cust_name;

    //表示这个客户属于哪一种来源 /行业/水平， 字典对象

   @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cust_source")
    private BaseDict cust_source;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cust_industry")
    private BaseDict cust_industry;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cust_level")
    private BaseDict cust_level;

    private String cust_image;

    private String cust_phone;
    private String cust_address;

    public Long getCust_id() {
        return cust_id;
    }

    public void setCust_id(Long cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_image() {
        return cust_image;
    }

    public void setCust_image(String cust_image) {
        this.cust_image = cust_image;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

}
