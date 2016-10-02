package com.daxin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Matcher
 * 
 * @author Dax1n
 *
 */
public class Main7 {

	public static void main(String[] args) {
		
		String s="123-45632-235-88";
		
		Pattern p=Pattern.compile("\\d{3,5}");
		
		Matcher m = p.matcher(s);
		
		p("m.matches() : "+m.matches());// 调用matches之后，匹配的指针已经不再字符串的最开始
		
		m.reset();//重置匹配位置到字符串的开始
		
		p(m.find());//找匹配的字串
		p(m.start()+" "+m.end());//start是匹配上的字符串的开始位置，end是匹配上的结束的位置
		p(s.substring(m.start(), m.end()));
		
		
		p(m.find());
		p(m.start()+" "+m.end());//start是匹配上的字符串的开始位置，end是匹配上的结束的位置
		p(m.find());//如果找不到的话调用start和end报错
		p(m.start()+" "+m.end());//start是匹配上的字符串的开始位置，end是匹配上的结束的位置
		
		p("lookingAt:");
		p(m.lookingAt());//lookingAt是从开始的位置开始找
		p(m.lookingAt());//也是从头找
		p(m.lookingAt());//也是从头找
		p(m.lookingAt());//也是从头找
		
		
		
		
				

	}

	public static void p(Object obj) {

		System.out.println(obj);
	}

}
