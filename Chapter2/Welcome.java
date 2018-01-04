/*************************************************************************
    @ File Name: Welcome.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月04日 星期四 11时23分58秒
 ************************************************************************/


public class Welcome
{
	public static void main(String[] args)
	{
		String[] gretting = new String[3];
		gretting[0] = "Welcome to Core java";
		gretting[1] = "by DevinKin";
		gretting[2] = "and Cary Cornell";

		for (String g : gretting)
			System.out.println(g);
	}
}
