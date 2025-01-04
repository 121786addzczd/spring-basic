<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Spring04JSP.entity.Employee"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>社員一覧</title>
    <style>
      table {
        border-collapse: collapse; /* セルの境界線を重ねて単線にする */
      }

      th,
      td {
        border: 1px solid black; /* セルの境界線のスタイルを設定 */
        padding: 10px;
      }
    </style>
  </head>
  <body>
    <h1>社員一覧</h1>

    <table border="1">
      <tr bgcolor="#cccccc">
        <th>ID</th>
        <th>名前</th>
        <th>姓</th>
        <th>年</th>
        <th>住所</th>
        <th>変更</th>
        <th>削除</th>
      </tr>

      <%
      // 社員リストを作る
      ArrayList<Employee> employeeList = new ArrayList<>();

      // 社員1を作成
      Employee employee1 = new Employee();
      employee1.setId(1);
      employee1.setName("鈴木義雄");
      employee1.setSex("男性");
      employee1.setBirthYear(1984);
      employee1.setAddress("宮城県仙台市");
      // 社員リストに追加
      employeeList.add(employee1);

      // 社員2を作成
      Employee employee2 = new Employee();
      employee2.setId(2);
      employee2.setName("大島咲希");
      employee2.setSex("女性");
      employee2.setBirthYear(2004);
      employee2.setAddress("福岡県福岡市");
      // 社員リストに追加
      employeeList.add(employee2);
      %>

      <%
      for (Employee employee : employeeList) {
      %>
      <tr>
        <td><%=employee.getId()%></td>
        <td><%=employee.getName()%></td>
        <td><%=employee.getSex()%></td>
        <td><%=employee.getBirthYear()%></td>
        <td><%=employee.getAddress()%></td>
        <td>変更</td>
        <td>削除</td>
      </tr>
      <%
      }
      %>

    </table>
    <p></p>
    <!-- 「社員を登録する」ボタン -->
    <form action="insert" method="get">
      <input type="submit" value="社員を登録する" />
    </form>
  </body>
</html>
