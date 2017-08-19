/**
 * 
 */
package com.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundMethod implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("Method Name: " + methodInvocation.getMethod().getName());
		System.out.println("Method Arguments: " + Arrays.toString(methodInvocation.getArguments()));

		System.out.println("------>Before----><-----");
		try {
			Object result = methodInvocation.proceed();
			System.out.println("------>After-------><--------->");
			return result;

		} catch (IllegalArgumentException e) {
			System.out.println("----->throw Exception<<<<<<<-----");
			throw e;
		}
		
	}

}
