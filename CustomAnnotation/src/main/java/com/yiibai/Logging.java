package com.yiibai;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging {

	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	@Before("@annotation(com.yiibai.Loggable)")
	public void beforeAdvice() {
		System.out.println("Going to setup student profile.");
	}
}