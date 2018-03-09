package com.vincent.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.vincent.bean.BaseDict;
import com.vincent.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Vincent
 * @Description:
 * @create 2018-03-04 16:32
 */
@Component
public class BaseDictAction extends ActionSupport {

    @Autowired
    private BaseDictService baseDictService;

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String findByType() {
        System.out.println("BaseDiciAction#findByPage..........type....."+type);
        List<BaseDict> list= baseDictService.findByType(type);
        System.out.println("action list...."+list);
        return NONE;
    }
}
