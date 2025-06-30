package com.dsi.entity;

import jakarta.persistence.*;

@Entity
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String fullName;
    private String address;
    private String mail;
    @ManyToOne
    @JoinColumn(name = "Designation_fk", referencedColumnName = "d_Id")
    private DesignationDetails designationDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    public DesignationDetails getDesignationDetails() {
        return designationDetails;
    }

    public void setDesignationDetails(DesignationDetails designationDetails) {
        this.designationDetails = designationDetails;
    }

//    @Override
//    public String toString() {
//        return "EmployeeDetails{" + designationDetails.getDesignationName()+
//                ", fullName='" + fullName + '\'' +
//                ", address='" + address + '\'' +
//                ", mail='" + mail + '\''  +
//                '}';
//    }
}
