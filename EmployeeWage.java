package Computation;

import java.util.Random;

public class EmployeeWage {
	
	static int fullDay = 8;
	static int perHour = 20;
	static int dailyWage = 0;
	static int partTime = 8;
	static int perMonth = 20;
	static int forMonth = 100;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		switch (employeeType()) {
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
		System.out.println("Wages for month: " + wagesForMonth());		
	}
	
	public static boolean employeeAttendance() {
		return new Random().nextBoolean();
	}

	public static int getDailywage() {
		dailyWage = fullDay * perHour;
		return dailyWage;
	}
	
	private static String employeeType() {
		String[] arr = { "Full-time", "Part-time" };
		return arr[new Random().nextInt(arr.length)];
	}
	
	private static long wagesForMonth() {
		long wages = 0;
		int workingHours = 0, workingDays = 0;
		while (workingDays < perMonth && workingHours < forMonth) {
			workingDays++;
			System.out.println("Day : " + workingDays);
			if (employeeAttendance()) {
				System.out.println("Present");
				workingHours += fullDay;
				wages += dailyWage;
			} else {
				System.out.println("Absent");
			}
		}
		return wages;
	}
}

