/*************************************************************************
    @ File Name: EmployeeSortTest.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月12日 星期五 21时40分09秒
 ************************************************************************/

import java.util.*;

/**
 * This program demonstrates the use of the Comparable interface.
 * @version 1.30
 * @author DevinKin
 */

public class EmployeeSortTest
{
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Harry Hacker", 35000);
		staff[1] = new  Employee("Carl Cracker", 75000);
		staff[2] = new Employee("Tony Tester", 38000);

		Arrays.sort(staff);

		// print out information about all Employee objects
		for (Employee e: staff)
			System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
	}
}

class Employee implements Comparable<Employee>
{
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	/**
	 * COmpares employees by salary
	 * @param other anoter Employee object
	 * @return a negative value if this employee has a lower salary than
	 * otherObject, 0 if salaries are the same, a positive value otherwise
	 */
	public int compareTo(Employee other)
	{
		if (salary < other.salary) return -1;
		if (salary > other.salary) return 1;
		return 0;
	}

	private String name;
	private double salary;
}
