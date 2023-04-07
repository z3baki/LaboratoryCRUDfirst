<%-- 
    Document   : InformationStudent
    Created on : Apr 7, 2023
    Author     : Sebastian Varela
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Information</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>Student Information</div>
        <form action="./StudentServlet" method="POST">
            <table>
                <tr>
                    <td>Student ID</td>>
                    <td><input type="text" name="studentId" value="${studen.studentId}"/></td>>
                </tr>
                <tr>
                    <td>First Name</td>>
                    <td><input type="text" name="firstname" value="${studen.firstname}"/></td>>
                </tr>
                <tr>
                    <td>Last Name</td>>
                    <td><input type="text" name="lastname" value="${studen.lastname}"/></td>>
                </tr>
                <tr>
                    <td>Year Level</td>>
                    <td><input type="text" name="yearLevel" value="${studen.yearLevel}"/></td>>
                </tr>
                <tr>
                <tr>
                    <td>Class ID</td>>
                    <td><input type="text" name="classid" value="${classes.classid}"/></td>>
                </tr>
                <tr>
                    <td>Class Name</td>>
                    <td><input type="text" name="classname" value="${classes.classname}"/></td>>
                </tr>
                <tr>
                    <td>Credits</td>>
                    <td><input type="text" name="credits" value="${classes.credits}"/></td>>
                </tr>
                <tr>
                    <td>Semester</td>>
                    <td><input type="text" name="semester" value="${classes.semester}"/></td>>
                </tr>
                <tr>
                    <td>Students Admited</td>>
                    <td><input type="text" name="admitedstudents" value="${classes.admitedstudents}"/></td>>
                </tr>
                <tr>
                    <td colspan ="2">
                        <input type="submit" name="action" value="Add" />
                        <input type="submit" name="action" value="Edit" />
                        <input type="submit" name="action" value="Delete" />
                        <input type="submit" name="action" value="Search" />
                    </td>>
                </tr>
            </table> 
        </form>
        <br>
        <table border="1">
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Year Level</th>
                <c:forEach items="${allStudents}" var="stud">
                <tr>
                    <td>${stud.studentId}</td>
                    <td>${stud.firstname}</td>
                    <td>${stud.lastname}</td>
                    <td>${stud.yearLevel}</td>
                </tr>
            </c:forEach>
        </table>        
        <br>
        <table border="1">
            <th>Class ID</th>
            <th>Class Name</th>
            <th>Credits</th>
            <th>Semester</th>
            <th>Admited Students</th>
                <c:forEach items="${allClasses}" var="class">
                <tr>
                    <td>${class.classid}</td>
                    <td>${class.classname}</td>
                    <td>${class.credits}</td>
                    <td>${class.semester}</td>
                    <td>${class.admitedstudents}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
