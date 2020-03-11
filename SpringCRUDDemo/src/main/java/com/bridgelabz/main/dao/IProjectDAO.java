package com.bridgelabz.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.main.dto.Project;

public interface IProjectDAO extends JpaRepository<Project, Integer> {
	
}
