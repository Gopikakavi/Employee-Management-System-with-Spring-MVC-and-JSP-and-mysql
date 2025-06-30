package com.dsi.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity

public class DesignationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int d_Id;
    private String designationName;
    private double salary;
    private String details;
    @OneToMany(mappedBy = "designationDetails", cascade = CascadeType.ALL)
    private List<EmployeeDetails> employeeDetails;

    public int getD_Id() {
        return d_Id;
    }

    public void setD_Id(int designationId) {
        this.d_Id = designationId;
    }

    public List<EmployeeDetails> getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(List<EmployeeDetails> employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    public String getDesignationName() {
        return designationName;
    }

    public void setDesignationName(String designation) {
        this.designationName = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "designation{" +
                "designation='" + designationName + '\'' +
                ", salary=" + salary +
                ", details='" + details + '\'' +
                '}';
    }
}
