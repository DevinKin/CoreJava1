/*************************************************************************
    @ File Name: SampleFrameTest.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月18日 星期四 22时24分48秒
 ************************************************************************/

import javax.swing.*;

/**
 * @version 1.32
 * @author DevinKin
 */
public class SimpleFrameTest
{
	public static void main(String[] args)
	{
		SimpleFrame frame = new SimpleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class SimpleFrame extends JFrame
{
	public SimpleFrame()
	{
		setSize(DEFAULT_WIDTH, DEFAULT_HIGHT);
	}

	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HIGHT = 200;
}
