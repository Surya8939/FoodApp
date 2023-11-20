<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exit Page</title>
</head>
<body>
    <h2>Thank you for using the Food Order App!</h2>
    <p>We hope to see you again soon.</p>
    <a href="Dashboard.jsp">Back to Home</a>
    <br>
    <button onclick="exitApp()">Exit</button>

    <script>
        function exitApp() {
           
            window.close();
        }
    </script>
</body>
</html>
