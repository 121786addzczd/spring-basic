package Spring03IF.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import Spring03IF.entity.Employee;

@Repository
@Qualifier("EmployeeRepositoryImpl2")
public class EmployeeRepositoryImpl2 implements EmployeeRepository {

    @Override
    public ArrayList<Employee> findAll() {
        // 社員リスト作成
        ArrayList<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee();

        employee1.setId(1);
        employee1.setName("匿名太郎");
        employee1.setSex("男性");
        employee1.setBirthYear(2000);
        employee1.setAddress("東京都立川市");
        // 社員リストに追加
        employeeList.add(employee1);

        return employeeList;
    }

}
