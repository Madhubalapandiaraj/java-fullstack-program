package com.madhu;
//types of variables in java
public class Variables {
int b=20;//instance or object variable
static int c=30;//static or class variable
	public static void main(String[] args) {
		int a=10;//local variable
		System.out.println("local variable:"+a);
		
		Variables obj=new Variables();
		System.out.println(obj.b);
		System.out.println(Variables.c);

	}

}
