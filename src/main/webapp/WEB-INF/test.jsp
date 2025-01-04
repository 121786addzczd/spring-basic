<%@ page language="java" contentType="text/html; chareset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="xja">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>テストJSP</title>
</head>
<body>
  <h1>テストJSP!</h1>

<%
  int sum = 0;
  for (int i = 1; i <= 10; i = i + 1) {
    sum = sum + i;
  }
  System.out.println("合計：" + sum);
%>
<%=sum %>

</body>
</html>
