/*************************************************************************
    @ File Name: Employee.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月05日 星期五 17时07分05秒
 ************************************************************************/

package com.horstmann.corejava;

// the class in this file are part of this package

import java.util.*;

// import statements come after the package statement

/**
 * @version 1.10
 * @author DevinKin
 */

public class Employee
{
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		// GregorianCalendar use 0 for January
		hireDay = calendar.getTime();
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public Date getHIreDay()
	{
		return hireDay;
	}

	
	/**
	 * Raise the salary of an employee.
	 * @param byPercent the percentage by which to raise the salary(e.g. 10 = 10%)
	 * @return the amount of the raise
	 */
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	private String name;
	private double salary;
	private Date hireDay;

}
