package hrms.lecture63.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "mernis_verifications")
@AllArgsConstructor
@NoArgsConstructor
public class MernisVerification {
	//aslında bunlara bir üst class eklenebilirdi ama projede şuan lazım
	//olmadığı için ve sql i de değiştirmek istemediğimden 
	//böyle bırakacağım
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "verification")
	private boolean verification;
	
	
	
}
