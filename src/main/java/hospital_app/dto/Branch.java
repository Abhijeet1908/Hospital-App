package hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String email;
private long phone;
private String website;
@OneToOne(mappedBy = "branch")
private Address address;
@OneToMany(mappedBy = "branch")
private List<Encounter> encounters;
@ManyToOne
@JoinColumn
private Hospital hospital;

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}
public List<Encounter> getEncounters() {
	return encounters;
}
public void setEncounters(List<Encounter> encounters) {
	this.encounters = encounters;
}
public Hospital getHospital() {
	return hospital;
}
public void setHospital(Hospital hospital) {
	this.hospital = hospital;
}




}
