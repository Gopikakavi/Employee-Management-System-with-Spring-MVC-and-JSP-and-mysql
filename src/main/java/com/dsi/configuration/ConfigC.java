package com.dsi.configuration;

import com.dsi.dao.EmpDaoImp;
import com.dsi.dao.EmployeeDesignationDaoImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;


@Controller
@ComponentScan({"com.dsi.controller"})//pointing towards the path of controller
public class ConfigC {
    @Bean
    public EmpDaoImp EmpBean()
    {
        EmpDaoImp imp = new EmpDaoImp();
        return imp;
    }
    @Bean
    public EmployeeDesignationDaoImp EmpDesImp(){
        return new EmployeeDesignationDaoImp();
    }
}
