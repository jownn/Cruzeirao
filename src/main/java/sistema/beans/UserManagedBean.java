package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import sistema.modelos.User;
import sistema.service.UserService;

 
@ManagedBean
public class UserManagedBean {
     
	private User user = new User();
	private UserService service = new UserService();
    
    public String salvar() {
    	service.salvar(user);
		user = new User();
        return "inicio.xhtml";
    }
    
    public String voltar() {
        return "login.xhtml";
    }
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return service.getUsers();
	}

	
}