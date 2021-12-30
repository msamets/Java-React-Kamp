package hrms.lecture63.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "job_seekers")
@PrimaryKeyJoinColumn(name = "user_id")
public class JobSeeker extends User {
	
	@Column(name = "ad")
	private String ad;
	
	@Column(name = "soyad")
	private String soyad;
	
	@Column(name = "tc_no")
	private String tcNo;
	
	@Column(name = "birth_year")
	private int birthYear;

	public JobSeeker() {
		
	}
	public JobSeeker(int id, String email, String password, String ad, String soyad, String tcNo, int birthYear) {
		super(id, email, password);
		this.ad = ad;
		this.soyad = soyad;
		this.tcNo = tcNo;
		this.birthYear = birthYear;
	}

	

	
	
	

}
