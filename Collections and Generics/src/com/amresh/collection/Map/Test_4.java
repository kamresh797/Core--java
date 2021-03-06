package com.amresh.collection.Map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Properties;

public class Test_4 {
	public static void main(String[] args)throws Exception {
		
		
		Properties p=new Properties();
		p.load(new FileInputStream("src\\Employee.properties"));
	
		System.out.println("eid:"+p.getProperty("eid"));
		System.out.println("name:"+p.getProperty("ename"));
		System.out.println("desig:"+p.getProperty("desig"));
		System.out.println("company:"+p.getProperty("company"));
	
		System.out.println("abc:"+p.getProperty("abc"));
		System.out.println("abc:"+p.getProperty("abc","abc key is not found"));
		
		p.setProperty("exp","since 2004");
		Enumeration e =p.propertyNames();
		
		while(e.hasMoreElements()) {
			System.out.println(p.getProperty((String)e.nextElement()));
		}
		p.list(new PrintStream(new FileOutputStream("List Result.properties")));
		p.store(new PrintStream(new FileOutputStream("Store Result.properties")),"Emp details");
	}
}
