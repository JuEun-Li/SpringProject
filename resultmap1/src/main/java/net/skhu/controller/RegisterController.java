package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


import net.skhu.dto.Register;
import net.skhu.mapper.RegisterMapper;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	RegisterMapper registerMapper;

	@RequestMapping("list")
	public String list(Model model) {
		List<Register> registers = registerMapper.findAll();
		model.addAttribute("registers", registers);
		return "register/list";
	}

}
