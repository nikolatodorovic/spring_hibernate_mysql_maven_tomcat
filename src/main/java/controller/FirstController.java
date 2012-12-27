package controller;

import java.util.List;

import model.Company;
import model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.ICompanyService;
import service.IEmployeeService;

@Controller
public class FirstController extends BasicController {
	
    @Autowired
    private ICompanyService companyService;

    @Autowired
    private IEmployeeService employeeService;
    
    @RequestMapping(value = URL_FIRST, method = RequestMethod.GET)
    public ModelAndView cameToLandingPage() {
    	
        String message = "Some GET text...";

        ModelAndView mav = new ModelAndView(TILES_FIRST_PAGE);
        
        List<Company> company = companyService.listCompany();
        
        List<Employee> employee = employeeService.listEmployeeForCompany(company.get(1));
        
        mav.addObject("company", company);
        mav.addObject("employee", employee);
        mav.addObject("message", message);
        
        return mav;
    }
    
    @RequestMapping(value = "URL_FIRST", method = RequestMethod.POST)
    public ModelAndView doSomething() {
    	
        String message = "Some POST text...";

        ModelAndView mav = new ModelAndView(TILES_FIRST_PAGE);

        mav.addObject("message", message);
        
        return mav;
    }
    
}
