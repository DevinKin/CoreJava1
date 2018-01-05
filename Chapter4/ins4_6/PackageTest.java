/*************************************************************************
    @ File Name: PackageTest.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月05日 星期五 17时14分04秒
 ************************************************************************/
import com.horstmann.corejava.*;
// the Employee class is defined in that package

import static java.lang.System.*;

/**
 * This program demonstrates the use of packages
 * @author DevinKin
 * @version 1.11
 */

public class PackageTest
{
	public static void main(String[] args)
	{
		// because of the import statement, we don't have to use com.horstmann.corejava.Employee here
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

		harry.raiseSalary(5);

		// because of the static import statement, we dont't have to use System.out here
		out.println("name=" + harry.getName() + ", salary=" + harry.getSalary());
		
	}
}
