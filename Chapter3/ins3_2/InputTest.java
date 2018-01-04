/*************************************************************************
    @ File Name: InputText.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月04日 星期四 14时20分36秒
 ************************************************************************/
import java.util.*;
/*
 * This program demonstrates console input.
 * @version 1.10 2018-1-04
 * @author DevinKin
 */

public class InputTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		// get first input 
		System.out.print("What is your name?");
		String name = in.nextLine();

		// get second input 
		System.out.print("How old are you?");
		int age = in.nextInt();

		// display output ont console
		System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
	}
}
