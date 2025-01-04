package Spring03IF.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import Spring03IF.entity.Employee;
import Spring03IF.repository.EmployeeRepository;
import Spring03IF.repository.EmployeeRepositoryImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    @Qualifier("EmployeeRepositoryImpl")
    EmployeeRepository employeeRepository;

    @Override
    public ArrayList<Employee> findAll() {
        return employeeRepository.findAll();
    }

}
