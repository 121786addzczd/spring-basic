package Spring03IF.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spring03IF.entity.Employee;
import Spring03IF.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public ArrayList<Employee> findAll() {
        return employeeRepository.findAll();
    }

}
