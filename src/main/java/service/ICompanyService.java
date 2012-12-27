package service;

import java.util.List;
import model.Company;

public interface ICompanyService {
	
    public void addCompany (Company company);
    public List<Company> listCompany();
    public void removeCompany(Integer id);
    
}
