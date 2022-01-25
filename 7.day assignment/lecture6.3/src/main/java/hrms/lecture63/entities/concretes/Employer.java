package hrms.lecture63.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")
@NoArgsConstructor
@AllArgsConstructor
public class Employer extends User {
	

	@Column(name = "sirket_adi")
	private String sirketAdi;
	
	@Column(name = "sirket_website")
	private String sirketWebsite;
	
	@Column(name = "telefon_no")
	private String telefonNo;

	

	

	
	
	

}
