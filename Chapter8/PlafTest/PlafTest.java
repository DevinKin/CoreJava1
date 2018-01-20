/*************************************************************************
    @ File Name: PlafTest.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月20日 星期六 20时11分38秒
 ************************************************************************/

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;

/**
 * @version 1.32
 * @author DevinKin
 */
public class PlafTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
				{
					public void run()
					{
						PlatFrame frame = new PlatFrame();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
				});
	}
}

/**
 * A frame with a button panel for changing look and feel
 */
class PlatFrame extends JFrame
{
	public PlatFrame()
	{
		setTitle("PlatTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		buttonPanel = new JPanel();

		UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
		for (UIManager.LookAndFeelInfo info : infos)
			makeButton(info.getName(), info.getClassName());

		add(buttonPanel);
	}

	/**
	 * Makes a button to change the pluggable look and feel
	 * @param name the button name
	 * @param platfName the name of the look and feel class
	 */
	void makeButton(String name, final String plafName)
	{
		// add button to panel
		JButton button = new JButton(name);
		buttonPanel.add(button);

		// set button action 
		button.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						// button action: switch to the new look and feel
						try
						{
							UIManager.setLookAndFeel(plafName);
							SwingUtilities.updateComponentTreeUI(PlatFrame.this);
						}	
						catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				});
	}

	private JPanel buttonPanel;

	public static final int DEFAULT_WIDTH = 300;
	public static final int	DEFAULT_HEIGHT = 200;
}
