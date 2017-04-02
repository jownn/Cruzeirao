package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.User;

public class UserService {

	private ArrayList <User> users = new ArrayList<User>();
	
	public UserService()
	{

	}
	
	public void salvar(User user)
	{
	    users.add(user);
	}
	

	public List <User> getUsers()
	{
		
		return users;
		
	}
	
}
