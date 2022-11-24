import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bougatf.ahmed.entities.User;
import com.bougatf.ahmed.service.UserServiceImpl;


@RestController
@RequestMapping("/login")
@CrossOrigin
public class UserController {
	@Autowired
	UserServiceImpl MaisonService;
	
	@RequestMapping(method = RequestMethod.POST)
	public User createMaison(@RequestBody User user) {
	return MaisonService.saveUser(user);
	}

}
