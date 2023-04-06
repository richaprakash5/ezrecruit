package com.example.demoRecruit.rest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoRecruit.entity.UserProfileDetails;
import com.example.demoRecruit.entity.Users;
import com.example.demoRecruit.service.UsersService;

@CrossOrigin(origins = "http://localhost:4200") 
@RestController
@RequestMapping("/api")
@ComponentScan({"com.example.demoRecruit.service"})
@EnableJpaRepositories("com.example.demoRecruit.repository")
@EntityScan("com.example.demoRecruit.domain")
public class LoginController {
	
	private UsersService userService;

	  @Autowired 
	  public LoginController(UsersService service) {
		  
		  userService = service; 
	  }
	  
	  @GetMapping("/profile/{theUsername}")
		public Users userProfile(@PathVariable String theUsername) {
		  System.out.println("username : " + theUsername);
			return userService.fetchUserByUsername(theUsername);
		}
	
	@PostMapping("/login")
	public Map login(@RequestBody Users user) throws Exception  {
		JSONObject obj = new JSONObject();
		System.out.println("User : " + user.getUsername() +"::"+ user.getPassword() +"::" + user.getRole());
		if ((user.getUsername() != null && user.getUsername()!="") 
				&& (user.getPassword() != null && user.getPassword() !="") 
				&& (user.getRole() != null && user.getRole() !="")) 
			{
				Users loginUser = userService.fetchUserById(user.getUsername(), user.getPassword(), user.getRole());
				if (loginUser != null) {
					//String role = loginUser.getRole();
					//obj.put("Role", role);
					obj.put("status", "Success");
					String timeStamp = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(Calendar.getInstance().getTime());
					System.out.println("Time : " + timeStamp);
					System.out.println("USername : " + loginUser.getUsername());
					System.out.println("Last_login : " + loginUser.getLast_login());
					System.out.println("Login_history : " + loginUser.getLogin_history());
					//loginUser.setUpdated_date(timeStamp);
					loginUser.setLast_login(loginUser.getLogin_history());
					loginUser.setLogin_history(timeStamp);
					
					userService.save(loginUser);
					System.out.println("USername : " + loginUser.getUsername());
					System.out.println("Last_login final: " + loginUser.getLast_login());
					System.out.println("Login_history final: " + loginUser.getLogin_history());
				}else {
					throw new Exception("Invaild User!! User not found in our DB");
				}
			} else {
				throw new Exception("Invalid Credentials!");
		}

	 return obj.toMap();
	

}

}
