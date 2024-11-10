package AOP_shoppingCart;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "AOP_shoppingCart")
@EnableAspectJAutoProxy
public class BeanConfig {

}
