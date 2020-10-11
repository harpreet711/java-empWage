package Computation;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		if (employeeAttendance()) {
			System.out.println("Employee : Present");
		} else {
			System.out.println("Employee : Absent");
		}
	}

	public static boolean employeeAttendance() {
		return new Random().nextBoolean();
	}
}

