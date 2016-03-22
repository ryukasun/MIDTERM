package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	private Enrollment() {
		// TODO Auto-generated constructor stub
	}

	public Enrollment(UUID StudentID, UUID SectionID) {
		this();
		this.EnrollmentID = UUID.randomUUID();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		this.Grade = grade;
	}
}