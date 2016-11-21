/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import com.model.emp.Employee;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author shadowman
 */
@Controller
public class HelloController {
    @InitBinder
    public void myInitbinder(WebDataBinder binder){
        binder.setDisallowedFields(new String[]{"emplMobile"});
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, "empDob", new CustomDateEditor(sdf, false));
    }
    
    @RequestMapping(value="/")
    public String helloMessage(ModelMap mMap){
        
        mMap.addAttribute("hello","Hello Spring MVC");
        
        return "index";
    }
     @RequestMapping(value="/add",method=RequestMethod.GET)
    public String showEmployee(){
        return "addemployee";
    }
    @RequestMapping(value="/add",method=RequestMethod.POST)
    public String addEmployee(ModelMap mMap,/*@RequestParam("ename") String ename,@RequestParam("eaddress") String eaddress*/
            @ModelAttribute("employee") Employee employee,BindingResult result){
        //mMap.addAttribute("edetails","Name:"+ename+"Adress:"+eaddress);
        /*Employee employee=new Employee();
        employee.setEname(ename);
        employee.setEaddress(eaddress);
       mMap.addAttribute("employee",employee);*/
       if(result.hasErrors()){
             return "addemployee";
        }
        return "einfo";
    }
    
}
