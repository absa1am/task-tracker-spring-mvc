<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <form action="#" class="form">
                        <label for="task">Task</label>
                        <input type="text" name="task" id="task" placeholder="Your task name" /><br>
                        <label for="description">Description</label>
                        <textarea name="description" id="description" placeholder="Your task description" rows="10"></textarea><br>
                        <label for="startDate">Start Date</label>
                        <input type="date" id="startDate" name="startDate" /><br>
                        <label for="endDate">End Date</label>
                        <input type="date" id="endDate" name="endDate" /><br>
                        <label for="status">Status</label>
                        <select name="status" id="status">
                            <option value="Pending">Pending</option>
                            <option value="Processing">Processing</option>
                            <option value="Backlog">Backlog</option>
                            <option value="Completed">Completed</option>
                        </select><br>
                        <input type="submit" value="Add task" />
                    </form>
                </div>
            </section>
        </main>

        <%@include file="layouts/footer.jsp"%>
    </body>
</html>
