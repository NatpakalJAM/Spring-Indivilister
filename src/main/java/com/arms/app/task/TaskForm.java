package com.arms.app.task;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class TaskForm {

	private int id;

	@NotBlank(message = "Please input task")
	private String name;

	private int projectId;
}
