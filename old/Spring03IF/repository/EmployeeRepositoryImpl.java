package Spring03IF.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import Spring03IF.entity.Employee;

@Repository
@Qualifier("EmployeeRepositoryImpl")
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public ArrayList<Employee> findAll() {
        // 社員リスト作成
        ArrayList<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee();

        employee1.setId(1);
        employee1.setName("鈴木義雄");
        employee1.setSex("男性");
        employee1.setBirthYear(1984);
        employee1.setAddress("宮城県仙台市");
        // 社員リストに追加
        employeeList.add(employee1);

        Employee employee2 = new Employee();

        employee2.setId(2);
        employee2.setName("大島咲希");
        employee2.setSex("女性");
        employee2.setBirthYear(2004);
        employee2.setAddress("福岡県福岡市");
        // 社員リストに追加
        employeeList.add(employee2);

        return employeeList;
    }

}
