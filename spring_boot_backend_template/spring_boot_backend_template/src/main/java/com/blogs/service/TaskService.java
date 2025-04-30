package com.blogs.service;

import java.util.List;


import com.blogs.entity.Task;

public interface TaskService {
	 List<Task> getalltask();
	  Task add(Task task);
	  Task update(Long id,Task task);
	  String deleteTask(Long id); 

}
