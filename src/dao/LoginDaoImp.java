package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


import model.Login;
import utility.JPAUtility;

public class LoginDaoImp implements LoginDao{
	   EntityManagerFactory emf;
	   EntityManager em;

	public LoginDaoImp() {

		emf=JPAUtility.getEntityManagerFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		
	}

	@Override
	public boolean login(String username, String password) {
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
