<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
<body>
<div class="container">
    <form:form action="/add" method="post" modelAttribute="nhanVien">

        <div class="mb-3">
            <label>Ma:</label>
            <input name="ma" path="categoryCode" type="text">
        </div>
        <div class="mb-3">
            <label>Ho:</label>
            <input name="ho" path="categoryName" type="text">
        </div>
        <div class="mb-3">
            <label>Ten Dem:</label>
            <input name="tenDem" path="categoryName" type="text">
        </div>
        <div class="mb-3">
            <label>Ten:</label>
            <input name="ten" path="categoryCode" type="text">
        </div>
        <div class="mb-3">
            <label>Gioi Tinh:</label>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gioiTinh" value="Nam">
                <label>
                    Nam
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gioiTinh" value="Nu" checked>
                <label>
                    Nu
                </label>
            </div>
        </div>
        <div class="mb-3">
            <label>Ma Chuc Vu:</label>
            <select class="form-select" name="chucVu" aria-label="Default select example">
                <c:forEach items="${chucVu}" var="cv">
                    <option>${cv.ten}</option>
                </c:forEach>

            </select>
            <label>Ten Chuc Vu:</label>
            <input id="chucVuName" type="text" readonly>
        </div>
        <div class="mb-3">
            <label>Ma Cua Hang:</label>
            <select class="form-select" aria-label="Default select example">
                <c:forEach items="cuaHang" var="ch">
                    <option>${ch.ten}</option>
                </c:forEach>

            </select>
            <label>Ten Cua Hang:</label>
            <input id="cuaHangName" type="text" readonly>
        </div>
        <div class="mb-3">
            <label>Nam Sinh:</label>
            <input name="ngaySinh" path="categoryName" type="text">
        </div>
        <button type="submit" class="btn btn-primary">Add</button>
    </form:form>

</div>

</body>
<script>
    function updateChucVuName() {
        var selectedChucVu = document.getElementsByName("chucVu")[0];
        var chucVuNameInput = document.getElementById("chucVuName");
        chucVuNameInput.value = selectedChucVu.options[selectedChucVu.selectedIndex].value;
    }

    function updateCuaHangName() {
        var selectedCuaHang = document.getElementsByName("cuaHang")[0];
        var cuaHangNameInput = document.getElementById("cuaHangName");
        cuaHangNameInput.value = selectedCuaHang.options[selectedCuaHang.selectedIndex].value;
    }
</script>
</html>