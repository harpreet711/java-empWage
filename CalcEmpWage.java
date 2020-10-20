package Computation;

import java.util.Random;

public class CalcEmpWage {
	static final int FULL_DAY_WORKING_HOURS = 8;
	private final String companyName;
	final int dailyWage;
	final int workingDaysPerMonth;
	final int workingHoursPerMonth;
	long monthlyWage;

	public CalcEmpWage(String companyName, int dailyWage, int workingDaysPerMonth, int workingHoursPerMonth) {
		this.companyName = companyName;
		this.dailyWage = dailyWage;
		this.workingDaysPerMonth = workingDaysPerMonth;
		this.workingHoursPerMonth = workingHoursPerMonth;
	}
	public void setMonthlyWage(long monthlyWage) {
		this.monthlyWage = monthlyWage;
	}
	
	boolean isEmployeePresent() {
		return new Random().nextBoolean();
	}
	
}
