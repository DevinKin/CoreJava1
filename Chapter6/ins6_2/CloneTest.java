/*************************************************************************
    @ File Name: CloneTest.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月16日 星期二 22时29分53秒
 ************************************************************************/

import java.util.*;

/**
 * This program demonstrates cloning.
 * @version 1.10
 * @author DevinKin
 */

public class CloneTest
{
	public static void main(String[] args)
	{
		try
		{
			Employee original = new Employee("John Q. Public", 50000);
			original.sethireDay(2000, 1, 1);
			Employee copy = original.clone();
			copy.raiseSalary(10);
			copy.sethireDay(2002, 12, 31);
			System.out.println("original=" + original);
			System.out.println("copy=" + copy);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}

class Employee implements Cloneable
{
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
		hireDay = new Date();
	}

	public Employee clone() throws CloneNotSupportedException
	{
		// call Object clone()
		Employee cloned = (Employee)super.clone();

		// clone mutable fields
		cloned.hireDay = (Date) hireDay.clone();

		return cloned;
	}

	/**
	 * Set the hire day to a given date.
	 * @param year the year of the hire day
	 * @param month the month of hire month
	 * @param day the day of the hire day
	 */
	public void sethireDay(int year, int month, int day)
	{
		Date newhireDay = new GregorianCalendar(year, month - 1, day).getTime();

		// Example of instance field mutation
		hireDay.setTime(newhireDay.getTime());
	}

	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public String toString()
	{
		return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
	}

	private String name;
	private double salary;
	private Date hireDay;

}
