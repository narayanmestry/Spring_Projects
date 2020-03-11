package com.bridgelabz.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.main.dao.IProjectDAO;
import com.bridgelabz.main.dto.Project;

@Service
public class IProjectServiceImpl implements IProjectService {

	@Autowired
	IProjectDAO projectdao;
	
	
	@Override
	public List<Project> getAllProjectList() {
		return projectdao.findAll();
	}


	@Override
	public void createProject(Project project) {
		projectdao.save(project);
	}

}
