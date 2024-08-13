package com.madhu;

public class Consover {
 Consover (String name){
	 System.out.println("welcome"+name);
 }
 Consover(int a,int b){
	 this("madhu");
	 System.out.println("addition:"+(a+b));
 }
 Consover(int n){
	 int fact=1;
	 for(int i=1;i<=n;i++)
		 fact=fact*i;
	 System.out.println("factorial:"+fact);
 }
	public static void main(String[] args) {
        Consover obj1=new Consover(5);
	}

}
