package com.suji.Revaturecontroller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.suji.RevatureApplication.User;
import com.suji.RevatureService.UserService;

@Controller
@RequestMapping(value="User")

public class UserController {
	@Autowired
	public UserService userService;
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listBook(ModelMap modelMap) {
    System.out.println("ListController called");
    List<User> users = userService.findAll();
	modelMap.addAttribute("users", users);
	return "user/Listuser";
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
public String register()
{
		System.out.println("RegisterController called");
		
return "user/userregister";	
}
	@RequestMapping(value ="/changes",method = RequestMethod.GET)
	public String update(){
		System.out.println("ChangesController called");
			
			return "user/changepassword";
			
	   
	}
	@RequestMapping(value="/process",method=RequestMethod.GET)
	
		public String processChange()
		{
		return "user/processchangePWD";
		}
	
	
	
	@RequestMapping(value = "/loginuser", method = RequestMethod.POST)
      public String addUser(@RequestParam("id") String id ,@RequestParam("name") String name ,
		@RequestParam("username") String username,  @RequestParam("password") String  password,
		@RequestParam("mobileno") String mobileno ,@RequestParam("emailid") String emailid, 
		@RequestParam("active") String active,@RequestParam("role") String role) {
	System.out.println("UserLoginController called");
	User user = new User(Integer.parseInt(id),name,username,password,mobileno,emailid,Boolean.valueOf(active),
		role);
	System.out.println("Inside the controller");
	userService.save(user);
return "user/adduser";
}
	@RequestMapping(value="/loginpage",method = RequestMethod.GET)
	public String loginPage()
	{
		System.out.println("LoginpageController called");
		return "home";
	}
	@RequestMapping(value = "/signedin",method = RequestMethod.POST)
	public String loginUser(@RequestParam("username") String username,@RequestParam("password") String password,HttpSession session)
	{
		System.out.println("UserController called");
		User user = userService.login(username,password);
		
		if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
			session.setAttribute("Logged in user", user);
			
			System.out.println("success");
			return "redirect:../Book/book";
			}
		else
		{
			System.out.println("failure");
		return "home";
		
		}
		
	}
	@GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:../User/loginpage";
    }
}
                                                                                         