package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SecondController extends BasicController {
	
    @RequestMapping(value = URL_SECOND, method = RequestMethod.GET)
    public ModelAndView second() {
    	
        ModelAndView mav = new ModelAndView(TILES_SECOND_PAGE);

        return mav;
    }
    
    
}
