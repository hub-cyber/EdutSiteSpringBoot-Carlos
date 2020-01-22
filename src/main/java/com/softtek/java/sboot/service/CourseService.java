package com.softtek.java.sboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.java.sboot.entity.Course;
import com.softtek.java.sboot.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository Crepository;
	
	public Course CreateCourse(Course curso) {
		return Crepository.save(curso);
	}
	
	public List<Course> getCourse(){
		List<Course> cursos = (List<Course>) Crepository.findAll();
		return cursos;
	}
}
