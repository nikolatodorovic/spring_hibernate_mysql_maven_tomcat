package dao;

import java.util.List;
import model.Company;

public interface ICompanyDAO {

    public void addCompany (Company company);
    public List<Company> listCompany();
    public void removeCompany (Integer id);
    
}
