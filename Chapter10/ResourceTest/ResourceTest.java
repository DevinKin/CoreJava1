/*************************************************************************
    @ File Name: ResourceTest.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月28日 星期日 10时33分11秒
 ************************************************************************/

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

/**
 * @version 1.4
 * @author DevinKin
 */
public class ResourceTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
				{
					public void run()
					{
						ResourceFrame frame = new ResourceFrame();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
				});
	}
}


/**
 * A frame that loads image and text resources.
 */
class ResourceFrame extends JFrame
{
	public ResourceFrame()
	{
		setTitle("ResourceTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		URL aboutURL = getClass().getResource("about.gif");
		Image img = Toolkit.getDefaultToolkit().getImage(aboutURL);
		setIconImage(img);

		JTextArea textArea = new JTextArea();
		InputStream stream = getClass().getResourceAsStream("about.txt");
		Scanner in = new Scanner(stream);
		while(in.hasNext())
			textArea.append(in.nextLine() + "\n");
		add(textArea);
	}

	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 300;
}
