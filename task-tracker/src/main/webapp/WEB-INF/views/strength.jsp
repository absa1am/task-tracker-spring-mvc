<%--
  Created by IntelliJ IDEA.
  User: DSi
  Date: 1/11/2024
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Task Tracker - Home</title>
        <link rel="stylesheet" href="<c:url value='/static/css/styles.css' />">
        <!-- styles -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <%@include file="layouts/nav.jsp"%>

        <div class="chart">
            <h1>My Strength</h1>
            <canvas id="myChart" ></canvas>
        </div>

        <%@include file="layouts/footer.jsp"%>

        <%@include file="layouts/scripts.jsp"%>

        <script>
            var total = 0;
            var pending = 0;
            var processing = 0;
            var completed = 0;
            var backlog = 0;

            var xValues = ["Pending (%)", "Processing (%)", "Completed (%)", "Backlog (%)"];
            var yValues = [0, 1, 2, 3];

            var barColors = [
                "#e8c3b9",
                "#2b5797",
                "#1e7145",
                "#b91d47"
            ];

            new Chart("myChart", {
                type: "doughnut",
                data: {
                    labels: xValues,
                    datasets: [{
                        backgroundColor: barColors,
                        data: yValues
                    }]
                },
                options: {
                    title: {
                        display: true,
                        text: ""
                    }
                }
            });
        </script>
    </body>
</html>