package com.daxin;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 邮箱爬虫
 * 
 * 
 * @author 青春常驻Dax1n
 *
 */
public class EmailSpider {
	
	public static void main(String[] args) throws Throwable {
		
		InputStreamReader in=new InputStreamReader(new FileInputStream("mail.html"),"UTF-8");
		BufferedReader br=new BufferedReader(in);
		
		
		String s=br.readLine();
		StringBuffer sb=new StringBuffer();
		while(s!=null){
			sb.append(s);
			s=br.readLine();
		}
		
 //将所有的拼接一起的原因是避免有@符号之前回车的情况，其实不这么做也可以
		List<String> mails=getEMail(sb.toString());
		
		System.out.println("邮箱分别如下：");
		
		for(String m:mails){
			System.out.println(m);
		}
	
		
	}
	
	public static List<String> getEMail(String str){
		String reg="\\w{1,50}@\\w{2,10}\\.com";
		List<String> mails=new ArrayList<String>();
		 
		Pattern p=Pattern.compile(reg);
		Matcher m = p.matcher(str);
		while(m.find()){
			mails.add(m.group());
			
		}
		return mails;
	}

}
