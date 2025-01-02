package Spring02DI.service;

import Spring02DI.entity.Employee;
import Spring02DI.repository.EmployeeRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    // 社員リストを取得
    public ArrayList<Employee> findAll() {

        // 社員リポジトリのインスタンスを作成
        // EmployeeRepository employeeRepository = new EmployeeRepository();

        // 社員リストを取得して戻す
        return employeeRepository.findAll();
    }
}
