/*************************************************************************
    @ File Name: NotHelloWorld.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月19日 星期五 08时55分45秒
 ************************************************************************/

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.32
 * @author DevinKin
 */
public class NotHelloWorld
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
				{
					public void run()
					{
						NotHelloWorldFrame frame = new NotHelloWorldFrame();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
				});
	}
}

/**
 * A frame that contains a message panel
 */
class NotHelloWorldFrame extends JFrame
{
	public NotHelloWorldFrame()
	{
		setTitle("NotHelloWorld");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// add panel to frame
		NotHelloWorldPanel panel = new NotHelloWorldPanel();
		add(panel);
	}

	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
}

/**
 * A panel that displays a messages.
 */
class NotHelloWorldPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
	}

	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y = 100;
}
