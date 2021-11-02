package com.te.demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class MainClass {
	 
	static Scanner sc=new Scanner(System.in);
	static void display() {
		System.out.println("To check details follow the instructions"+"\n"+1+"-for Id"+"\n"+2+"-for name"+"\n"+3+"-for marks"+"\n"+4+"-for age"+"\n");
		
	}
	
	public static void main(String[] args) {
		ArrayList<Student1> List = new ArrayList<Student1>();
		List.add(new Student1(20, "Hema", 70, 22));
		List.add(new Student1(22, "Aishwarya", 80, 23));
		List.add(new Student1(19, "Harshitha", 85, 20));
		List.add(new Student1(10, "Suma", 50, 15));
		
		int n=1;
		while(n>=1&&n<=4) {
			display();
			n=sc.nextInt();
			if(n==1) Collections.sort(List, new StudentId());
			else if(n==2) Collections.sort(List, new StudentName());
			else if (n==3) Collections.sort(List, new StudentMarks());
			else Collections.sort(List, new StudentAge());
			System.out.println(List);
			System.out.println("want to sort again");
			System.out.println("Type "+"Yes"+"Or"+"No");
			String st=sc.next();
			if(st.equals("No")) {
			n=5;
			}
			}
	
			 }
			}

	



