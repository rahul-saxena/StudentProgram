import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	// Student class to pring studentid, marks, Year of engineering, residential status
		    Student objStudent= new Student();
		    objStudent.setName(args[0]);
		    objStudent.setStudentId(Integer.parseInt(args[1]));
		    objStudent.setQualilfyingExamMarks(Float.parseFloat(args[2]));
		    objStudent.setYearOfEngg(Integer.parseInt(args[3]));
		    objStudent.setResidentialStatus(args[4]);
		    System.out.println("***************Student Information*****************\n\n");
		    
		    System.out.println("Student Name            :" + objStudent.getName());
		    System.out.println("Student ID              :" + objStudent.getStudentId());
		    System.out.println("Marks                   :" + objStudent.getQualilfyingExamMarks());
		    System.out.println("Year Of Engg            :" + objStudent.getYearOfEngg());
		    System.out.println("Residential Status      :" + objStudent.getResidentialStatus());
	*/    
	
	/*  // Test for Rectangle Class with user defined input
		
		    Rectangle objRectangle=new Rectangle();
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter length of rectangle");
		    objRectangle.setLength(sc.nextInt());
		    System.out.println("Enter length of rectangle");
		    objRectangle.setWidth(sc.nextInt());
		    int areaRectangle=objRectangle.getArea();
		    System.out.println("Area of rectangle" + areaRectangle);
	*/
		
	/* // Record of 5 employees (Name and Salary) and calculate Average and print employees with salary greater/less than average
		double salary[]= {23500.0,25080.0,28760.0,22340.0,19890.0};
		int i=0,gta=0;
		double sum=0, avg;
		for (i=0;i<salary.length;i++)
		{
		sum+=salary[i];
		}
		avg=sum/salary.length;
		System.out.println("The average salary of employees is :" + avg);
		
		for (i=0;i<salary.length;i++)
		{
			if (salary[i]>avg) 
			{
			gta++;
			}
		}
		System.out.println("The number of employees having salary greater than average is :" + gta);
		System.out.println("The number of employees having salary less than average is :" + (salary.length-gta));
	*/
	
	/*
	// Chocolate Class
		Chocolate objchocolate=new Chocolate();
		objchocolate.setName("Neuhaus");
		System.out.println("Barcode:" + objchocolate.barcode);
		System.out.println("Name:" + objchocolate.name);
		System.out.println("Weight:" + objchocolate.weight);
		System.out.println("Price:" + objchocolate.cost);
	*/
		
	/*
	// Home Loan class
		HomeLoan objHomeLoan=new HomeLoan();
		double amount=objHomeLoan.calculateEMI();
		System.out.println("EMI per year for Loan is:" + amount);
	*/
		
	
	/*
	// Permanent and Contract employee salary calculation
		PermanentEmployee objPermanentEmployee=new PermanentEmployee();
		objPermanentEmployee.setName("Anil");
		objPermanentEmployee.setEmpId(101);
		objPermanentEmployee.setBasicPay(10000);
		objPermanentEmployee.setHRA(1500);
		objPermanentEmployee.setExperience(3);
		objPermanentEmployee.calculateSalary();
		System.out.println("Permanent Employee: Your salary is:" + objPermanentEmployee.salary);
		System.out.println("Permanent Employee");
		ContractEmployee objContractEmployee=new ContractEmployee();
		objContractEmployee.setHours(160);
		objContractEmployee.setWages(23);
		objContractEmployee.calculateSalary();
		System.out.println("Contract Employee: Your salary is:" + objContractEmployee.salary);
	*/
		
	/*
	 // Player Rating	
		PlayerRating objPR=new PlayerRating(1,"Beckham");
		objPR.calculateAverageRating(9f, 9.9f);
	*/
		
	/*
	 // EventRegistration super construct overrisding	
		EventRegistration obj= new SingleEventRegistration("Rahul","PlayAway",1);
		obj.registerEvent();
	*/
	
	/*
	// static variable
		Loan l1=new Loan();
		Loan l2=new Loan();
		Loan l3=new Loan();
		Loan l4=new Loan();
		Loan l5=new Loan();
		System.out.println ("number of instances" + Loan.loanCounter);
	*/
	
	/*
	// Employee rating
		 
		Employee e=new Employee();
		e.setPoint(83);
		int rating=PerformanceRating.calculatePerformance(e);
		System.out.println("Rating for Employee:" + rating);
	*/
	}

}
