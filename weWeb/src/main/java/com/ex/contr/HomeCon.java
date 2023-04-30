package com.ex.contr;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class HomeCon{
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("home")
	public String home() {
		return "home";
	}

	@GetMapping("lobby.html")
	public String lobby() {
		return "lobby";
	}
	
	@PostMapping("/index.html")
	public String indexJoinRoom() {
		return "index";
	}
}