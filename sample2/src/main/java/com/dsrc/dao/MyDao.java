package com.dsrc.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.dsrc.beans.LoginBean;
import com.dsrc.beans.RegisterBean;  
  
public class MyDao {  
JdbcTemplate template;  
  

public void setTemplate(JdbcTemplate template) 
{  
    this.template = template;  
}  


public int save(RegisterBean reg)
{  
	
	
   // String sql="insert into Emp99(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')"; 
    String sql="insert into Register(Name,Age,PhoneNumber,Email,LoginId,Password) values('"+reg.getName()+"',"+reg.getAge()+","+reg.getPhoneNumber()+",'"+reg.getEmail()+"','"+reg.getLoginId()+"','"+reg.getPassword()+"')";

    return template.update(sql);  
}


public void login(RegisterBean reg) {
	// TODO Auto-generated method stub
	
	
	
}  
}