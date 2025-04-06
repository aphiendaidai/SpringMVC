<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container mt-3">
    <!-- Tiêu đề -->
    <div class="row align-items-center">
        <div class="col-md-8">
            <h3 class="fw-bold text-primary">Danh sách Sinh Viên</h3>
        </div>
        <div class="col-md-4 text-end">
            <a href="${pageContext.request.contextPath}/sv/search_sv" class="btn btn-outline-primary btn-sm">
                🔍 Tìm kiếm
            </a>
            <a href="${pageContext.request.contextPath}/sv/news" class="btn btn-success btn-sm">
                ➕ Thêm Sinh Viên
            </a>
        </div>
    </div>

    <!-- Bảng dữ liệu -->
    <div class="table-responsive mt-3">
        <table class="table table-hover table-bordered text-center">
            <thead class="table-dark">
                <tr>
                    <th>Số CMND</th>
                    <th>Họ và Tên</th>
                    <th>Email</th>
                    <th>Số điện thoại</th>
                    <th>Địa chỉ</th>
                    <th>Hệ tốt nghiệp</th>
                    <th>Ngày tốt nghiệp</th>
                    <th>Loại tốt nghiệp</th>
                    <th>Hành động</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="tn" items="${totnghiep}">
                    <tr>
                        <td><c:out value="${tn.sinhVien.soCMND}"/></td>
                        <td><c:out value="${tn.sinhVien.hoTen}"/></td>
                        <td><c:out value="${tn.sinhVien.email}"/></td>
                        <td><c:out value="${tn.sinhVien.soDT}"/></td>
                        <td><c:out value="${tn.sinhVien.diaChi}"/></td>
                        <td><c:out value="${tn.heTN}"/></td>
                        <td><c:out value="${tn.ngayTN}"/></td>
                        <td><c:out value="${tn.loaiTN}"/></td>
                        <td>
                            <a href="${pageContext.request.contextPath}/sv/edit/${tn.sinhVien.soCMND}" class="btn btn-info btn-sm">✏️ Sửa</a>
                            <a href="${pageContext.request.contextPath}/sv/${tn.sinhVien.soCMND}" class="btn btn-danger btn-sm">🗑️ Xóa</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
