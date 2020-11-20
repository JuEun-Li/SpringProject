package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Test1Controller {
	@GetMapping("exam1/test1")
	public String text1(Model model) {
		return "exam1/test1";
	}
	
	@GetMapping("exam1/test2")
	public String text2(Model model) {
		return "exam1/test2";
	}
	
	@PostMapping("exam1/test2")
	public String text2(Model model, String color) {
		model.addAttribute("color", color);
		return "exam1/test2";
	}
	
	@GetMapping("exam1/test3")
	public String text3(Model model) {
		return "exam1/test3";
	}
	
	@PostMapping("exam1/test3")
	public String text3(Model model, Integer number1, Integer number2) {
		model.addAttribute("number1", number1);
		model.addAttribute("number2", number2);
		model.addAttribute("number3", number1 + number2);
		return "exam1/test3";
	}
}
