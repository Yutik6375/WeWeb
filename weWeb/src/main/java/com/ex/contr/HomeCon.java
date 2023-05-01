package com.ex.contr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeCon{
	@GetMapping("index")
	public String index() {
		return "index";
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