/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myProject.spring.mvc;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/employee/")
public class MyController {
   
    @RequestMapping("")
public String showFirstView(){
    
return "first_view";

}  
@RequestMapping("employee/showDetails")
public String showDetails(@ModelAttribute("employee") Employee emp){

    
return "show_emp_details";

}  

 @RequestMapping("employee/askDetails")
public String askDetails(Model model){
    model.addAttribute("employee",new Employee());
    
return "ask_emp_details";

}  
    
    
    
}
