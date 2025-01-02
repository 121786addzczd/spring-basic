package old.Spring01NoDI.service;

import java.util.ArrayList;

import old.Spring01NoDI.entity.Employee;
import old.Spring01NoDI.repository.EmployeeRepository;

public class EmployeeService {
    // 社員リストを取得
    public ArrayList<Employee> findAll() {

        // 社員リポジトリのインスタンスを作成
        EmployeeRepository employeeRepository = new EmployeeRepository();

        // 社員リストを取得して戻す
        return employeeRepository.findAll();
    }
}
