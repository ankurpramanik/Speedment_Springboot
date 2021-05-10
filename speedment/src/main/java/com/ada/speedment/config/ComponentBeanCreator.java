package com.ada.speedment.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ada.speedment.zdb.SpeedmentDbApplication;
import com.ada.speedment.zdb.training.public_.employee.EmployeeManager;
import com.ada.speedment.zdb.training.public_.student.StudentManager;
import com.ada.speedment.zdb.training.public_.studentmarks.StudentMarksManager;
import com.speedment.runtime.join.JoinComponent;

@Configuration
public class ComponentBeanCreator {

	@Autowired
	private SpeedmentDbApplication speedmentDbApplication;

	@Bean
	public JoinComponent getBeanJoinComponent() {
		return speedmentDbApplication.getOrThrow(JoinComponent.class);

	}
	
	@Bean
	public StudentManager getBeanStudentManager() {
		return speedmentDbApplication.getOrThrow(StudentManager.class);

	}

	@Bean
	public StudentMarksManager getBeanStudentMarksManager() {
		return speedmentDbApplication.getOrThrow(StudentMarksManager.class);

	}

	@Bean
	public EmployeeManager getBeanEmployeeManager() {
		return speedmentDbApplication.getOrThrow(EmployeeManager.class);

	}

}
