/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.emp;


import java.util.Date;
import java.util.List;
import javax.validation.constraints.Size;

/**
 *
 * @author shadowman
 */
public class Employee {

    @Size(min = 3, max = 10)
    private String ename;
    private String eaddress;

    private Long emplMobile;
    private Date empDob;
    private List<String> skillList;
    private Department department;

    public List<String> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<String> skillList) {
        this.skillList = skillList;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getEmpDob() {
        return empDob;
    }

    public void setEmpDob(Date empDob) {
        this.empDob = empDob;
    }

    public Long getEmplMobile() {
        return emplMobile;
    }

    public void setEmplMobile(Long emplMobile) {
        this.emplMobile = emplMobile;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

}
