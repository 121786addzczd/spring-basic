package Spring03IF.service;

import java.util.ArrayList;

import Spring03IF.entity.Employee;

public interface EmployeeService {

    // 社員リストを取得
    ArrayList<Employee> findAll();
}
