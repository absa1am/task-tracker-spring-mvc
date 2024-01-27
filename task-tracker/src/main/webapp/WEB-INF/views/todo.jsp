<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Task Tracker - Home</title>
        <link rel="stylesheet" href="/static/css/styles.css">
    </head>
    <body>
        <%@include file="layouts/nav.jsp"%>

        <main>
            <section class="section">
                <div>
                    <h1>New Task</h1>
                    <s:form action="todo" modelAttribute="task" method="POST" class="form">
                        <s:label path="name">Task</s:label>
                        <s:input type="text" path="name" placeholder="Your task name" /><br>
                        <s:label path="description">Description</s:label>
                        <s:textarea path="description" placeholder="Your task description" rows="10"/><br>
                        <s:label path="startDate">Start Date</s:label>
                        <s:input type="date" id="startDate" path="startDate" /><br>
                        <s:label path="endDate">End Date</s:label>
                        <s:input type="date" id="endDate" path="endDate" /><br>
                        <s:label path="status">Status</s:label>
                        <s:select path="status" id="status">
                            <s:option value="Pending">Pending</s:option>
                            <s:option value="Processing">Processing</s:option>
                            <s:option value="Backlog">Backlog</s:option>
                            <s:option value="Completed">Completed</s:option>
                        </s:select><br>
                        <input type="submit" value="Add task" />
                    </s:form>
                </div>
            </section>
        </main>

        <%@include file="layouts/footer.jsp"%>
    </body>
</html>
