/*************************************************************************
    @ File Name: ConstructorTest.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月05日 星期五 16时10分59秒
 ************************************************************************/
import java.util.*;

/**
 * This program demonstrates objects construction.
 * @version 1.01
 * @author DevinKin
 */

public class ConstructorTest
{
	public static void main(String[] args)
	{
		// fill the staff array with three Employee objects 
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();

		// print out information about all Employee objects
		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ", salary="
					+ e.getSalary());
	}
}


class Employee
{
	// three overloaded constructors
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}

	public Employee(double s)
	{
		//calls the Employee(String, double) constructor
		this("Employee #" + nextId, s);
	}


	// the default constructor
	public Employee()
	{
		
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public int getId()
	{
		return id;
	}

	private static int nextId;

	private int id;
	private String name = "";			//instance field initialization
	private double salary;

	//static initialization block
	static 
	{
		Random generator = new Random();
		// set nextId to a random number between 0 and 9999
		nextId = generator.nextInt(1000);
	}

	// object initialization block
	{
		id = nextId;
		nextId++;
	}
}
