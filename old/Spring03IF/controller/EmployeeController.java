package Spring03IF.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Spring03IF.entity.Employee;
import Spring03IF.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    // 社員リストを取得
    public void findAll() {

        // 社員サービスのインスタンスを作成
        // EmployeeService employeeService = new EmployeeService();
        // 社員リストを取得
        ArrayList<Employee> employeeList = employeeService.findAll();

        // リストの中の社員を表示
        for (Employee employee : employeeList) {
            System.out.println(employee.getId() + "," + employee.getName() + "," + employee.getSex() + ","
                    + employee.getBirthYear() + "," + employee.getAddress());
        }
    }
}
