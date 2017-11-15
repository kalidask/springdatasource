package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import com.aa.util.KeyUtil;

public class LoggingAspect {
	public Object log(ProceedingJoinPoint pjp, int x, int y) throws Throwable {
		String methodName = null;
		Object[] args = null;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();

		// logging before target method
		System.out.println("entered into " + KeyUtil.getKey(methodName, args));
		Object ret = pjp.proceed();
		System.out.println("exiting from : " + methodName + " ret value : "
				+ ret);
		return ret;
	}

}
