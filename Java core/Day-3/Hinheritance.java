package com.madhu;
class Vehicle1{
	void noOfEngine() {
		System.out.println("I hava one engine");
	}
}
class TwoWheeler2 extends Vehicle1{
	void noOfWheels() {
		System.out.println("I have two wheels");
		}
}
class Bike2 extends TwoWheeler2{
	void brandName() {
		System.out.println("Brand name is honda");
	}
}
class Scooty extends TwoWheeler1{
	void brandName() {
		System.out.println("Brand name is activa");
	}
}
public class Hinheritance {

	public static void main(String[] args) {
		Bike2 bike=new Bike2();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
		
Scooty scooty=new Scooty();
scooty.noOfEngine();
scooty.noOfWheels();
scooty.brandName();
	}

}
