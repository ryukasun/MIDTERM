package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.core.*;

public class Student_Test {
	public Student One;
	public Student Two;
	public Student Three;
	public Student Four;
	public Student Five;
	public Student Six;
	public Student Seven;
	public Student Eight;
	public Student Nine;
	public Student Ten;
	public Student student;

	public Course OneC;
	public Course TwoC;
	public Course ThreeC;

	public Semester Fall;
	public Semester Spring;

	public Section OneFall;
	public Section TwoFall;
	public Section ThreeFall;
	public Section OneSpring;
	public Section TwoSpring;
	public Section ThreeSpring;

	public ArrayList<Student> StudentList;
	public ArrayList<Semester> Semesters;
	public ArrayList<Course> Courses;
	public ArrayList<Section> Sections;

	public static Date Date(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month - 1, day);
		return date.getTime();
	}

	@BeforeClass

	public static void setup() {
	}

	@Test
	public void test() throws PersonException {
		// public Student(String FirstName, String MiddleName, String
		// LastName,Date DOB, eMajor Major,
		// String Address, String Phone_number, String Email) throws
		// PersonException
		Student One = new Student("Phil", "N", "Okine", Date(1990, 10, 10), eMajor.CHEM, "xxx", "302-999-9999", "xxx");
		Student Two = new Student("Phil", "N", "Okine", Date(1990, 10, 10), eMajor.CHEM, "xxx", "302-999-9999", "xxx");
		Student Three = new Student("Phil", "N", "Okine", Date(1990, 10, 10), eMajor.CHEM, "xxx", "302-999-9999",
				"xxx");
		Student Four = new Student("Phil", "N", "Okine", Date(1990, 10, 10), eMajor.CHEM, "xxx", "302-999-9999", "xxx");
		Student Five = new Student("Phil", "N", "Okine", Date(1990, 10, 10), eMajor.CHEM, "xxx", "302-999-9999", "xxx");
		Student Six = new Student("Phil", "N", "Okine", Date(1990, 10, 10), eMajor.CHEM, "xxx", "302-999-9999", "xxx");
		Student Seven = new Student("Phil", "N", "Okine", Date(1990, 10, 10), eMajor.CHEM, "xxx", "302-999-9999",
				"xxx");
		Student Eight = new Student("Phil", "N", "Okine", Date(1990, 10, 10), eMajor.CHEM, "xxx", "302-999-9999",
				"xxx");
		Student Nine = new Student("Phil", "N", "Okine", Date(1990, 10, 10), eMajor.CHEM, "xxx", "302-999-9999", "xxx");
		Student Ten = new Student("Phil", "N", "Okine", Date(1990, 10, 10), eMajor.CHEM, "xxx", "302-999-9999", "xxx");

		ArrayList<Student> StudentList = new ArrayList<Student>();
		StudentList.add(One);
		StudentList.add(Two);
		StudentList.add(Three);
		StudentList.add(Four);
		StudentList.add(Five);
		StudentList.add(Six);
		StudentList.add(Seven);
		StudentList.add(Eight);
		StudentList.add(Nine);
		StudentList.add(Ten);

		Semester Fall = new Semester();
		Fall.setSemesterID(UUID.randomUUID());
		Semester Spring = new Semester();
		Spring.setSemesterID(UUID.randomUUID());
		ArrayList<Semester> Semesters = new ArrayList<Semester>();

		ArrayList<Section> Sections = new ArrayList<Section>();
		Sections.add(OneFall);
		Sections.add(TwoFall);
		Sections.add(ThreeFall);
		Sections.add(OneSpring);
		Sections.add(TwoSpring);
		Sections.add(ThreeSpring);

		Course OneC = new Course();
		OneC.setGradePoints(4);
		OneC.setCreditHours(3);
		OneC.setCourseID(UUID.randomUUID());
		Course TwoC = new Course();
		TwoC.setGradePoints(4);
		TwoC.setCreditHours(3);
		TwoC.setCourseID(UUID.randomUUID());
		Course ThreeC = new Course();
		ThreeC.setGradePoints(4);
		ThreeC.setCreditHours(3);
		ThreeC.setCourseID(UUID.randomUUID());
		ArrayList<Course> Courses = new ArrayList<Course>();
		Courses.add(OneC);
		Courses.add(TwoC);
		Courses.add(ThreeC);

		Section OneFall = new Section();
		OneFall.setCourseID(OneC.getCourseID());
		Section TwoFall = new Section();
		TwoFall.setCourseID(TwoC.getCourseID());
		Section ThreeFall = new Section();
		ThreeFall.setCourseID(ThreeC.getCourseID());

		Section OneSpring = new Section();
		OneSpring.setCourseID(OneC.getCourseID());
		Section TwoSpring = new Section();
		TwoSpring.setCourseID(TwoC.getCourseID());
		Section ThreeSpring = new Section();
		ThreeSpring.setCourseID(ThreeC.getCourseID());

		ArrayList<Enrollment> Enrolled = new ArrayList<Enrollment>();

		// for(Semester Sem: Semesters){
		// for(Course Cou: Courses){
		// for(Student Stu: StudentList){
		// Enrollment B = new Enrollment(Stu.getStudentID(),)
		// }
		// }
		// }

		for (Section x : Sections) {
			for (Student y : StudentList) {
				Enrollment A = new Enrollment(y.getStudentID(), x.getSectionID());
				/*
				 * Random r = new Random(); double randomValue = 0 + (4 - 0) *
				 * r.nextDouble();
				 */
				A.setGrade(4);
				Enrolled.add(A);

			}

		}
		double OneAvg = 0;
		double TwoAvg = 0;
		double ThreeAvg = 0;
		double FourAvg = 0;
		double FiveAvg = 0;
		double SixAvg = 0;
		double SevenAvg = 0;
		double EightAvg = 0;
		double NineAvg = 0;
		double TenAvg = 0;
		double CourseTotal = 0;
		double CourseTwoTotal = 0;
		double CourseThreeTotal = 0;
		for (Enrollment z : Enrolled) {

			double zgrade = z.getGrade();
			if (z.getStudentID() == One.getStudentID()) {
				OneAvg = OneAvg + zgrade;
			}
			if (z.getStudentID() == Two.getStudentID()) {
				TwoAvg = TwoAvg + zgrade;

			}
			if (z.getStudentID() == Three.getStudentID()) {
				ThreeAvg = ThreeAvg + zgrade;

			}
			if (z.getStudentID() == Four.getStudentID()) {
				FourAvg = FourAvg + zgrade;

			}
			if (z.getStudentID() == Five.getStudentID()) {
				FiveAvg = FiveAvg + zgrade;

			}
			if (z.getStudentID() == Six.getStudentID()) {
				SixAvg = SixAvg + zgrade;

			}
			if (z.getStudentID() == Seven.getStudentID()) {
				SevenAvg = SevenAvg + zgrade;

			}
			if (z.getStudentID() == Eight.getStudentID()) {
				EightAvg = EightAvg + zgrade;

			}
			if (z.getStudentID() == Nine.getStudentID()) {
				NineAvg = NineAvg + zgrade;

			}
			if (z.getStudentID() == Ten.getStudentID()) {
				TenAvg = TenAvg + zgrade;

			}
			if (z.getSectionID() == OneFall.getSectionID()) {
				CourseTotal = CourseTotal + zgrade;

			}
			if (z.getSectionID() == TwoFall.getSectionID()) {
				CourseTwoTotal = CourseTotal + zgrade;

			}
			if (z.getSectionID() == ThreeFall.getSectionID()) {
				CourseThreeTotal = CourseTotal + zgrade;
			}

		}
		assertEquals(OneAvg / 6, 4);
		assertEquals(TwoAvg / 6, 4);
		assertEquals(ThreeAvg / 6, 4);
		assertEquals(FourAvg / 6, 4);
		assertEquals(FiveAvg / 6, 4);
		assertEquals(SixAvg / 6, 4);
		assertEquals(SevenAvg / 6, 4);
		assertEquals(EightAvg / 6, 4);
		assertEquals(NineAvg / 6, 4);
		assertEquals(TenAvg/6,4);
		assertEquals(CourseTotal/20,4);
		assertEquals(CourseTwoTotal/20,4);
		assertEquals(CourseThreeTotal/20,4);}

	@Test
	public void testTwo() throws PersonException{
		Student student = new Student("Phil", "N", "Okine", Date(1990, 10, 10), eMajor.CHEM, "xxx", "302-999-9999", "xxx");
		student.setMajor(eMajor.PHYSICS);
		assertTrue(student.getMajor()==eMajor.PHYSICS);
	
	}
	
}