package controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


import org.primefaces.context.RequestContext;

import dao.LoginDao;
import dao.LoginDaoImp;


@ManagedBean
@SessionScoped
public class LoginBean {
	
	private String name;
	private String password;
	

	
	private LoginDao loginDao=new LoginDaoImp(); 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	

	
	public String login(){
	if(loginDao.login(name, password)){
			
			return "Anasayfa.xhtml?faces-redirect=true";
			
		}
	
		RequestContext.getCurrentInstance().update("grow1");
		FacesContext context=FacesContext.getCurrentInstance();
		context.addMessage(null, new  FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Parolanýz veya Þifreniz Hatalý"));
		return "";
	}

}
