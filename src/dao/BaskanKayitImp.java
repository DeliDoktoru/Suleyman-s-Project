package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import model.Baskan;
import utility.JPAUtility;

public class BaskanKayitImp implements BaskanKayitDao{
	   EntityManagerFactory emf;
	   EntityManager em;

	public BaskanKayitImp() {

		emf=JPAUtility.getEntityManagerFactory();
		
	

		
	}

	@Override
	public void kayit(Baskan baskan) {
			em=emf.createEntityManager();
		try{
	
		em.getTransaction().begin();	
		em.persist(baskan);
		em.getTransaction().commit();
		}
		catch(Exception e)
		{
			em.getTransaction().rollback();
		}finally{
			if(em.isOpen())
				em.close();
			
		}
		
		
	}
	
	
}


