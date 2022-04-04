package com.MavenProject;

import com.baseClass.Base_Class1;

public class Pojo  {
public static void main(String[] args) {
	Base_Class1 bc=new Base_Class1();
	String name=bc.getName();
	System.out.println(name);
	
	bc.setName("AGOY");
	String name2 = bc.getName();
	System.out.println(name2);
}
}
