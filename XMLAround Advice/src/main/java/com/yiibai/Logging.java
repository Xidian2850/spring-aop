package com.yiibai;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logging {

	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	public void beforeAdvice() {
		System.out.println("[beforeAdvice]Going to setup student profile.");
	}

	/**
	 * This is the method which I would like to execute after a selected method
	 * execution.
	 */
	public void afterAdvice() {
		System.out.println("[After]Student profile setup complete.");
	}

	/**
	 * This is the method which I would like to execute when any method returns.
	 */
	public void afterReturningAdvice(Object retVal) {
		System.out.println("[afterReturningAdvice] Returning: "
				+ retVal.toString());
	}

	/**
	 * This is the method which I would like to execute if there is an exception
	 * raised.
	 */
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out
				.println("[afterThrowingAdvice] There has been an exception: "
						+ ex.toString());
	}

	/**
	 * This is the method which I would like to execute around a selected method
	 * execution.
	 */
	public String aroundAdvice(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("【In Around advice】");
		Object[] args = jp.getArgs();
		if (args.length > 0) {
			System.out.print("Arguments passed: ");
			for (int i = 0; i < args.length; i++) {
				System.out.print("arg " + (i + 1) + ": " + args[i]);
			}
		}

		Object result = jp.proceed(args);
		System.out.println("Returning ：" + result);
		return result.toString();
	}
}