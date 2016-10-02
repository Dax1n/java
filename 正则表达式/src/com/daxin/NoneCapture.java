package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoneCapture {

	// 非捕获
	
	public static void main(String[] args) {
		
		Pattern p1=Pattern.compile("(?=a).{3}");//(?=a)写在前面是捕获

		
		Pattern p=Pattern.compile(".{3}(?=a)");
		String s="abca456";//三个字符而且三个字符后面是一个a。这样的字符提取出来，但是不把最后一个a提出出来

		Matcher m = p.matcher(s);
		
		if(m.find()){
			System.out.println(m.group());
		}else{
			System.out.println("not found...");
		}
		
		
	}
}
