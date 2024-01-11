<%--
  Created by IntelliJ IDEA.
  User: DSi
  Date: 1/8/2024
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Task Tracker - Home</title>
        <link rel="stylesheet" href="<c:url value='/static/css/styles.css' />">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    </head>
    <body>
        <%@include file="layouts/nav.jsp"%>

        <main>
            <section class="section">
                <div>
                    <h1>My Tasks</h1>
                    <table class="table">
                        <tr>
                            <th>ID</th>
                            <th>Task</th>
                            <th>Status</th>
                            <th>Deadline</th>
                            <th>Action</th>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Reading book</td>
                            <td>Pending</td>
                            <td>01/11/2024 - 01/11/2024</td>
                            <td>
                                <a href="#"><i class="bi bi-pencil-square"></i></a>
                                <a href="#"><i class="bi bi-eye"></i></a>
                                <a href="#"><i class="bi bi-trash"></i></a>
                            </td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Walking</td>
                            <td>Pending</td>
                            <td>01/11/2024 - 01/11/2024</td>
                            <td>
                                <a href="#"><i class="bi bi-pencil-square"></i></a>
                                <a href="#"><i class="bi bi-eye"></i></a>
                                <a href="#"><i class="bi bi-trash"></i></a>
                            </td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>Walking</td>
                            <td>Pending</td>
                            <td>01/11/2024 - 01/11/2024</td>
                            <td>
                                <a href="#"><i class="bi bi-pencil-square"></i></a>
                                <a href="#"><i class="bi bi-eye"></i></a>
                                <a href="#"><i class="bi bi-trash"></i></a>
                            </td>
                        </tr>
                        <tr>
                            <td>4</td>
                            <td>Walking</td>
                            <td>Pending</td>
                            <td>01/11/2024 - 01/11/2024</td>
                            <td>
                                <a href="#"><i class="bi bi-pencil-square"></i></a>
                                <a href="#"><i class="bi bi-eye"></i></a>
                                <a href="#"><i class="bi bi-trash"></i></a>
                            </td>
                        </tr>
                        <tr>
                            <td>5</td>
                            <td>Walking</td>
                            <td>Pending</td>
                            <td>01/11/2024 - 01/11/2024</td>
                            <td>
                                <a href="#"><i class="bi bi-pencil-square"></i></a>
                                <a href="#"><i class="bi bi-eye"></i></a>
                                <a href="#"><i class="bi bi-trash"></i></a>
                            </td>
                        </tr>
                        <tr>
                            <td>6</td>
                            <td>Walking</td>
                            <td>Pending</td>
                            <td>01/11/2024 - 01/11/2024</td>
                            <td>
                                <a href="#"><i class="bi bi-pencil-square"></i></a>
                                <a href="#"><i class="bi bi-eye"></i></a>
                                <a href="#"><i class="bi bi-trash"></i></a>
                            </td>
                        </tr>
                    </table>
                </div>
            </section>
        </main>
    
        <%@include file="layouts/footer.jsp"%>
    </body>
</html>
