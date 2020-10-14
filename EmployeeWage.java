package Computation;

import java.util.Random;

public class EmployeeWage {
	
	private static final int fullDay = 8;
	private String companyName = "";
	private static int dailyWage = 0;
	private static int daysPerMonth = 0;
	private static int hoursPerMonth = 0;
	
	public EmployeeWage(String companyName, int dailyWage, int daysPerMonth, int hoursPerMonth) {
		// TODO Auto-generated constructor stub
		this.companyName = companyName;
		this.dailyWage = dailyWage;
		this.daysPerMonth = daysPerMonth;
		this.hoursPerMonth = hoursPerMonth;
	}

	
	public String companyName() {
		return companyName;
	}	
	
	
	public static void main(String[] args) {

		EmployeeWage amazon = new EmployeeWage("Amazon", 100, 10, 50);
		EmployeeWage flipkart = new EmployeeWage("Flipkart", 200, 20, 100);

		System.out.println("Monthly wage for an employee of company " + amazon.companyName() + " is "
				+ amazon.wagesForMonth());
		System.out.println("Monthly wage for an employee of company " + flipkart.companyName() + " is "
				+ flipkart.wagesForMonth());
	}
	
	public static boolean employeeAttendance() {
		return new Random().nextBoolean();
	}	
	
	private static long wagesForMonth() {
		long wages = 0;
		int workingHours = 0, workingDays = 0;
		while (workingDays < daysPerMonth && workingHours < hoursPerMonth) {
			workingDays++;
			if (employeeAttendance()) {
				workingHours += fullDay;
				wages += dailyWage;
			}
		}
		return wages;
	}
}

