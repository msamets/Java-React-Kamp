package hrms.lecture63.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User {
	

	@Column(name = "sirket_adi")
	private String sirketAdi;
	
	@Column(name = "sirket_website")
	private String sirketWebsite;
	
	@Column(name = "telefon_no")
	private String telefonNo;

	public Employer() {
		
	}
	public Employer(int id, String email, String password, String sirketAdi, String sirketWebsite, String telefonNo) {
		super(id, email, password);
		this.sirketAdi = sirketAdi;
		this.sirketWebsite = sirketWebsite;
		this.telefonNo = telefonNo;
	}

	

	
	
	

}
