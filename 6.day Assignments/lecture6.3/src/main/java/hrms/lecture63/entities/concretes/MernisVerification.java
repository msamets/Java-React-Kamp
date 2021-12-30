package hrms.lecture63.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "mernis_verifications")
public class MernisVerification {
	//aslında bunlara bir üst class eklenebilirdi ama projede şuan lazım
	//olmadığı için ve sql i de değiştirmek istemediğimden 
	//böyle bırakacağım
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "verification")
	private boolean verification;
	public MernisVerification() {
		
	}
	public MernisVerification(int id, int userId, boolean verification) {
		super();
		this.id = id;
		this.userId = userId;
		this.verification = verification;
	}
	
	
}
