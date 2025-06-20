package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	TaskService t;
	
	@Autowired
    private UserRepository userRepository;

	@GetMapping
	public boolean getTasks(@RequestParam(name ="count", required= false,defaultValue ="0") int count , @RequestHeader(name="orgName" , required= false) String collegeName) {
	
		
		User user = new User();
		user.setEmail("abc@gmail.com");
		user.setName("test");
		
		userRepository.save(user);
		
		return t.getTask();

	}

	/*
	 * @GetMapping("/{taskId}") public boolean getTasksById(@PathVariable("taskId")
	 * int tId) { for (TaskDTO t : taskDetails) { if (t.getTaskId() == tId) {
	 * System.out.println("Task Name : " + t.getTaskName() +
	 * "is the taskName of id :" + tId); } } return true;
	 * 
	 * }
	 * 
	 * @PostMapping public boolean postTasks(@RequestBody TaskDTO taskdetails) {
	 * 
	 * taskDetails.add(taskdetails);
	 * 
	 * for (TaskDTO t : taskDetails) { System.out.println(t.toString()); } return
	 * true;
	 * 
	 * }
	 * 
	 * @PutMapping public void updateTasks() {
	 * System.out.println("Inside Update Tasks"); }
	 * 
	 * @PutMapping("/{taskId}") public void updateTaskById(@PathVariable("taskId")
	 * int tId) { System.out.println("Inside Update By Id  Tasks"); }
	 * 
	 * @DeleteMapping public void DeleteTasks() {
	 * System.out.println("Inside Delete Tasks"); }
	 */

}
