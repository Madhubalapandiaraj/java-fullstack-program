package com.assignment;

public class Person {
String name;
int age;
 public Person(String name,int age){
	this.name=name;
	this.age=age;
}
public void  printPersonDetails() {
	System.out.println("name"+name+",age"+ age);
}
	public static void main(String[] args) {
		Person person1 = new Person("madhu", 30);
	    Person person2 = new Person("dhachu", 25);

	    person1.printPersonDetails();
	    person2.printPersonDetails();

	}

}
