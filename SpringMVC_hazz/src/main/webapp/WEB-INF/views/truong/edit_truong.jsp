<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chỉnh sửa trường học</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 card">
            <h1 class="text-center card-header">Chỉnh sửa trường học</h1>
            <div class="card-body">
                <form:form action="${pageContext.request.contextPath}/truong/edit/${truong.maTruong}" method="POST" modelAttribute="truong">
                    <div class="form-group <c:if test="${not empty fieldErrors.maTruong}">has-error</c:if>">
                        <label>Mã trường <span class="text-danger">*</span></label>
                        <form:input path="maTruong" class="form-control" readonly="true" required="true" />
                        <span class="text-danger"><form:errors path="maTruong" /></span>
                    </div>
                    <div class="form-group <c:if test="${not empty fieldErrors.tenTruong}">has-error</c:if>">
                        <label>Tên Trường <span class="text-danger">*</span></label>
                        <form:input path="tenTruong" class="form-control" required="true" />
                        <span class="text-danger"><form:errors path="tenTruong" /></span>
                    </div>
                    <div class="form-group <c:if test="${not empty fieldErrors.diaChi}">has-error</c:if>">
                        <label>Địa chỉ <span class="text-danger">*</span></label>
                        <form:input path="diaChi" class="form-control" required="true" />
                        <span class="text-danger"><form:errors path="diaChi" /></span>
                    </div>
                   <div class="form-group <c:if test="${not empty fieldErrors.soDT}">has-error</c:if>">
                        <label>Số điện thoại <span class="text-danger">*</span></label>
                        <form:input path="soDT" class="form-control" required="true"/>
                        <form:errors path="soDT" cssClass="text-danger"/>
                    </div>
                    <div class="box-footer">
                        <button type="submit" class="btn btn-primary">Cập nhật</button>
                        <a href="${pageContext.request.contextPath}/truong" class="btn btn-secondary">Hủy</a>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>