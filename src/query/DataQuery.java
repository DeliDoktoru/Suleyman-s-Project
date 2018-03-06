package query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Login;

public class DataQuery {
   EntityManagerFactory emf;
   EntityManager em;
public DataQuery() {
	
	emf=Persistence.createEntityManagerFactory("EmployeePersistenceUnit");	
	em=emf.createEntityManager();
	em.getTransaction().begin();
	
	
	
}
 
  public boolean loginControl(String username,String password){
	
	  try {
		  Login login=em.createNamedQuery("Login.control",Login.class).setParameter("username", username).setParameter("password", password).getSingleResult();
		if(login!=null){
			return true;
		}
		
		return false;
	} catch (Exception e) {
		// TODO: handle exception
        return false;
	  }
	  
}
   
   
	
}
