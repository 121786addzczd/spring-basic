package Spring01NoDI.service;

import Spring01NoDI.entity.Employee;
import Spring01NoDI.repository.EmployeeRepository;

import java.util.ArrayList;

public class EmployeeService {
    // 社員リストを取得
    public ArrayList<Employee> findAll() {

        // 社員リポジトリのインスタンスを作成
        EmployeeRepository employeeRepository = new EmployeeRepository();

        // 社員リストを取得して戻す
        return employeeRepository.findAll();
    }
}
