package demo.annotationBasedConfigurations;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff,BeanNameAware {
	
	private String qualification;
	

	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + "]";
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public void assist() {
		System.out.println("Doctor is assisting");
	}
	

	// Part of Bean Life Cycle
	@Override
	public void setBeanName(String name) {
		System.out.println("-> setBeanName method is called");
		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("-> postConstruct method is called");
	}

}
