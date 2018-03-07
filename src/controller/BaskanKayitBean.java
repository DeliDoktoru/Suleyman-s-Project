package controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.BaskanKayitDao;
import dao.BaskanKayitImp;
import model.Baskan;

@ManagedBean(name="kayitBaskan")
@SessionScoped
public class BaskanKayitBean {
	private String name;
	private String surname;
	private String tel;
	 
	private BaskanKayitDao baskanKayitDao=new BaskanKayitImp();
	
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
	
	public String kaydet(){
		Baskan baskan=new Baskan();
		baskan.setName(name);
		baskan.setSurname(surname);
		baskan.setTel(tel);
		
		baskanKayitDao.kayit(baskan);
		
		return "Anasayfa.xhtml?faces-redirect=true";

	
	}
	
	
	
	

}
