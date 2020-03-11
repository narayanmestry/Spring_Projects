package com.bridgelabz.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.main.dto.Project;
import com.bridgelabz.main.service.IProjectService
;

@RestController 

public class ProjectController {
	
	@Autowired
	IProjectService projService;
//	@GetMapping("/")
	@RequestMapping("/projects")
	public List<Project> getProjectList()
	{
		return projService.getAllProjectList();
	}
	
//	@PostMapping("/")
	@RequestMapping(method = RequestMethod.POST,value = "/projects")
	public void addProject(@RequestBody Project project)
	{
		projService.createProject(project);
	}
}
