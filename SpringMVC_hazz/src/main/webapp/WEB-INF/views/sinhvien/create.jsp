<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quản lý tốt nghiệp</title>
</head>
<body>
<div class="row">
    <div class="col-lg-12 col-md-12 col-sm-12 card">
        <h1 class="text-center card-header">Nhập thông tin Tốt nghiệp và Sinh viên</h1>
        <div class="card-body">
            <form:form action="${pageContext.request.contextPath}/sv" method="POST" modelAttribute="thongtinForm">
                <!-- Thông báo lỗi nếu có -->
                <c:if test="${not empty error}">
                    <div class="alert alert-danger">${error}</div>
                </c:if>

                <!-- Phần thông tin sinh viên -->
                <h3>Thông tin Sinh viên</h3>
                <div class="form-group">
                    <label>Số CMND <span class="text-danger">*</span></label>
                    <form:input path="soCMND" class="form-control" required="required" placeholder="Nhập Số CMND"/>
                    <form:errors path="soCMND" cssClass="text-danger"/>
                </div>
                <div class="form-group">
                    <label>Họ tên <span class="text-danger">*</span></label>
                    <form:input path="hoTen" class="form-control" required="required" placeholder="Nhập Họ tên"/>
                    <form:errors path="hoTen" cssClass="text-danger"/>
                </div>
                <div class="form-group">
                    <label>Email <span class="text-danger">*</span></label>
                    <form:input type="email" path="email" class="form-control" required="required" placeholder="Nhập Email"/>
                    <form:errors path="email" cssClass="text-danger"/>
                </div>
                <div class="form-group">
                    <label>Số điện thoại <span class="text-danger">*</span></label>
                    <form:input path="soDT" class="form-control" required="required" placeholder="Nhập Số điện thoại"/>
                    <form:errors path="soDT" cssClass="text-danger"/>
                </div>
                <div class="form-group">
                    <label>Địa chỉ <span class="text-danger">*</span></label>
                    <form:input path="diaChi" class="form-control" required="required" placeholder="Nhập Địa chỉ"/>
                    <form:errors path="diaChi" cssClass="text-danger"/>
                </div>

                <!-- Phần thông tin tốt nghiệp -->
                <h3>Thông tin Tốt nghiệp</h3>
                <div class="form-group">
                    <label>Mã trường <span class="text-danger">*</span></label>
                    <form:select path="maTruong" class="form-control" required="required">
                        <form:option value="">-- Chọn mã trường --</form:option>
                        <form:options items="${truong}" itemValue="maTruong" itemLabel="maTruong"/>
                    </form:select>
                    <form:errors path="maTruong" cssClass="text-danger"/>
                </div>
                <div class="form-group">
                    <label>Mã ngành <span class="text-danger">*</span></label>
                    <form:select path="maNganh" class="form-control" required="required">
                        <form:option value="">-- Chọn mã ngành --</form:option>
                        <form:options items="${nganh}" itemValue="maNganh" itemLabel="maNganh"/>
                    </form:select>
                    <form:errors path="maNganh" cssClass="text-danger"/>
                </div>
                <div class="form-group">
                    <label>Hệ tốt nghiệp <span class="text-danger">*</span></label>
                    <form:input path="heTN" class="form-control" required="required" placeholder="Nhập hệ tốt nghiệp"/>
                    <form:errors path="heTN" cssClass="text-danger"/>
                </div>
                <div class="form-group">
                    <label>Ngày tốt nghiệp <span class="text-danger">*</span></label>
                    <form:input type="date" path="ngayTN" class="form-control" required="required" placeholder="Chọn ngày tốt nghiệp"/>
                    <form:errors path="ngayTN" cssClass="text-danger"/>
                </div>
                <div class="form-group">
                    <label>Loại tốt nghiệp <span class="text-danger">*</span></label>
                    <form:input path="loaiTN" class="form-control" required="required" placeholder="Nhập loại tốt nghiệp"/>
                    <form:errors path="loaiTN" cssClass="text-danger"/>
                </div>

                <!-- Nút submit -->
                <div class="box-footer">
                    <button type="submit" class="btn btn-primary">Lưu</button>
                    <a href="${pageContext.request.contextPath}/sv" class="btn btn-secondary">Hủy</a>
                </div>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>