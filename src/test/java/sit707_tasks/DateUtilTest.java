package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223021831 ";
		Assert.assertNotNull("Student ID is :", studentId);
		System.out.println("Student ID is :" + studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "N G H Madushani";
		Assert.assertNotNull("Student name is :", studentName);
		System.out.println("Student name is :" + studentName);
	}

	@Test
	public void testDayEquivalenceClasses() {
		// D1: Day between 1 to 28
		DateUtil dateD1 = new DateUtil(15, 6, 2022);
		dateD1.increment();
		System.out.println("D1 Increment Result: " + dateD1.toString());
		Assert.assertEquals("Day D1 Increment", "16 June 2022", dateD1.toString());

		// D2: Day 29
		DateUtil dateD2 = new DateUtil(29, 2, 2023); // non-leap year
		dateD2.increment();
		System.out.println("D2 Increment Result: " + dateD2.toString());
		Assert.assertEquals("Day D2 Increment", "1 March 2023", dateD2.toString());

		// D3: Day 30
		DateUtil dateD3 = new DateUtil(30, 9, 2024);
		dateD3.increment();
		System.out.println("D3 Increment Result: " + dateD3.toString());
		Assert.assertEquals("Day D3 Increment", "1 October 2024", dateD3.toString());

		// D4: Day 31
		DateUtil dateD4 = new DateUtil(31, 12, 2021);
		dateD4.increment();
		System.out.println("D4 Increment Result: " + dateD4.toString());
		Assert.assertEquals("Day D4 Increment", "1 January 2022", dateD4.toString());
	}
	
	@Test
	public void testMonthEquivalenceClasses() {
		// M1: Months with 30 days
		DateUtil dateM1 = new DateUtil(15, 4, 2022);
		dateM1.increment();
		System.out.println("M1 Increment Result: " + dateM1.toString());
		Assert.assertEquals("Month M1 Increment", "16 April 2022", dateM1.toString());

		// M2: Months with 31 days
		DateUtil dateM2 = new DateUtil(31, 1, 2023);
		dateM2.increment();
		System.out.println("M2 Increment Result: " + dateM2.toString());
		Assert.assertEquals("Month M2 Increment", "1 February 2023", dateM2.toString());

		// M3: February (normal year)
		DateUtil dateM3 = new DateUtil(28, 2, 2024); // leap year
		dateM3.increment();
		System.out.println("M3 Increment Result: " + dateM3.toString());
		Assert.assertEquals("Month M3 Increment", "29 February 2024", dateM3.toString());

		// M4: February (leap year)
		DateUtil dateM4 = new DateUtil(29, 2, 2024); // leap year
		dateM4.increment();
		System.out.println("M4 Increment Result: " + dateM4.toString());
		Assert.assertEquals("Month M4 Increment", "1 March 2024", dateM4.toString());
	}
	
	@Test
	public void testYearEquivalenceClasses() {
		// Y1: Non-leap year
		DateUtil dateY1 = new DateUtil(15, 6, 2021);
		dateY1.increment();
		System.out.println("Y1 Increment Result: " + dateY1.toString());
		Assert.assertEquals("Year Y1 Increment", "16 June 2021", dateY1.toString());

		// Y2: Leap year
		DateUtil dateY2 = new DateUtil(15, 6, 2024); // leap year
		dateY2.increment();
		System.out.println("Y2 Increment Result: " + dateY2.toString());
		Assert.assertEquals("Year Y2 Increment", "16 June 2024", dateY2.toString());
	}

}
