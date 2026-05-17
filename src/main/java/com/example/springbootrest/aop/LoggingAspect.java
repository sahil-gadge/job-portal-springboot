package com.example.springbootrest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	// return type,class-name.method-name(args)

	@Before("execution(* com.example.springbootrest.service.JobService.getJob(..)) || execution(* com.example.springbootrest.service.JobService.updateJob(..))")
	public void logMethodCall(JoinPoint jp) {
		LOGGER.info("Method called " + jp.getSignature().getName());
	}

	@After("execution(* com.example.springbootrest.service.JobService.getJob(..)) || execution(* com.example.springbootrest.service.JobService.updateJob(..))")
	public void logMethodExcecuted(JoinPoint jp) {
		LOGGER.info("Method Executed " + jp.getSignature().getName());
	}

	@AfterThrowing("execution(* com.example.springbootrest.service.JobService.getJob(..)) || execution(* com.example.springbootrest.service.JobService.updateJob(..))")
	public void logMethodCrash(JoinPoint jp) {
		LOGGER.info("Method has some issues " + jp.getSignature().getName());
	}

	@AfterReturning("execution(* com.example.springbootrest.service.JobService.getJob(..)) || execution(* com.example.springbootrest.service.JobService.updateJob(..))")
	public void logMethodExecutedSuccess(JoinPoint jp) {
		LOGGER.info("Method Executed Successfully " + jp.getSignature().getName());
	}
}
