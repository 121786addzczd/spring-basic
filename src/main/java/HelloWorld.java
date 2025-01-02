package main.java;

import java.util.ArrayList;

public class HelloWorld {

    public static void main(String[] args) {
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

        System.out.println("--------------------------------------------");

        System.out.println("ID,名前,性別,年,住所");
        for (Employee employee : employeeList) {
            System.out.println(employee.getId() + "," + employee.getName() + "," + employee.getSex() + ","
                    + employee.getBirthYear() + "," + employee.getAddress());
        }

        System.out.println("--------------------------------------------");
    }
}
