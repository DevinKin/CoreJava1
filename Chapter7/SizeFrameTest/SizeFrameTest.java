/*************************************************************************
    @ File Name: SizeFrameTest.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月18日 星期四 22时51分27秒
 ************************************************************************/

import java.awt.*;
import javax.swing.*;

/**
 * @version 1.32
 * @author DevinKin
 */
public class SizeFrameTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
				{
					public void run()
					{
						SizedFrame frame = new SizedFrame();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
				});
	}
}

class SizedFrame extends JFrame
{
	public SizedFrame()
	{
		// get screen dimensions
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		// set frame width, height and let platform pick screen location
		setSize(screenWidth / 2, screenHeight / 2);
		setLocationByPlatform(true);

		// set frame icon and title
		Image img = kit.getImage("icon.gif");
		setIconImage(img);
		setTitle("SizedFrame");
	}	
}
