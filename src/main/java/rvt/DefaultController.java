package rvt;

import javax.naming.Binding;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

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
        return modelAndView;
    }

    @GetMapping(value = "/registration")
    public String register(HttpServletRequest request, Model model){
        model.addAttribute("student", new Student(null, null, null, null));
        if(request.getParameter("success") != null){
            return "registration-success";
        }
        return "registration";
    }

    @PostMapping(value = "/registration")
    public String register(@Valid @ModelAttribute("student")Students student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "registration";
        }

        System.out.println(student);
        return "redirect:/registration?success";
    }

        // HashMap<String, String> carHashMap = new HashMap<>();
        // carHashMap.put("brand", "FORD");
        // carHashMap.put("model", "Mustang");
        // carHashMap.put("year", "1950");
        //System.out.println(carHashMap.get("brand"));


        
        //Method Overloading
        // Money macins1 = new Money(5, 55);

        // macins1.plus(Money money);
        // this.euros = euros + money.euros;
        // macins1.plus(int euros);
        // this.euros = euros + euros;
        // macins1.plus(byte cents);
        // this.cents = cents + cents;


        // modelAndView.addObject("", macins1);
        // return modelAndView;

    
}


