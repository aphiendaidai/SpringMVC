<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chỉnh sửa công việc</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 card">
            <h1 class="text-center card-header">Chỉnh sửa Công việc</h1>
            <div class="card-body">
                <form:form action="${pageContext.request.contextPath}/congviec/edit/${congviec.soCMND}" method="POST" modelAttribute="congviec">
                    <div class="form-group <c:if test="${not empty fieldErrors.soCMND}">has-error</c:if>">
                        <label>Số CMND <span class="text-danger">*</span></label>
                        <form:input path="soCMND" class="form-control" readonly="true" required="true"/>
                        <span class="text-danger"><form:errors path="soCMND"/></span>
                    </div>
                    
                    <div class="form-group <c:if test="${not empty fieldErrors.ngayVaoCongTy}">has-error</c:if>">
                        <label>Ngày vào công ty <span class="text-danger">*</span></label>
                        <form:input path="ngayVaoCongTy" class="form-control" readonly="true" required="true"/>
                        <span class="text-danger"><form:errors path="ngayVaoCongTy"/></span>
                    </div>
                    
                    <div class="form-group <c:if test="${not empty fieldErrors.maNganh}">has-error</c:if>">
                        <label>Mã Ngành <span class="text-danger">*</span></label>
                        <form:input path="maNganh" class="form-control" readonly="true" required="true"/>
                        <span class="text-danger"><form:errors path="maNganh"/></span>
                    </div>
                    
                    <div class="form-group <c:if test="${not empty fieldErrors.tenCongViec}">has-error</c:if>">
                        <label>Tên Công Việc <span class="text-danger">*</span></label>
                        <form:input path="tenCongViec" class="form-control" required="true"/>
                        <span class="text-danger"><form:errors path="tenCongViec"/></span>
                    </div>
                    
                    <div class="form-group <c:if test="${not empty fieldErrors.tenCongTy}">has-error</c:if>">
                        <label>Tên công ty <span class="text-danger">*</span></label>
                        <form:input path="tenCongTy" class="form-control" required="true"/>
                        <span class="text-danger"><form:errors path="tenCongTy"/></span>
                    </div>
                    
                    <div class="form-group <c:if test="${not empty fieldErrors.diaChiCongTy}">has-error</c:if>">
                        <label>Địa chỉ công ty <span class="text-danger">*</span></label>
                        <form:input path="diaChiCongTy" class="form-control" required="true"/>
                        <span class="text-danger"><form:errors path="diaChiCongTy"/></span>
                    </div>
                    
                    <div class="form-group <c:if test="${not empty fieldErrors.thoiGianLamViec}">has-error</c:if>">
                        <label>Thời gian làm việc <span class="text-danger">*</span></label>
                        <form:input path="thoiGianLamViec" class="form-control" required="true"/>
                        <span class="text-danger"><form:errors path="thoiGianLamViec"/></span>
                    </div>
                    
                    <div class="box-footer">
                        <button type="submit" class="btn btn-primary">Cập nhật</button>
                        <a href="${pageContext.request.contextPath}/congviec" class="btn btn-secondary">Hủy</a>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>