package com.blogs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.entity.Task;



public interface TaskDao extends JpaRepository<Task,Long> {

}
