package com.dsi.dao;

import com.dsi.entity.DesignationDetails;

import java.util.List;

public interface EmployeeDesignationDao {
    public void save(DesignationDetails designation);
    public List<DesignationDetails> getAllDetails();
    public DesignationDetails getDesignationById(int id);
    public void editDesignation(DesignationDetails designationDetails);
    public void deleteDesignation(int id);
}
