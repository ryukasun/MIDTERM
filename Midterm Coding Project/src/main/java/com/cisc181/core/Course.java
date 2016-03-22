package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	private int CreditHours;
	
	
	

	public Course() {
		// TODO Auto-generated constructor stub
	}
	
/*	public Course(String CourseName, int GradePoints, eMajor Major, int CreditHours){
		this();
	}*/



	public UUID getCourseID() {
		return CourseID;
	}



	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}



	public String getCourseName() {
		return CourseName;
	}



	public void setCourseName(String courseName) {
		CourseName = courseName;
	}



	public int getGradePoints() {
		return GradePoints;
	}



	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}



	public int getCreditHours() {
		return CreditHours;
	}



	public void setCreditHours(int creditHours) {
		CreditHours = creditHours;
	}

}
