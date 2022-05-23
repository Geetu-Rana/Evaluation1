package com.evaluation1Q1;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	public void displayCourseDetails() {
		Course details = new Course();
		details.courseId = 101;
		details.courseName = "web Develeopment";
		details.courseFee = 50000;
		System.out.println(details.courseId );
		System.out.println(details.courseName);
		System.out.println(details.courseFee);
	}
	public static void authenticate(String username, String password) {
		Course c1 = new Course();
		if(username.equals("Admin")& password.equals("1234")) {
			c1.displayCourseDetails();
		}else {
			System.out.println("Invalid Username or password");
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("username :");
		String username = scanner.next();
		System.out.println("Password");
		String password = scanner.next();
		
		
		
		
		authenticate(username, password);
		
		
		
	}
	
	
}
