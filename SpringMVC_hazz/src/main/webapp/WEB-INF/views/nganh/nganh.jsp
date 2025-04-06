<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container mt-3">
    <!-- Tiêu đề & Nút thêm ngành -->
    <div class="row align-items-center">
        <div class="col-md-8">
            <h3 class="fw-bold text-primary">📚 Danh sách Ngành</h3>
        </div>
        <div class="col-md-4 text-end">
            <a href="${pageContext.request.contextPath}/nganh/news" class="btn btn-success btn-sm">
                ➕ Thêm Ngành
            </a>
        </div>
    </div>

    <!-- Bảng danh sách ngành -->
    <div class="table-responsive mt-3">
        <table class="table table-hover table-bordered text-center">
            <thead class="table-dark">
                <tr>
                    <th>Mã Ngành</th>
                    <th>Tên Ngành</th>
                    <th>Loại Ngành</th>
                    <th>Hành động</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="t" items="${nganh}">
                    <tr>
                        <td><c:out value="${t.maNganh}" /></td>
                        <td><c:out value="${t.tenNganh}" /></td>
                        <td><c:out value="${t.loaiNganh}" /></td>
                        <td>   
                            <a href="${pageContext.request.contextPath}/nganh/edit/${t.maNganh}" class="btn btn-info btn-sm">✏️ Sửa</a>
                            <a href="${pageContext.request.contextPath}/nganh/${t.maNganh}" class="btn btn-danger btn-sm">🗑️ Xóa</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
