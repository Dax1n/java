package com.daxin;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * 
 * 
 * @author Dax1n
 *
 */
public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		int[] oldData = { 1, 2, 3, 4, 5 };
		int[] newData = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		int[] data = new int[oldData.length + newData.length + 5];

		/**
		 * copyOf�����ǽ�ԭ�е��������ݣ��������������0
		 * 
		 * ArrayList�����ݾ�����ôʵ�ֵ�
		 */

		int[] nums = Arrays.copyOf(oldData, oldData.length + newData.length + 5);

		System.out.println(nums);

	}

	/**
	 * 
	 * �������ArrayListȷ�������ķ���
	 * 
	 * @param minCapacity
	 */
	public void ensureCapacity(int minCapacity) {
		//modCount����������ģ�ֻΪ�˲�����û��ʵ������
		int modCount = 0;
		//elementData����������ģ�ֻΪ�˲�����û��ʵ������
		Object[] elementData = null;
		modCount++;
		int oldCapacity = elementData.length;// �õ�Ŀǰ�����������С
		if (minCapacity > oldCapacity) { // ���Ŀǰ��������С�ڴ���Ĳ���minCapacity
			//����µ�����minCapacity����oldCapacity�Ļ�����Ҫ����
			Object oldData[] = elementData;
			
			//��һ�����ݣ�����1.5��֮��+1
			int newCapacity = (oldCapacity * 3) / 2 + 1;// ��������һ������
			if (newCapacity < minCapacity) // ��������ɵ���������С�ڴ���Ĳ���
				//�����һ�����ݻ��ǲ����Ļ���ֱ�����µ�����
				newCapacity = minCapacity;// �򽫲����������������
			elementData = Arrays.copyOf(elementData, newCapacity);// ����������newCapacity
																	// ������
		}
	}

}
