package e1_onetomany_hibernatee1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import e1_onetomany_hibernatee1.dao.SchoolCrud;
import e1_onetomany_hibernatee1.dao.StudentCrud;
import e1_onetomany_hibernatee1.dto.School;
import e1_onetomany_hibernatee1.dto.Student;

public class SchoolStudentMain {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		StudentCrud crud=new StudentCrud();
		
         SchoolCrud crud2=new SchoolCrud();
		 
//		 Student  s1=new Student();
//		 s1.setName("raju");
//		 s1.setPhone(23456789);
//		 s1.setAddress("BLR");
//		 s1.setBloodgroup("B+");
//		 
//		 Student s2=new Student();
//		 s2.setName("Balu");
//		 s2.setPhone(23456789);
//		 s2.setAddress("BLR");
//		 s2.setBloodgroup("O+");
//		 
//		 Student s3=new Student();
//		 s3.setName("raju");
//		 s3.setPhone(23456789);
//		 s3.setAddress("BLR");
//		 s3.setBloodgroup("B+");
//		   
//		 List<Student>list=new ArrayList<Student>();
//		 list.add(s1);
//		 list.add(s2);
//		 list.add(s3);
//		 
//		 
//		   School school=new School();
//		   school.setName("BrHS");
//		   school.setStudents(list);
//		   school.setAddress("BLR");
//		   
//		   
//		   crud2.saveSchool(school);
//		 
//		
		
		
		
		
		
		
		
//		//student save
//		 
//	 Student s3=new Student("saan", 345678, "O+", "manglore");
//	 
//     crud.saveStudent(s3, 2);
//		 
		 
		//updating the school name
	  //  crud2.updateSchool(2, "Narayana");
//	 Student student=new Student("biden", 9876543, "A+", "AP");
//	 crud.updateStudent(1,student );
	
	//crud.getStudentByID(1);	
//	
//	System.out.println("======================");
crud2.getSchoolByID(3);
		
//	 crud2.deleteSchool(2);	
//	 crud.deleteStudent(5);
//	
//
//	 
//	 
//	 boolean back=true;
//		System.out.println("provide school name and address");
//		String schoolname=sc.next();
//		String schooladdress=sc.next();
//		List<Student>list=new ArrayList<Student>();
//		do {
//			System.out.println("Choose your option \n 1.Save student \n 2.Exit");
//			int choose=sc.nextInt();
//			switch (choose) {
//			case 1:
//			{
//				
//			
//				System.out.println("Enter Student name");
//				String name = sc.next();
//	
//				System.out.println("Enter phone number");
//				long phone = sc.nextLong();
//				System.out.println("Enter address");
//				String address = sc.next();
//
//				Student s = new Student();
//
//				s.setName(name);
//			
//				s.setPhone(phone);
//				s.setAddress(address);
//				list.add(s);
//				
//				
//			}break;
//			
//
//			case 2:back=false;
//				
//			}
//	
//			
//			
//		}while(back);
//		School s2=new School()	;
//		s2.setAddress(schooladdress);
//		s2.setName(schoolname);
//		s2.setStudents(list);
//		crud2.saveSchool(s2);
	 
	 
	 
	 
		
		

	}

}
