package com.bridgelabz.main.service;

import java.util.List;

import com.bridgelabz.main.dto.Project;

public interface IProjectService {
	
	List<Project> getAllProjectList();

	void  createProject(Project project);
	
}
