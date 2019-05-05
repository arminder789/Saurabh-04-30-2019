package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		
     Employee Saurabh = new Employee();
     
     Saurabh.salary = 9000;
     Saurabh.bonus = 1000;
     
     Saurabh.calculateSalary();
     
     //-------------------------------------------
     
     Employee anjul = new Employee();
     
     anjul.salary = 5000;
     anjul.bonus = 500;
     
    int anjulSalary =  anjul.calculateSalary1();
    
    System.out.println("anjulSalary : "+ anjulSalary);
    
    //-----------------------------------------------------
    
    Employee raju = new Employee();
    
    raju.salary = 14000;
    raju.bonus = 3000;
    
    int rajuSalary = raju.CalculateSalary2(4000, 3000);
    
		System.out.println("raju salary : "+ rajuSalary);
		
  //------------------------------------------------------------
		
		Employee rahul = new Employee();
		
		rahul.salary = 20000;
		rahul.bonus = 10000;
		
		int rahulSalary = rahul.CalculateSalary3(1000, 500);
		
		
		
		System.out.println("rahul salary : "+ rahulSalary);
    }

}
