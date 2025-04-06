<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quản lý trường</title>
</head>
<body>
<div class="container mt-3">
    <!-- Header and Add School button -->
    <div class="row align-items-center">
        <div class="col-md-8">
            <h3 class="fw-bold text-primary">🏫 🚂 Danh sách Trường Học</h3>
        </div>
        <div class="col-md-4 text-end">
            <a href="${pageContext.request.contextPath}/truong/news" class="btn btn-success btn-sm">
                ➕ Thêm Trường
            </a>
        </div>
    </div>

    <!-- Schools list table -->
    <div class="table-responsive mt-3">
        <table class="table table-hover table-bordered text-center">
            <thead class="table-dark">
                <tr>
                    <th>Mã Trường</th>
                    <th>Tên Trường</th>
                    <th>Địa Chỉ</th>
                    <th>Số Điện Thoại</th>
                    <th>Hành Động</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="t" items="${truong}">
                    <tr>
                        <td><c:out value="${t.maTruong}"/></td>
                        <td><c:out value="${t.tenTruong}"/></td>
                        <td><c:out value="${t.diaChi}"/></td>
                        <td><c:out value="${t.soDT}"/></td>
                        <td>
                            <a href="${pageContext.request.contextPath}/truong/edit/${t.maTruong}" 
                               class="btn btn-info btn-sm">✏️ Sửa</a>
                            <a href="${pageContext.request.contextPath}/truong/${t.maTruong}" 
                               class="btn btn-danger btn-sm">🗑️ Xóa</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>