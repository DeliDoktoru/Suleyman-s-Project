package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.TableGenerator;


@Entity
@NamedQueries({
	@NamedQuery(name="Login.control",query="Select e from Login e where  e.username=:username and e.password=:password"),
	@NamedQuery(name="Login.fidAll",query="Select e from Login e"),
	@NamedQuery(name="Login.fidById",query="Select e from Login e where e.id=:id"),
	@NamedQuery(name="Login.fidByUserName",query="Select e from Login e where e.username=:username"),
	@NamedQuery(name="Login.fidAllBypassword",query="Select e from Login e where e.password=:password"),
	
	
})

public class Login {
//asdadasdas
<<<<<<< HEAD
	@Id
=======
	//deneme
	//deneme2
>>>>>>> 10d2252990fac61ecbcf55abf37c9035685851b2
	@TableGenerator(name="LOGÝN_GEN")
	@GeneratedValue(generator="LOGÝN_GEN")
	private String id;
	private String  username;;
	private String password;

	
	
	public Login() {
		super();
	}
	public Login(String id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
