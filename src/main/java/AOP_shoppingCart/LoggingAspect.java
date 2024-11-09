package AOP_shoppingCart;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* ShoppingCart.checkout(..))")
	public void beforelogger(JoinPoint jp) {
		System.out.println(jp.getSignature());
		System.out.println(jp.getArgs()[0]);
		System.out.println("Before Logger is called");
	}
	
	@After("execution(* ShoppingCart.checkout(..))")
	public void afterlogger() {
		System.out.println("After Logger is called");
	}
	
	
	@Pointcut ("execution(* ShoppingCart.quantity(..))")
	public void afterReturningPointCut() {
		System.out.println("sas");
	}
	
	@AfterReturning(pointcut="afterReturningPointCut",returning = "retVal")
	public void afterReturning(String retVal) {
		System.out.println("after returning: "+retVal);
	}
	
	
}
