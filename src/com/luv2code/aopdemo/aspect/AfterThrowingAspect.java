package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAspect {
	
	@After("execution( * com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyAspect(JoinPoint joinpoint) {
		String method = joinpoint.getSignature().toShortString();
		
		System.out.println("\n===> Executing @After (finally) advice on method: "+ method);
	}

	@AfterThrowing(pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
			throwing="exp")
	public void afterThrowingAspect(JoinPoint joinPoint, Throwable exp) {
		
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n===> Executing @AfterTrowing advice on method: "+method);
		System.out.println("\n===> The exception is: "+ exp);
		
	}
}
