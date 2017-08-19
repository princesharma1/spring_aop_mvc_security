/**
 * 
 */
package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Simple1;

public class BeforeTest {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aopApp.xml");
		Simple1 sm = (Simple1)ctx.getBean("baproxy");
		sm.printName("AA");
		sm.printUrl();
		//sm.printThrowException();  
	}

}
