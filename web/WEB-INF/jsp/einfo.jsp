<%-- 
    Document   : einfo
    Created on : Nov 14, 2016, 11:33:58 PM
    Author     : shadowman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table> 
            <tr>
                <td>Employee Name:</td>
                <td>${employee.ename}</td>
            </tr>
            <tr>
                <td>Employee Name:</td>
                <td>${employee.eaddress}</td>
            </tr>
            <tr>
                <td>Employee Mobile:</td>
                <td>${employee.emplMobile}</td>
            </tr>
            <tr>
                <td>Employee Date of Birth:</td>
                <td>${employee.empDob}</td>
            </tr>
            <tr>
                <td>Dept id</td>
                <td>${employee.department.deptId}
                </td>
            </tr>
            <tr>
                <td>Employee skills:</td>
                <td>${employee.department.deptName}
                </td>
            </tr>


            <tr>
                <td>Employee skills:</td>
                <td>${employee.skillList}
                </td>
            </tr> 
        </table>

    </body>
</html>
