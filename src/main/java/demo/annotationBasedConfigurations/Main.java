package demo.annotationBasedConfigurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* 
 * */
public class Main {
	public static void main(String[] args) {
		
		System.out.println("AnnotationBased Configurations");
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring_annotationBasedConfiguration.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		Doctor doctor = context.getBean(Doctor.class);
		doctor.assist();
		
		Nurse nurse = context.getBean(Nurse.class);
		nurse.assist();
		doctor.setQualification("MBBS");
		System.out.println(doctor);
		
		Doctor doctor1 = context.getBean(Doctor.class);
		System.out.println(doctor1);  // This will print MBBS because the default scope in always Singleton, Spring will create only one object of class for entire project
		
		// For getting new object everytime you get the bean, we need to change the scope in that Class
		// In Doctor class we have now changed the scope to 'prototype' , See the code there.
		
	}
	
}
