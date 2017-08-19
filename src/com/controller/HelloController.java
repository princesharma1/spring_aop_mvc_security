/**
 * 
 */
package com.controller;

import java.sql.*;
import java.util.*;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Person;

@Controller
public class HelloController {
          
	@ResponseBody
	@RequestMapping(value = "/hello1", method=RequestMethod.GET,produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})                            
	public ArrayList<Person> getPs(){
		/*Person p1 = new Person("aaa2",12);
		Person p3 = new Person("aaa3",13);
		Person p2 = new Person("aaa4",14);
		*/
		ArrayList<Person> list = null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		Statement stmt = conn.createStatement();
		String sql = "select * from t";
		ResultSet rs = stmt.executeQuery(sql);
		Person p = null;
		list = new ArrayList<Person>();
		while(rs.next()){
			p = new Person();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			list.add(p);  
		}
		
		 
		}catch(Exception e){  
			System.out.println("Exception E: " + e);
		}
		return list;          
	}    
	        
	          
	@ResponseBody
	@RequestMapping(value = "/hello2", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})                                  
	public ArrayList<Person> getP1s(){
		ArrayList<Person> list = null;   
		for(int i=1;i<20;i++){
		Person pi = new Person("name"+i, i);
		list = new ArrayList<Person>();
		list.add(pi);
		
		}
		return list;  
	}
	   
	
	
/*	
	@ResponseBody
	@RequestMapping(value = "/hello")
	public ModelAndView gg(){
		return new ModelAndView
	}*/

}
