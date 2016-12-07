package com.daxin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Hello world!
 *
 */
public class ThreadPool {
	public static void main(String[] args) throws Exception {

		// 模拟远程序列化任务到work目录
		Task task = new Task("PrintTimeTask");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
				"work/" + task.getTaskName()));
		out.writeObject(task);
		out.close();

		// 模拟本地获取远程序列化任务并执行
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		File taskFile = new File("work/" + task.getTaskName());

		// 任务存在，执行任务
		if (taskFile.exists()) {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					taskFile));
			Task remoteTask = (Task) in.readObject();
			threadPool.execute(remoteTask);
			threadPool.shutdown();

		} else {

			System.out.println("没有找到远程提交的序列化任务...");
		}

	}

}
