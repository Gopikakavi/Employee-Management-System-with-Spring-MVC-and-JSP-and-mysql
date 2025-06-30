package com.dsi.dao;

import com.dsi.entity.EmployeeDetails;

import java.util.List;

public interface EmpDao{
    public void save(EmployeeDetails details);
    public EmployeeDetails getDetailsById(int id);
    public List<EmployeeDetails> getAllEmp();
    public void update(EmployeeDetails details);
    public void delete(int id);

    List<EmployeeDetails> getAllEmpByDept(String department);
}
