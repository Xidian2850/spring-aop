package com.yiibai;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;

@Aspect
public class Logging {

	/**
	 * This is the method which I would like to execute after a selected method
	 * execution.
	 */
	@AfterReturning(pointcut = "execution(* com.yiibai.Student.*(..))", returning = "retVal")
	public void afterReturningAdvice(JoinPoint jp, Object retVal) {
		System.out.println("[afterReturningAdvice] Method Signature: " + jp.getSignature());
		System.out.println("[afterReturningAdvice] Returning: " + retVal.toString());
	}
}