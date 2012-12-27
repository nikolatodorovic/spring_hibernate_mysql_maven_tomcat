package service;

import java.util.List;

import model.Company;
import model.Employee;

public interface IEmployeeService {
	
    public void addEmployee (Employee employee);
    public List<Employee> listEmployee();
    public List<Employee> listEmployeeForCompany(Company c);
    public void removeEmployee(Integer id);
    
}
