package com.daxin.threadsafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

/**
 * �̰߳�ȫ�Ķ���
 * 
 * 
 * @author �ഺ��פDax1n
 *
 */
public class Main {
	public static void main(String[] args) {

		//�̰߳�ȫ��
		StringBuffer sb=new StringBuffer();
		
		//�̰߳�ȫ�ģ�һ�㿼���̰߳�ȫ���Կ���Vector������һ�����Ǽ�ʱ�����̰߳�ȫ��Ҳ��ѡ��һ��ѡ����ʹ��Collections��ͬ������
		Vector<String> v=new Vector<String>();
		
		//�̰߳�ȫ�ģ�  HashMap���̲߳���ȫ��
		Hashtable<String, String> ht=new Hashtable<String, String>();
		
		
		
		//����ʹ��Collections��ȡ��Ӧ���̰߳�ȫ����
//		Collections.synchronizedList(list)
//		Collections.synchronizedMap(m)
//		Collections.synchronizedSet(s)
//		Collections.synchronizedSortedMap(m)
//		Collections.synchronizedSortedSet(s)
		
		
		//����:list����һ���̰߳�ȫ��list
		List<String>  list=Collections.synchronizedList(new ArrayList<String>());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
