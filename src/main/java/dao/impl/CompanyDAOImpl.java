package dao.impl;

import java.util.List;
import model.Company;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.ICompanyDAO;

@Repository
public class CompanyDAOImpl implements ICompanyDAO {
	
    @Autowired
    private SessionFactory sessionFactory;
    
	public void addCompany(Company company) {
		sessionFactory.getCurrentSession().save(company);
	}
	
	public List<Company> listCompany() {
		return sessionFactory.getCurrentSession().createQuery("from Company").list();
	}
	
	public void removeCompany(Integer id) {
		Company company = (Company) sessionFactory.getCurrentSession().load(Company.class, id);
        if (null != company) {
            sessionFactory.getCurrentSession().delete(company);
        }
	}
	
}
