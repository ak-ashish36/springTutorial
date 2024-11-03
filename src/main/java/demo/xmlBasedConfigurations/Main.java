package demo.xmlBasedConfigurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* 
 * */
public class Main {
	public static void main(String[] args) {
		System.out.println("xmlBased Configurations");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_xmlBasedConfigurations.xml");

		Doctor doctor = context.getBean(Doctor.class);
		doctor.assist();

		Nurse nurse = (Nurse)context.getBean("nurse"); // Get bean by id
		nurse.assist();
		
		
		Staff staff = context.getBean(Doctor.class);
		staff.assist();
		staff = context.getBean(Nurse.class);
		staff.assist();
		
		
		System.out.println(doctor.getQualification());
		doctor.getNurse().assist();
	}
	
}
