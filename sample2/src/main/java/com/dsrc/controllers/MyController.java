package com.dsrc.controllers;   
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.dsrc.beans.LoginBean;
import com.dsrc.beans.RegisterBean;
import com.dsrc.dao.MyDao;  
@Controller  
public class MyController {  
    @Autowired  
    MyDao dao;//will inject dao from xml file  
      
   
    
    
    
    /*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
    @RequestMapping("/login")  
    public String showform1(Model m){  
    	m.addAttribute("command", new LoginBean());
    	return "login"; 
    }  
    
    
    @RequestMapping("/Register")  
    public String showform2(Model m){  
    	m.addAttribute("command", new RegisterBean());
    	return "Register"; 
    }  
    
    
    
    
    /*It saves object into database. The @ModelAttribute puts request data 
     *  into model object. You need to mention RequestMethod.POST method  
     *  because default request is GET*/  
    @RequestMapping(value="/Register",method = RequestMethod.POST)  
    public String save(@ModelAttribute("reg") RegisterBean reg){  
        dao.save(reg);  
        return "redirect:/viewemp";//will redirect to viewemp request mapping  
    }   
    
      
   
    @RequestMapping(value="/Login",method = RequestMethod.POST)  

    public String login(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("login")RegisterBean login) {
  	  
    	// If the loginname and password is "SA" and "PASS" go to "succes.jsp" page.
    	// Else  to error.jsp
    		String loginid=request.getParameter("LoginId");
    		String pass=request.getParameter("Password");
    		
   if(loginid.equals(login.getLoginId())&& pass.equals(login.getPassword()))
   {
       return "redirect:/home";//will redirect to viewemp request mapping  
   
   }
return "login";
    }
    
    
    
    
    
    
    
    
    
    
    
   
}
    
    
 