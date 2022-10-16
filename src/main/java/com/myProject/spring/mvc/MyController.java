/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myProject.spring.mvc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/employee/")
public class MyController {

    @RequestMapping("")
    public String showFirstView() {

        return "first_view";

    }

    @RequestMapping("employee/showDetails")
  public String showDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult,Model model) {
    // request.getParameter(string)
        String phone = emp.getPhoneNumber().replaceAll("\\s+", "").replaceFirst("8", "+7");  //change phone format +7(XXX)XXX-XX-XX
        Pattern pattern = Pattern.compile("(\\+7|8)(\\d{3})(\\d{3})(\\d{2})(\\d{2})");
        Matcher matcher = pattern.matcher(phone);
        String newFormatPhone = matcher.replaceAll("$1($2)$3-$4-$5");
        model.addAttribute("phoneAttribute",newFormatPhone);
        if (bindingResult.hasErrors()) {
            return "ask_emp_details";
        } else {
            return "show_emp_details";
        }

    }

    @RequestMapping("employee/askDetails")
    public String askDetails(Model model) {
        model.addAttribute("employee", new Employee());

        return "ask_emp_details";

    }

}
