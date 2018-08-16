package com.proximus.marks;



public class Student {

	enum Grade {
		A,B,C,D,E;
	}
	
	int studentID;
	String name;
	Grade grade;
	int scholarshipAmount;
	int totalMarks;
	
	int getStudentID() {
		return studentID;
	}
	
	void setStudentID (int studentID) {
		this.studentID=studentID;
	}
	
	String getname() {
		return name;
	}
	
	void setname (String name) {
		this.name=name;
	}
	
	int gettotalMarks() {
		return totalMarks;
	}
	
	void settotalMarks (int totalMarks) {
		this.totalMarks=totalMarks;
	}
	
	Grade getGrade() {
		return grade;
	}
	
	int getScholarshipAmount() {
		return scholarshipAmount;
	}
	
	
	void calculateGrade () {
		if (totalMarks >= 250)
			grade=Grade.A;
		else if (totalMarks >= 200 && totalMarks < 250)
			grade=Grade.B;
		else if (totalMarks >= 175 && totalMarks < 200)
			grade=Grade.C;
		else if (totalMarks >= 150 && totalMarks < 175)
			grade=Grade.D;
		else
			grade=Grade.E;
	}
	
	void calculateScholarshipAmount () {
		
		switch (grade) {
		case A: 
			scholarshipAmount=5000;
			break;
		case B: 
			scholarshipAmount=4000;
			break;
		case C: 
			scholarshipAmount=3000;
			break;
		case D: 
			scholarshipAmount=2000;
			break;
		default: 
			scholarshipAmount=0;
		}
		
	}
	
}
