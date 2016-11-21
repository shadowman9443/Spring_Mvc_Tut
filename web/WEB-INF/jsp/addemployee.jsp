<%-- 
    Document   : addemployee
    Created on : Nov 14, 2016, 10:59:53 PM
    Author     : shadowman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:errors path="employee.*"/> 
        <form method="post" action="/Spring_Mvc_Tut/add">
            <table>
                <tr> 
                    <td><label>Employee name</label></td>
                    <td><input type="text" name="ename"/></td>
                </tr>
                <tr> 
                    <td><label>Employee address</label></td>
                    <td><input type="text" name="eaddress"/></td>
                </tr>
                <tr> 
                    <td><label>Employee mobile</label></td>
                    <td><input type="text" name="emplMobile"/></td>
                </tr>
                <tr> 
                    <td><label>Employee Date of birth</label></td>
                    <td><input type="text" name="empDob"/></td>
                </tr>
                <tr> 
                    <td><label>Department id</label></td>
                    <td><input type="text" name="department.deptId"/></td>
                </tr>
                <tr> 
                    <td><label>Department Name</label></td>
                    <td><input type="text" name="department.deptName"/></td>
                </tr>
                <tr> 
                    <td><label>Skill</label></td>
                    <td> <select name="skillList" multiple="multiple">
                            <option value="Spring core">Spring Core</option>
                            <option value="Spring vola">Spring Core</option>
                            <option value="Spring chola">Spring Core</option>
                            <option value="Spring rola">Spring Core</option>

                        </select></td>
                </tr> 
                <tr> 
                    <td><input type="submit" value="submit"/></td>

                </tr>
            </table>




        </form>
    </body>
</html>
