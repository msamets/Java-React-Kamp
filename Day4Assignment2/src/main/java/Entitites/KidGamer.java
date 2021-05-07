package Entitites;

public class KidGamer extends Gamer {
	//under 18years old
	
	String parentNationalityId;
	String parentFirstName;
	String parentLastName;
	
	public KidGamer() {
		
	}

	public KidGamer(String parentNationalityId, String parentFirstName, String parentLastName) {
		super();
		this.parentNationalityId = parentNationalityId;
		this.parentFirstName = parentFirstName;
		this.parentLastName = parentLastName;
	}

	public String getParentNationalityId() {
		return parentNationalityId;
	}

	public void setParentNationalityId(String parentNationalityId) {
		this.parentNationalityId = parentNationalityId;
	}

	public String getParentFirstName() {
		return parentFirstName;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}

	public String getParentLastName() {
		return parentLastName;
	}

	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}
	
	
	

}
