package controller;

import java.util.List;

import javax.validation.Valid;

import model.Company;
import model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.ICompanyService;
import service.IEmployeeService;
import form.LoginForm;

@Controller
public class LoginController extends BasicController{
	
    @Autowired
    private ICompanyService companyService;
    
    @Autowired
    private IEmployeeService employeeService;
    
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ModelAndView loginGet(@ModelAttribute(LOGIN_FORM) @Valid LoginForm loginForm) {
    	
        String message = "We logged in...";
        
        ModelAndView mav = new ModelAndView(TILES_FIRST_PAGE);
        
        List<Company> company = companyService.listCompany();
        
        List<Employee> employee = employeeService.listEmployeeForCompany(company.get(1));
        
        mav.addObject("company", company);
        mav.addObject("employee", employee);
        mav.addObject("message", message);
        
        return mav;
    }
    
    
}
