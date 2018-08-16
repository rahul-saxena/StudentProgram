package com.proximus.marks;

public class Enumcheck {
	public static void main (String[] args){
		Student obj=new Student();
		obj.setStudentID (1000);
		obj.setname("Student");
		obj.settotalMarks(250);
		obj.calculateGrade();
		obj.calculateScholarshipAmount();
		System.out.println(+ obj.getStudentID());
		System.out.println(obj.getname());
		System.out.println(obj.gettotalMarks());
		System.out.println(obj.getGrade());
		System.out.println(obj.getScholarshipAmount());
	}
	
	
}
