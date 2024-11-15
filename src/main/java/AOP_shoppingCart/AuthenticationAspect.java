package AOP_shoppingCart;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

	@Pointcut("within(shoppingCart..*)")
	public void authenticatingPointCut() {
	}
	
	@Pointcut("within(shoppingCart..*)")
	public void authorizingPointCut() {

	}
	
	@Before("authenticatingPointCut() || authorizingPointCut()")
	public void authenticate() {
		System.out.println("Authenticating the request");
	}

}
