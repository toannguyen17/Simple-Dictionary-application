package app.controller;

import app.service.Translate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@Autowired
	private Translate translate;

	@GetMapping(value = "/", produces = "text/plain;charset=UTF-8")
	public String index(){
		return "index";
	}

	@PostMapping(value = "/", produces = "text/plain;charset=UTF-8")
	public String indexPost(@RequestParam String text, Model model){
		String trans = translate.trans(text);
		model.addAttribute("translate", trans);
		model.addAttribute("text", text);
		return "index";
	}
}
