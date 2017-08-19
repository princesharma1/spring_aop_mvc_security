/**
 * 
 */
package com.aop;

import org.springframework.aop.ThrowsAdvice;

public class AfterThrowingAdvice implements ThrowsAdvice {
public void afterThrowing(IllegalArgumentException e) throws Throwable
{
	System.out.println("**********throws exception*********");
}
}
   