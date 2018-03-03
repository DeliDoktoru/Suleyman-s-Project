package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.TableGenerator;

@Entity
public class Login {
//asdadasdas
	@TableGenerator(name="LOGÝN_GEN")
	@GeneratedValue(generator="LOGÝN_GEN")
	private String id;
	private String  adi;
	private String password;

	public Login( String adi, String password) {

		this.adi = adi;
		this.password = password;
		//deneme
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getPassword() {
		return password;
	}

	private void newMethod() {
		// TODO Auto-generated method stub

	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
