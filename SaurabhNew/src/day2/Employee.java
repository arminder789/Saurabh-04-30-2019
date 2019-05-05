package day2;

public class Employee {
	
	int salary;
	
	int bonus;
	
	// normal constructor
	
	  Employee() {
		System.out.println("I am a constructor");
		
		salary = 7000;
		bonus = 2000;
	}
	  
	  // parameterized constructor
	 
	  Employee(int salary, int bonus){
		 this.salary = salary;
		 this.bonus = bonus;
		 
	 }
	
	void calculateSalary() {
		
	int   totalSalary = salary + bonus;
	
	System.out.println("Total salary : " + totalSalary);  
	  
	}
	
	int calculateSalary1() {
		
		int totalSalary = salary + bonus;
		
		return totalSalary;
	}
	
	int CalculateSalary2(int sal, int bon) {
		
		int totalSalary = sal + bon;
		
		return totalSalary;
	}
	
	int CalculateSalary3(int salary, int bonus) {
		
		int totalSalary = this.salary + this.bonus;
		
		return totalSalary;
	}

}
