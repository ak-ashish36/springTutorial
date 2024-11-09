package AOP_shoppingCart;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "shoppingCart")
@EnableAspectJAutoProxy
public class BeanConfig {

}
