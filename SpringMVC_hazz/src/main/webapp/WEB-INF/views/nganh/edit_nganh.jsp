<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chỉnh sửa ngành học</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 card">
            <h1 class="text-center card-header">Chỉnh sửa Ngành học</h1>
            <div class="card-body">
                <form:form action="${pageContext.request.contextPath}/nganh/edit/${nganh.maNganh}" method="POST" modelAttribute="nganh">
                    <div class="form-group <c:if test="${not empty fieldErrors.maNganh}">has-error</c:if>">
                        <label>Mã ngành <span class="text-danger">*</span></label>
                        <form:input path="maNganh" class="form-control" readonly="true" required="true" />
                        <span class="text-danger"><form:errors path="maNganh" /></span>
                    </div>
                    <div class="form-group <c:if test="${not empty fieldErrors.tenNganh}">has-error</c:if>">
                        <label>Tên ngành <span class="text-danger">*</span></label>
                        <form:input path="tenNganh" class="form-control" required="true" />
                        <span class="text-danger"><form:errors path="tenNganh" /></span>
                    </div>
                    <div class="form-group <c:if test="${not empty fieldErrors.loaiNganh}">has-error</c:if>">
                        <label>Loại ngành <span class="text-danger">*</span></label>
                        <form:input path="loaiNganh" class="form-control" required="true" />
                        <span class="text-danger"><form:errors path="loaiNganh" /></span>
                    </div>
                    
                    <div class="box-footer">
                        <button type="submit" class="btn btn-primary">Cập nhật</button>
                        <a href="${pageContext.request.contextPath}/nganh" class="btn btn-secondary">Hủy</a>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>