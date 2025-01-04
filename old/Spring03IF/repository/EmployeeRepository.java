package Spring03IF.repository;

import java.util.ArrayList;

import Spring03IF.entity.Employee;

public interface EmployeeRepository {

    // 社員リストを取得
    ArrayList<Employee> findAll();
}
