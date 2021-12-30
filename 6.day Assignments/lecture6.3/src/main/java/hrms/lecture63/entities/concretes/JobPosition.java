package hrms.lecture63.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "job_positions")
public class JobPosition {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_explanation")
	private String jobExplanation;
	
	
	public JobPosition() {
		
	}
	public JobPosition(int id, String jobExplanation) {
		super();
		this.id = id;
		this.jobExplanation = jobExplanation;
	}
	
	
}
