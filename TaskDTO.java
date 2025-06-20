package com.example.demo.dto;

public class TaskDTO {

	private String taskName;

	private int taskId;

	private String taskDescription;
	
	private String orgName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	@Override
	public String toString() {
		return "TaskDTO [taskName=" + taskName + ", taskId=" + taskId + ", taskDescription=" + taskDescription
				+ ", orgName=" + orgName + "]";
	}
	
	

}
