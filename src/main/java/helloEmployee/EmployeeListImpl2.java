package main.java.helloEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListImpl2 implements EmployeeListIF {

    @Override
    public List<Employee> findAll() {
        // 社員リスト作成
        ArrayList<Employee> employeeList = new ArrayList<>();
        // 仮社員を作成
        Employee employee1 = new Employee();

        employee1.setId(001);
        employee1.setName("匿名太郎");
        employee1.setSex("男性");
        employee1.setBirthYear(1966);
        employee1.setAddress("東京都立川市");
        // 社員リストに追加
        employeeList.add(employee1);

        return employeeList;
    }
}
