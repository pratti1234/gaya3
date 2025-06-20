package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.TaskDTO;

@Service
public class TaskService {
	
	static List<TaskDTO> taskDetails = new ArrayList<>();
	
	public boolean getTask()
	{
		for (TaskDTO t : taskDetails) {
			System.out.println(t);
		}
		return true;
	}

}
