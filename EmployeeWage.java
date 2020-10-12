package Computation;

import java.util.Random;

public class EmployeeWage {
	
	static int fullDay = 8;
	static int perHour = 20;
	static int dailyWage = 0;
	static int partTime = 8;
	static int perMonth = 20;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		switch (getEmployeeType()) {
		case "Full-time":
			System.out.println("Employment: Full-time");
			break;
		case "Part-time":
			System.out.println("Employment: Part-time");
			break;
		default:
			break;
		}
		getDailywage();
		System.out.println("Daily wage: " + dailyWage);
		System.out.println("Wages for month: " + getWagesForMonth());		
	}
	
	public static boolean employeeAttendance() {
		return new Random().nextBoolean();
	}

	public static int getDailywage() {
		dailyWage = fullDay * perHour;
		return dailyWage;
	}
	
	private static String getEmployeeType() {
		String[] arr = { "Full-time", "Part-time" };
		return arr[new Random().nextInt(arr.length)];
	}
	
	private static long getWagesForMonth() {
		long wages = 0;
		for (int i = 1; i <= perMonth; i++) {
			System.out.println("Day : " + i);
			if (employeeAttendance()) {
				System.out.println("Present");
				wages += dailyWage;
			} else {
				System.out.println("Absent");
			}
		}
		return wages;
	}
}

