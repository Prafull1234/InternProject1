package com.java.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.java.Entity.Student;
import com.java.dao.StudentDao;

@Controller
@EnableWebMvc
public class StudentController {
	/*
	@Autowired
	StudentDao sdao;*/
	
	@RequestMapping("/getStudent")
	public ModelAndView helloworld()
	{
	/*	
		List<Student> student=sdao.getstudentinfo(20,30);*/
		String student="raj";
		
		   return new ModelAndView("StudentPage", "studentMessage", student);
	}
}
