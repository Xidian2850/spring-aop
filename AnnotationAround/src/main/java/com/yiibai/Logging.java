package com.yiibai;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class Logging {

	/**
	 * Following is the definition for a pointcut to select all the methods
	 * available. So advice will be called for all the methods.
	 */
	@Pointcut("execution(* com.yiibai.Student.getAge(..))")
	private void selectGetAge() {
	}

	/**
	 * This is the method which I would like to execute around a selected method
	 * execution.
	 */
	@Around("selectGetAge()")
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
			throws Throwable {
		System.out.println("[aroundAdvice]Around advice");
		Object[] args = proceedingJoinPoint.getArgs();
		if (args.length > 0) {
			System.out.print("[aroundAdvice]Arguments passed: ");
			for (int i = 0; i < args.length; i++) {
				System.out.print("[aroundAdvice] arg " + (i + 1) + ": " + args[i]);
			}
		}

		Object result = proceedingJoinPoint.proceed(args);
		System.out.println("[aroundAdvice] Returning " + result);
	}
}