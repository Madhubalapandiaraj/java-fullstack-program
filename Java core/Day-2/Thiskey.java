package com.madhu;

public class Thiskey {
String name;
Thiskey(String name){
	this(10,20);
	this.name=name;
	this.greeting();
}
Thiskey(int a,int b){
	System.out.println("sum: "+ (a+b));
}
void greeting() {
	System.out.println("welcome  " + name);
}
	public static void main(String[] args) {
	Thiskey obj=new Thiskey("madhu");

	}

}
