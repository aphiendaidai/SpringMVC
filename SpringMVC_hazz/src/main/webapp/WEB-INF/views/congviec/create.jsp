<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quản lý Công việc</title>
</head>
<body>
<div class="row">
    <div class="col-lg-6 col-md-6 col-sm-6 container justify-content-center card">
        <h1 class="text-center">Tạo mới công việc</h1>
        <div class="card-body">
            <form:form action="${pageContext.request.contextPath}/congviec" method="POST" modelAttribute="congviecs">
                <!-- Chứng minh nhân dân (Dropdown từ SinhVien) -->
                <div class="form-group">
                    <label>Chứng minh nhân dân</label>
                    <form:select path="soCMND" class="form-control">
                        <option value="">-- Chọn CMND --</option>
                        <c:forEach var="sv" items="${sinhVien}">
                            <option value="${sv.soCMND}">${sv.soCMND}</option>
                        </c:forEach>
                    </form:select>
                </div>

                <!-- Ngày vào công ty -->
                <div class="form-group">
                    <label>Ngày vào công ty</label>
                    <form:input type="date" path="ngayVaoCongTy" 
                               class="form-control" 
                               placeholder="Chọn ngày vào công ty"/>
                </div>

                <!-- Mã ngành (Dropdown từ Nganh) -->
                <div class="form-group">
                    <label>Mã ngành</label>
                    <form:select path="maNganh" class="form-control">
                        <option value="">-- Chọn mã ngành --</option>
                        <c:forEach var="n" items="${nganh}">
                            <option value="${n.maNganh}">${n.maNganh}</option>
                        </c:forEach>
                    </form:select>
                </div>

                <!-- Tên công việc -->
                <div class="form-group">
                    <label>Tên công việc</label>
                    <form:input type="text" path="tenCongViec" 
                               class="form-control" 
                               placeholder="Nhập tên công việc"/>
                </div>

                <!-- Tên công ty -->
                <div class="form-group">
                    <label>Tên công ty</label>
                    <form:input type="text" path="tenCongTy" 
                               class="form-control" 
                               placeholder="Nhập tên công ty"/>
                </div>

                <!-- Địa chỉ công ty -->
                <div class="form-group">
                    <label>Địa chỉ công ty</label>
                    <form:input type="text" path="diaChiCongTy" 
                               class="form-control" 
                               placeholder="Nhập địa chỉ công ty"/>
                </div>

                <!-- Thời gian làm việc -->
                <div class="form-group">
                    <label>Thời gian làm việc</label>
                    <form:input type="text" path="thoiGianLamViec" 
                               class="form-control" 
                               placeholder="Nhập thời gian làm việc"/>
                </div>

                <!-- Nút submit -->
                <div class="box-footer">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form:form>
        </div>
    </div>
</div>

<!-- Bootstrap JS (nếu cần toggle navbar) -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>