package main.java;

import java.util.ArrayList;

import main.java.EmployeeListIF;
import main.java.EmployeeListImpl;

public class HelloWorld {

    public static void main(String[] args) {
        // インターフェースを介してオブジェクトを取得
        EmployeeListIF employeeList = new EmployeeListImpl();

        System.out.println("--------------------------------------------");

        System.out.println("ID,名前,性別,年,住所");
        for (Employee employee : employeeList.findAll()) {
            System.out.println(employee.getId() + "," + employee.getName() + "," + employee.getSex() + ","
                    + employee.getBirthYear() + "," + employee.getAddress());
        }

        System.out.println("--------------------------------------------");
    }
}
