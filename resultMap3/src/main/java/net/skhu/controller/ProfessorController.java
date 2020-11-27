package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Professor;
import net.skhu.mapper.CourseMapper;
import net.skhu.mapper.ProfessorMapper;

@Controller
public class ProfessorController {

	@Autowired
	ProfessorMapper professorMapper;
	@Autowired
	CourseMapper courseMapper;

	@RequestMapping("professor/list")
	public String list(Model model) {
		List<Professor> professors = professorMapper.findAll();
		for (Professor professor : professors)
			professor.setCourses(courseMapper.findByProfessorId(professor.getId()));
		//위 세줄에 의해 교수 목록이 조회, 교수DTO객체에 채우게 됨.
		
		model.addAttribute("professors", professors);
		return "professor/list";
	}

}
