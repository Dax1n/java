package com.daxin.concurrent;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * @author daxin
 * 
 * @email leodaxin@163com
 * 
 * @date 2017��4��10�� ����3:45:39
 * 
 */
public class CompletionServiceMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int taskSize = 5;

		ExecutorService executor = Executors.newFixedThreadPool(taskSize);

		// ������ɷ���
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executor);
		int sleep = 5; // ˯��ʱ�䣬��λ���룬���Ǻ���
		for (int i = 1; i <= taskSize; i++) {
			int value = i; // ���ؽ��
			// ���̳߳��ύ����
			Future<Integer> result = completionService.submit(new CallbleTask(sleep, value));
			
//			System.out.println(result.getClass().getName());//java.util.concurrent.FutureTask
		//	 completionService.submit(new RunnableTask(),2);//completionService�ύRunnable�������޷���ȡ�����

		}

		// �������˳��,��ӡ���
		for (int i = 0; i < taskSize; i++) {
			try {
				System.out.println(completionService.take().get());// ������֪����������ɿ��Ի�ȡ���
				// System.out.println(completionService.poll());//pollֱ�ӷ��أ�������������û����ɵ������򷵻�null
				// System.out.println(completionService.poll(5, TimeUnit.SECONDS));//�����ȴ�ָ��ʱ�䣬�������ɽ�����أ�û�е�ֱ�ӷ���null

			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

		// ���������Ѿ����,�ر��̳߳�
		System.out.println("ִ�����....");
		executor.shutdown();
	}

}
