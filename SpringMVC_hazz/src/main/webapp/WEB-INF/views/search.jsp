<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Nếu dùng layout -->


<!-- Nội dung thực sự (chỉ hiển thị nếu không dùng layout) -->
<div>
    <form action="${pageContext.request.contextPath}/sv/search_sv" method="get">
        <input type="text" name="keyword" placeholder="Nhập từ khóa tìm kiếm..." class="form-control" />
        <button type="submit" class="btn btn-primary">Tìm kiếm</button>
    </form>

    <table class="table table-bordered">
        <thead>
            <tr>
                <th>Số CMND</th>
                <th>Họ Tên</th>
                <th>Email</th>
                <th>Số điện thoại</th>
                <th>Địa chỉ</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="sinhvien" items="${sinhviens}">
                <tr>
                    <td>${sinhvien.soCMND}</td>
                    <td>${sinhvien.hoTen}</td>
                    <td>${sinhvien.email}</td>
                    <td>${sinhvien.soDT}</td>
                    <td>${sinhvien.diaChi}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
