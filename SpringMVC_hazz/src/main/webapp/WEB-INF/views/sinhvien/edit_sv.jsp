<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chỉnh sửa sinh viên</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 card">
            <h1 class="text-center card-header">Chỉnh sửa Sinh viên</h1>
            <div class="card-body">
                <form:form action="${pageContext.request.contextPath}/sv/edit/${sinhvien.soCMND}" method="POST" modelAttribute="sinhvien">
                    <div class="form-group <c:if test="${not empty fieldErrors.soCMND}">has-error</c:if>">
                        <label>Số CMND <span class="text-danger">*</span></label>
                        <form:input path="soCMND" class="form-control" readonly="true" required="true"/>
                        <form:errors path="soCMND" cssClass="text-danger"/>
                    </div>
                    
                    <div class="form-group <c:if test="${not empty fieldErrors.hoTen}">has-error</c:if>">
                        <label>Họ tên <span class="text-danger">*</span></label>
                        <form:input path="hoTen" class="form-control" required="true"/>
                        <form:errors path="hoTen" cssClass="text-danger"/>
                    </div>
                    
                    <div class="form-group <c:if test="${not empty fieldErrors.email}">has-error</c:if>">
                        <label>Email <span class="text-danger">*</span></label>
                        <form:input path="email" class="form-control" required="true"/>
                        <form:errors path="email" cssClass="text-danger"/>
                    </div>
                    
                    <div class="form-group <c:if test="${not empty fieldErrors.diaChi}">has-error</c:if>">
                        <label>Địa chỉ <span class="text-danger">*</span></label>
                        <form:input path="diaChi" class="form-control" required="true"/>
                        <form:errors path="diaChi" cssClass="text-danger"/>
                    </div>
                    
                    <div class="form-group <c:if test="${not empty fieldErrors.soDT}">has-error</c:if>">
                        <label>Số điện thoại <span class="text-danger">*</span></label>
                        <form:input path="soDT" class="form-control" required="true"/>
                        <form:errors path="soDT" cssClass="text-danger"/>
                    </div>
                    
                    <div class="box-footer">
                        <button type="submit" class="btn btn-primary">Cập nhật</button>
                        <a href="${pageContext.request.contextPath}/sv" class="btn btn-secondary">Hủy</a>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>