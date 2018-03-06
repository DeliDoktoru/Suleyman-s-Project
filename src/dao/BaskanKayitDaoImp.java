package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import model.Baskan;
import utility.JPAUtility;

public class BaskanKayitDaoImp  implements BaskanKayitDao{

	   EntityManagerFactory emf;
	   EntityManager em;

	public BaskanKayitDaoImp() {

		emf=JPAUtility.getEntityManagerFactory();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		
	}
	@Override
	public void baskanKayit(Baskan baskan) {

		em.getTransaction().begin();
		em.persist(baskan);
		em.getTransaction().commit();

	}
	
	

}
