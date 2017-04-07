package com.daxin.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
 * 
 * @author  daxin 
 * 
 * @email leodaxin@163com
 * 
 * @date 2017年4月7日 下午7:47:57
 * 
 */
public class NewSingleThreadExecutorMain {
	public static void main(String[] args) {
		
		/**
		 * 实际上是返回的是FinalizableDelegatedExecutorService，是ThreadPollExecutor的代理对象
		 * <br><br>
		 * 内部创建ThreadPollExecutor使用的还是LinkedBlockingQueue任务队列
		 */
		 ExecutorService st = Executors.newSingleThreadExecutor();
		 
		 System.out.println(st.getClass().getName());
		 
		 
		
	}

}
