package com.yiibai;

public class Logging {

	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	public void beforeAdvice() {
		System.out.println("[beforeAdvice]Going to setup student profile.");
	}
}