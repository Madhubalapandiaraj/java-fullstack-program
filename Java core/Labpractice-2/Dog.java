package com.assignment;

public class Dog {
String name;
String breed;
 
public Dog(String name,String breed) {
	this.name=name;
	this.breed=breed;
}
public String getName() {
    return name;
}

public String getBreed() {
    return breed;
}
public void setName(String name) {
    this.name = name;
}

public void setBreed(String breed) {
    this.breed = breed;
}
public void printDogDetails() {
    System.out.println("Name: " + name + ", Breed: " + breed);
}
	public static void main(String[] args) {
		Dog dog1 = new Dog("Buddy", "Golden Retriever");
	    Dog dog2 = new Dog("Max", "German Shepherd");
	    System.out.println("Initial Details:");
	    dog1.printDogDetails();
	    dog2.printDogDetails();
	    dog1.setName("Charlie");
	    dog1.setBreed("Labrador");

	    dog2.setName("Rocky");
	    dog2.setBreed("Bulldog");
	    System.out.println("\nUpdated Details:");
	    dog1.printDogDetails();
	    dog2.printDogDetails();
	}

}
