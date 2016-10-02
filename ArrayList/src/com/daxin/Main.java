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
		 * copyOf方法是将原有的数组扩容，多出来的容量填0
		 * 
		 * ArrayList的扩容就是这么实现的
		 */

		int[] nums = Arrays.copyOf(oldData, oldData.length + newData.length + 5);

		System.out.println(nums);

	}

	/**
	 * 
	 * 这个就是ArrayList确保容量的方法
	 * 
	 * @param minCapacity
	 */
	public void ensureCapacity(int minCapacity) {
		//modCount是随便声明的，只为了不报错。没有实际意义
		int modCount = 0;
		//elementData是随便声明的，只为了不报错。没有实际意义
		Object[] elementData = null;
		modCount++;
		int oldCapacity = elementData.length;// 得到目前数组的容量大小
		if (minCapacity > oldCapacity) { // 如果目前数组容量小于传入的参数minCapacity
			//如果新的容量minCapacity大于oldCapacity的话，需要扩容
			Object oldData[] = elementData;
			
			//第一次扩容，乘以1.5倍之后+1
			int newCapacity = (oldCapacity * 3) / 2 + 1;// 则新生成一个容量
			if (newCapacity < minCapacity) // 如果新生成的容量依旧小于传入的参数
				//如果第一次扩容还是不够的话，直接用新的容量
				newCapacity = minCapacity;// 则将参数赋予这个新容量
			elementData = Arrays.copyOf(elementData, newCapacity);// 将数组扩大newCapacity
																	// 个长度
		}
	}

}
