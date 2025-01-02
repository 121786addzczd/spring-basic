package Spring02DI.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;

import Spring01NoDI.entity.Employee;
import Spring01NoDI.service.EmployeeService;

@Controller
public class EmployeeController {

    // 社員リストを取得
    public void findAll() {

        // 社員サービスのインスタンスを作成
        EmployeeService employeeService = new EmployeeService();
        // 社員リストを取得
        ArrayList<Employee> employeeList = employeeService.findAll();

        // リストの中の社員を表示
        for (Employee employee : employeeList) {
            System.out.println(employee.getId() + "," + employee.getName() + "," + employee.getSex() + ","
                    + employee.getBirthYear() + "," + employee.getAddress());
        }
    }
}
