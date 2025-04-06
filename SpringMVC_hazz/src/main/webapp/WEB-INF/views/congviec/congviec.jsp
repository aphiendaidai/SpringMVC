<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quản lý tốt nghiệp</title>
</head>
<body>
<div class="container mt-3">
    <!-- Tiêu đề & Nút thêm công việc -->
    <div class="row align-items-center">
        <div class="col-md-8">
            <h3 class="fw-bold text-primary">📋 Danh sách Công Việc</h3>
        </div>
        <div class="col-md-4 text-end">
            <a href="${pageContext.request.contextPath}/congviec/news" class="btn btn-success btn-sm">
                ➕ Thêm Công Việc
            </a>
        </div>
    </div>

    <!-- Bảng danh sách công việc -->
    <div class="table-responsive mt-3">
        <table class="table table-hover table-bordered text-center">
            <thead class="table-dark">
                <tr>
                    <th>Số CMND</th>
                    <th>Ngày vào công ty</th>
                    <th>Mã Ngành</th>
                    <th>Tên Công Việc</th>
                    <th>Tên Công Ty</th>
                    <th>Địa chỉ Công Ty</th>
                    <th>Thời gian làm việc</th>
                    <th>Hành động</th> 
                </tr>
            </thead>
            <tbody>
                <c:forEach var="cv" items="${congviec}">
                    <tr>
                        <td><c:out value="${cv.sinhVien != null ? cv.sinhVien.soCMND : 'Không có CMND'}" /></td>
                        <td><c:out value="${cv.ngayVaoCongTy}" /></td>
                        <td><c:out value="${cv.nganh != null ? cv.nganh.maNganh : 'Không có ngành'}" /></td>
                        <td><c:out value="${cv.tenCongViec}" /></td>
                        <td><c:out value="${cv.tenCongTy}" /></td>
                        <td><c:out value="${cv.diaChiCongTy}" /></td>
                        <td><c:out value="${cv.thoiGianLamViec}" /></td>
                        <td>
                            <a href="${pageContext.request.contextPath}/congviec/edit/${cv.sinhVien.soCMND}" class="btn btn-info btn-sm">✏️ Sửa</a>
                            <a href="${pageContext.request.contextPath}/congviec/${cv.sinhVien.soCMND}" class="btn btn-danger btn-sm">🗑️ Xóa</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>