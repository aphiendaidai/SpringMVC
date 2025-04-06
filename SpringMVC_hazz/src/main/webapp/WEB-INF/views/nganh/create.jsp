<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quản lý ngành học</title>
</head>
<body>
<div class="row">
    <div class="col-lg-6 col-md-6 col-sm-6 container justify-content-center card">
        <h1 class="text-center">Tạo Ngành học mới</h1>
        <div class="card-body">
            <form:form action="${pageContext.request.contextPath}/nganh" method="POST" modelAttribute="nganhs">
                <div class="form-group">
                    <label>Mã Ngành:</label>
                    <form:input
                        type="text"
                        path="maNganh"
                        class="form-control"
                        placeholder="Nhập mã ngành" 
                    />
                </div>
                
                <div class="form-group">
                    <label>Tên ngành</label>
                    <form:input
                        type="text"
                        path="tenNganh"
                        class="form-control"
                        placeholder="Nhập tên ngành" 
                    />
                </div>
                
                <div class="form-group">
                    <label>Loại ngành</label>
                    <form:input
                        type="text"
                        path="loaiNganh"
                        class="form-control"
                        placeholder="Nhập loại ngành" 
                    />
                </div>
                <div class="box-footer">
                    <button type="submit" class="btn btn-primary">
                        Submit
                    </button>
                </div>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>