package com.assignment;

class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Software Engineer", 5000);
        employee.printDetails();
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());

        employee.updateSalary(6000);
        employee.printDetails();
    }
}

