/*************************************************************************
    @ File Name: TimerTest.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月17日 星期三 20时56分00秒
 ************************************************************************/


/**
 * @version 1.00
 * @author DevinKin
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
//to resolve conflict with java.util.Timer

public class TimerTest
{
	public static void main(String[] args)
	{
		ActionListener listener = new TimerPrinter();

		// construct a timer that calls the listener
		// once every 10 seconds
		Timer t = new Timer(10000, listener);
		t.start();

		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

class TimerPrinter implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		Date now = new Date();
		System.out.println("At the tone, the time is " + now);
		Toolkit.getDefaultToolkit().beep();
	}
}
