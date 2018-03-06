package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Baskan {
	@Id
	@TableGenerator(name="Baskan_GEN")
	@GeneratedValue(generator="Baskan_GEN")
	private int id;
	private String name;
	private String surname;
	private String tel;
	private String email;
	
	
	
	public Baskan( String name, String surname, String tel, String email) {
	
		this.name = name;
		this.surname = surname;
		this.tel = tel;
		this.email = email;
	}
	public Baskan() {
		super();
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
