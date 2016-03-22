package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.*;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	//public Staff One;
	public Staff One;
	//= new Staff("Phil", "Attoh", "Okine", Date(1996,3,22), "xxx", "xxx","999-999-9999", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);
	public Staff Two;
	public Staff Three;
	public Staff Four;
	public Staff Five;
	public Staff Inv; 
	public ArrayList <Staff> StaffList;
	
	
	public static Date Date(int year, int month, int day){
		Calendar date = Calendar.getInstance();
		date.set(year,month-1,day);
		return date.getTime();
	}
	
	
	
	
	

	@BeforeClass
	public static void setup(){
	/*	Staff One= new Staff("Phil", "Attoh", "Okine", Date(1996,3,22), "xxx", "xxx","999-999-9999", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);
		Staff Two= new Staff("Phil", "Attoh", "Okine", Date(1996,3,22), "xxx", "xxx","999-999-9999", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);
		Staff Three= new Staff("Phil", "Attoh", "Okine", Date(1996,3,22), "xxx", "xxx","999-999-9999", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);
		Staff Four= new Staff("Phil", "Attoh", "Okine", Date(1996,3,22), "xxx", "xxx","999-999-9999", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);
		Staff Five= new Staff("Phil", "Attoh", "Okine", Date(1996,3,22), "xxx", "xxx","999-999-9999", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);
		ArrayList <Staff> StaffList = new ArrayList <Staff>();
		StaffList.add(One);
		StaffList.add(Two);
		StaffList.add(Three);
		StaffList.add(Four);
		StaffList.add(Five);*/
		//Staff Inv= new Staff("Phil", "Attoh", "Okine", Date(1996,3,22), "xxx", "xxx","999-999-999912132312421321", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);


		
		

		
		
		
	}
	
	@Test
	public void AvgSalaryTest() throws PersonException {
		Staff One= new Staff("J", "Attoh", "Okine", Date(1996,3,22), "xxx","999-999-9999","xxx", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);
		Staff Two= new Staff("J", "Attoh", "Okine", Date(1996,3,22), "xxx","999-999-9999","xxx", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);
		Staff Three= new Staff("J", "Attoh", "Okine", Date(1996,3,22), "xxx","999-999-9999","xxx", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);
		Staff Four= new Staff("J", "Attoh", "Okine", Date(1996,3,22), "xxx","999-999-9999","xxx", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);
		Staff Five= new Staff("J", "Attoh", "Okine", Date(1996,3,22), "xxx","999-999-9999","xxx", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);
		ArrayList <Staff> StaffList = new ArrayList <Staff>();
		StaffList.add(One);
		StaffList.add(Two);
		StaffList.add(Three);
		StaffList.add(Four);
		StaffList.add(Five);
		double sum = 0;
		
		for(Staff c: StaffList){
			sum = sum + c.getSalary();
		}
		double avg = sum/StaffList.size();
		assertTrue(avg==20000.0);
		//assertEquals(avg,20000); //Doesn't work because we're using floats instead of doubles to test
		
	}	
	@Test(expected=PersonException.class)
	public void test() throws PersonException {
		Staff Inv = new Staff("Phil", "Attoh", "Okine", Date(1996,3,22), "xxx", "xxx","999-999-999912132312421321", "xxx", 3,20000,Date(2010,4,20), eTitle.MR);
;
	}	

}
