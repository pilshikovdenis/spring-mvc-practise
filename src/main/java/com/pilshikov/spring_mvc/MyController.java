package com.pilshikov.spring_mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showMainPage() {
        return "home";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
//        Employee employee = new Employee("Viktor","Petrov",5000, "IT" );
        model.addAttribute("employee", new Employee());
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
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee,
                                      BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-employee-details";
        }

        return "show-employee-details";
    }
}
