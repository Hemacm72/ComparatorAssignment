package com.te.demo;

import java.util.Comparator;

public class StudentMarks implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
	return (int) (o1.marks-o2.marks);
	}
	


	}
	



	


