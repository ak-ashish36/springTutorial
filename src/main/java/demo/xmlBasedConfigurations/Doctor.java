package demo.xmlBasedConfigurations;

public class Doctor implements Staff {

	private String Qualification;
	
	public Doctor(String qualification) {
		this.Qualification= qualification;
	}
	
	private Nurse nurse;
	
	public void assist() {
		System.out.println("Doctor is assisting");
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}
}
