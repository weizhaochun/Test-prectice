package com.test;

class Person {
	   String name = "No name";
	   public Person(String nm) {
	       name = nm;
	   }
	   public Person(){
		   //System.out.println("hello");
	   }
}
class Employee extends Person {
	   String empID = "0000";
	   public Employee(String id) {
	       empID = id;
	   }
}
public class Test15 {
	   public static void main(String args[]) {
	       Employee e = new Employee("123");
	       System.out.println(e.empID);
	   }
}

