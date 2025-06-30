<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dsi
  Date: 1/31/24
  Time: 5:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Home page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="front_view">EMS</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="home">Show Employee</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page"  href="add_Emp">Add Employee</a>
                </li>
            </ul>
            <ul class="nav navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" href="add_des">Add Designation</a>
                </li>
            </ul>
            <ul class="nav navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="view_des">View all Designation</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="card">
                <div class="card-header text-center ">
                    <h4> All Designation Details </h4>
                    <c:if test="${not empty msg}">
                        <h5 class="text-success">${msg}</h5>
                        <c:remove var="msg"/>
                    </c:if>
                </div >
                <div class="card-body">
                    <table class="table">
                        <thead>
                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Designation Name</th>
                            <th scope="col">Salary</th>
                            <th scope="col">Details</th>
                            <th scope="col">Action</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${details}" var="emp">
                            <tr>
                                <th scope="row">${emp.d_Id}</th>
                                <td>${emp.designationName}</td>
                                <td>${emp.salary}</td>
                                <td>${emp.details}</td>
                                <td>
                                    <a href="Edit_des/${emp.d_Id}" class="btn btn-sm btn-primary">Edit</a>
                                    <a href="deleteDes/${emp.d_Id}" class="btn btn-sm btn-danger">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
