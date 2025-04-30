package com.blogs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.blogs.dao.TaskDao;

import com.blogs.entity.Task;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class TaskServiceImpl  implements TaskService {
	@Autowired
	private TaskDao taskDao;

	@Override
	public List<Task> getalltask() {
		
		return taskDao.findAll();
	}

	@Override
	public Task add(Task task) {
		
		return taskDao.save(task);
	}

	@Override
	public Task update(Long id, Task e) {
		Optional<Task> emp=taskDao.findById(id);
		if(emp.isPresent()) {
			Task em=emp.get();
			em.setTaskName(e.getTaskName());;
			em.setTaskDuration(e.getTaskDuration());
			
			return taskDao.save(em);
			
		}
		else
		{
			throw new RuntimeException("Task not found with ID : "+ id);  
		}

	}

	@Override
	public String deleteTask(Long id) {
		
		if(taskDao.existsById(id)) {
			taskDao.deleteById(id);
			return "task deleted by "+id;
		}
		else {
			return "task not found by "+id;
		}
	}
}
