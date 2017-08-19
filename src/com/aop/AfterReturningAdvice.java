/**
 * 
 */
package com.aop;

import java.lang.reflect.Method;

public class AfterReturningAdvice implements org.springframework.aop.AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {

		System.out.println("-------------After Returning Advice-------------");
		System.out.println();
	}

}
