<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>

<html>
<head>
    <meta charset="utf-8">
    <link href="../css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" style="max-width: 600px">
    <div class="py-5 text-center">
            <h2>Resources 목록</h2>
        </div>

        <div class="row">
            <div class="col">
                <button class="btn btn-primary float-end" onclick="location.href='./'" type="button">최신화</button>
        </div>
    </div>

    <hr class="my-4">
    <div>
        <table class="table" border="1">
            <thead>
            <tr>
                <th>CPU</th>
                <th>Memory</th>
                <th>Disk</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><c:forEach var="list" items="${list}">
                                        ${ list.get("CPU") }
                                        </br>
                                        </c:forEach></td>
                <td><c:forEach var="list" items="${list}">
                                                            ${ list.get("DISK") }
                                                            </br>
                                                            </c:forEach></td>
                <td><c:forEach var="list" items="${list}">
                                                            ${ list.get("MEM") }
                                                            </br>
                                                            </c:forEach></td>
            </tr>
            </tbody>
        </table>
    </div>

</div> <!-- /container -->

</body>
</html>