/*************************************************************************
    @ File Name: InnerClassTest.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月17日 星期三 21时51分51秒
 ************************************************************************/

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates the use of inner classes.
 * @version 1.10
 * @author DevinKin
 */
public class InnerClassTest
{
	public static void main(String[] args)
	{
		TalkingClcok clock = new TalkingClcok(1000, true);
		clock.start();

		// keep program running until user selects "ok"
		JOptionPane.showMessageDialog(null, "Quit program");
		System.exit(0);
	}
}

/**
 * A clock that prints the time in regular intervals.
 */
class TalkingClcok
{
	/**
	 * Cconstructs a talking clock
	 * @param interval the interval between message (in milliseconds)
	 * @param beep true if the clock should beep
	 */
	public TalkingClcok(int interval, boolean beep)
	{
		this.interval = interval;
		this.beep = beep;
	}

	/**
	 * Starts the clock.
	 */
	public void start()
	{
		ActionListener listener = new TimerPrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}

	private int interval;
	private boolean beep;

	public class TimerPrinter implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Date now = new Date();
			System.out.println("At the tone, the time is " + now);
			if (beep) Toolkit.getDefaultToolkit().beep();
		}
	}
}
