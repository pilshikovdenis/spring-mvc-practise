package com.pilshikov.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showMainPage() {
        return "home";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-employee-details";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails() {
//        return "show-employee-details";
//    }

//    using HttpServletRequest to get some parameters
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//        String employeeName = request.getParameter("employeeName");
//        employeeName = "Mr. " + employeeName;
//        model.addAttribute("nameAttribute", employeeName);
//        model.addAttribute("description", "Some description");
//        return "show-employee-details";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam(name = "employeeName") String name,
                                      Model model) {

        name = "Mr. " + name;
        model.addAttribute("nameAttribute", name);
        
        return "show-employee-details";
    }
}
