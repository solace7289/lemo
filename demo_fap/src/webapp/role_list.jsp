<%-- 
    Document   : index
    Created on : Aug 15, 2023, 10:39:23 AM
    Author     : liquidrekto
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Role list</title>
        <style>
            table {
                border-collapse: collapse;
            }
            td, th {
                width: 10%;
                border: 1px solid black;
                
            }
        </style>
    </head>
    
    <body>
        <h1>FAP</h1>

        <table>
            <tr>
                <th>ID</th>
                <th>Role name</th>
            </tr>
            <c:forEach items="${rolesList.getContent()}" var="s">
                <tr>
                    <td>${s.getRoleId()}</td>
                    <td>${s.Name()}</td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
