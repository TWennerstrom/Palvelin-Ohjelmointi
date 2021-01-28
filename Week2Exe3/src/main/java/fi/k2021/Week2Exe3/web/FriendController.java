package fi.k2021.Week2Exe3.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendController {

	
	ArrayList<String> friendList= new ArrayList<>();
	@RequestMapping("index")
	public String newFriend(@RequestParam(name="name", required = false) String friend, Model model) {
		if (friend != null && friend.length() >= 3) {
			friendList.add(friend);
		}
		model.addAttribute("friends", friendList);
		return "friendInfo";
	}
}
