package dao.impl;

import java.util.List;

import model.Company;
import model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.IEmployeeDAO;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {
	
    @Autowired
    private SessionFactory sessionFactory;
    
	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
	}
	
	public List<Employee> listEmployee() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}
	
	public List<Employee> listEmployeeForCompany(Company c) {
		return sessionFactory.getCurrentSession().createQuery("from Employee where id_company = :idCompany").setInteger("idCompany", c.getId()).list();
	}
	
	public void removeEmployee(Integer id) {
		Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
        if (null != employee) {
            sessionFactory.getCurrentSession().delete(employee);
        }
	}
	
}
