package com.madhu;
//types of methods in java
public class Method {
    void myMethod1() {
    	System.out.println("instance or object method");
    }
    static void myMethod2() {
    	System.out.println("static or class method");
    }
	public static void main(String[] args) {
		Method obj=new Method();
		obj.myMethod1();

		Method.myMethod2();
	}

}
