package service.impl;

import java.util.List;

import model.Company;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.IEmployeeService;
import dao.IEmployeeDAO;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
    @Autowired
    private IEmployeeDAO employeeDAO;
    
    @Transactional
    public void addEmployee(Employee employee) {
    	employeeDAO.addEmployee(employee);
    }
    
    @Transactional
    public List<Employee> listEmployee() {
        return employeeDAO.listEmployee();
    }
    
    @Transactional
    public void removeEmployee(Integer id) {
    	employeeDAO.removeEmployee(id);
    }

    @Transactional
	public List<Employee> listEmployeeForCompany(Company c) {
    	return employeeDAO.listEmployeeForCompany(c);
	}
    
}
