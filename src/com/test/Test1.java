/**
 * 
 */
package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Person;

public class Test1 {
	public static void main(String ss[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appC.xml");
		Person p = (Person) ctx.getBean("b");

		p.display();
	}
}
