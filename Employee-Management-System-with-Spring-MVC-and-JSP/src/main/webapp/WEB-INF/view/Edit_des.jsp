<%--
  Created by IntelliJ IDEA.
  User: dsi
  Date: 2/1/24
  Time: 11:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Edit designation</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href="front_view">Emp Management System</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="${pageContext.request.contextPath}/add_Emp">Add Employee</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <div class="card">
                <div class="card-header text-center">
                    <h3> Edit Designation details</h3>
                    <c:if test="${not empty msg}">
                        <h5>${msg}</h5>
                        <c:remove var="msg"/>
                    </c:if>
                </div>
                <div class="card-body">
                    <form action="${pageContext.request.contextPath}/updateDes" method="post">
                        <div class="mb-3">
                            <label> Enter Designation Name</label>
                            <input type="hidden" name="d_Id" class="form-control" value="${details.d_Id}">
                            <input type="text" name="designationName" class="form-control" value="${details.designationName}">
                        </div>
                        <div class="mb-3">
                            <label> Enter Salary</label>
                            <input type="number" name="salary" class="form-control" value="${details.salary}">
                        </div>
                        <div class="mb-3">
                            <label> Enter Details</label>
                            <input type="text" name="details" class="form-control" value="${details.details}">
                        </div>
                        <button class="btn btn-primary">Update</button>
                    </form>
                </div>

            </div>
        </div>
    </div>

</div>
</body>
</html>
