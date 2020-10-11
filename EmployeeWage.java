package Computation;

import java.util.Random;

public class EmployeeWage {
	
	static int fullDay = 8;
	static int perHour = 20;
	static int dailyWage = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		if (employeeAttendance()) {
			System.out.println("Employee : Present");
		} else {
			System.out.println("Employee : Absent");
		}
		getDailywage();
		System.out.println(dailyWage);
	}

	public static boolean employeeAttendance() {
		return new Random().nextBoolean();
	}

	public static int getDailywage() {
		dailyWage = fullDay * perHour;
		return dailyWage;
	}
}

