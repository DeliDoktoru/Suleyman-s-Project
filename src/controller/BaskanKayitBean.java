package controller;

import javax.faces.bean.ManagedBean;

import dao.BaskanKayitDao;
import dao.BaskanKayitDaoImp;
import model.Baskan;

@ManagedBean
public class BaskanKayitBean {
	
	private String name="";
	private String surname="";
	
	private String tel="";
	private String email="";
	
	private BaskanKayitDao  baskanKayitDao=new BaskanKayitDaoImp();
	
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

	public void  kaydet(){
		baskanKayitDao.baskanKayit(new Baskan(name,surname,tel,email));
		

		
	}
	

}
