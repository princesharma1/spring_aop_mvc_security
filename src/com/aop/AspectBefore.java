/**
 * 
 */
package com.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AspectBefore implements MethodBeforeAdvice {
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println();
		System.out.println("***********************Before Advice***************");

	}

}
