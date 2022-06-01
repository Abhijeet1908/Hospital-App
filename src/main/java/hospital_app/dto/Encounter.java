package hospital_app.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String reason;
	private LocalDateTime admitDateTime;
	private LocalDateTime dischargeDateTime;
	@OneToMany(mappedBy = "encounter")
	private List<Observation> observations;
	@OneToMany(mappedBy = "encounter")
	private List<MedOrder> medOrders;
	@ManyToOne
	@JoinColumn
	private Branch branch;
	@ManyToOne
	@JoinColumn
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getAdmitDateTime() {
		return admitDateTime;
	}

	public void setAdmitDateTime(LocalDateTime admitDateTime) {
		this.admitDateTime = admitDateTime;
	}

	public LocalDateTime getDischargeDateTime() {
		return dischargeDateTime;
	}

	public void setDischargeDateTime(LocalDateTime dischargeDateTime) {
		this.dischargeDateTime = dischargeDateTime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public List<Observation> getObservations() {
		return observations;
	}

	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}

	public List<MedOrder> getMedOrders() {
		return medOrders;
	}

	public void setMedOrders(List<MedOrder> medOrders) {
		this.medOrders = medOrders;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
