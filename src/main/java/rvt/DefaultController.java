package rvt;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }

    @GetMapping(value = "/hello")
    String hello(){
        return "hello";
    } 
@GetMapping(value = "/about")
ModelAndView about(){
    ModelAndView modelAndView = new ModelAndView("about");

    //Metode priekš koda testēšanas

    return modelAndView;
    }
    @GetMapping(value = "/Links")
    String Links(){
        return "Links";
    }
    @GetMapping(value = "/Experiment")
    String Experiment(){
        return "Experiment";
    }
    @GetMapping(value = "/test")
    public ModelAndView testAction(){
        ModelAndView modelAndView = new ModelAndView("test");
        
        // HashMap<String, String> carHashMap = new HashMap<>();
        // carHashMap.put("brand", "FORD");
        // carHashMap.put("model", "Mustang");
        // carHashMap.put("year", "1950");
        //System.out.println(carHashMap.get("brand"));

        Money macins1 = new Money(5, 55);
        modelAndView.addObject("", macins1);
        return modelAndView;
    }
}