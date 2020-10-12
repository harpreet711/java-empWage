package Computation;

import java.util.Random;

public class EmployeeWage {
	
	static int fullDay = 8;
	static int perHour = 20;
	static int dailyWage = 0;
	static int partTime = 8;
	
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
		if (employeeAttendance()) {
			System.out.println("Employee : Present");
			getDailywage();
			System.out.println(dailyWage);
		} else {
			System.out.println("Employee : Absent");
		}		
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
}

