package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/third")
public class ThirdController {

	@RequestMapping("test1")
	public String test1(Model model) {
		Student student = new Student(0, "201714029", "이주은", "wndms61@gmail.com");
		model.addAttribute("student", student);
		return "third/test1";
	}

	@GetMapping("test2")
	public String test2(Model model) {
		model.addAttribute("student", new Student(0, "", "", ""));
		return "third/test2";
	}

	@PostMapping("test2")
	public String test2(Model model, Student student) {
		model.addAttribute("message", "성공적으로 저장 되었습니다.");
		return "third/test2";
	}
}