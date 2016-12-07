package com.daxin;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable, Serializable {

	private String taskName;

	public Task(String taskName) {
		super();
		this.taskName = taskName;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	private static final long serialVersionUID = 1L;

	@Override
	public void run() {

		Thread.currentThread();

		System.out.println("任务开始...");
		try {
			Thread.sleep(5000);
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("任务结束...");
		
		

	}

}
