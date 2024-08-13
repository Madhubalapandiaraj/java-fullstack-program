package com.madhu;
class A{
	int a=10;
	A(String name){
		System.out.println("welcome  "+name);
	}
	void myMethod1() {
		System.out.println("I am super class method");
	}
}
class B extends A{
	B(){
		super("madhu");
	}
	void myMethod2() {
		System.out.println("super class variable:"+super.a);
		super.myMethod1();
	}
}
public class Superkey {

	public static void main(String[] args) {
		B b=new B();
		b.myMethod2();
		b.myMethod1();
	}

}
