/*************************************************************************
    @ File Name: DrawTest.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月19日 星期五 10时06分00秒
 ************************************************************************/

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * @version 1.32
 * @author DevinKin
 */
public class DrawTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
				{
					public void run()
					{
						DrawFrame frame = new DrawFrame();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
				});
	}
}

/**
 * A frame that contains a panel with drawings
 */
class DrawFrame extends JFrame
{
	public DrawFrame()
	{
		setTitle("DrawTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// add panel to frame
		DrawComponent component = new DrawComponent();
		add(component);
	}

	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT = 400;
}

/**
 * A component that displays reactangles and ellipses.
 */
class DrawComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;

		// draw a rectangle
		double leftX = 100;
		double topyY = 100;
		double width = 200;
		double height = 150;

		Rectangle2D rect = new Rectangle2D.Double(leftX, topyY, width, height);
		g2.draw(rect);

		// draw a enclose ellipse
		Ellipse2D ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rect);
		g2.draw(ellipse);

		// draw a diagonal line
		g2.draw(new Line2D.Double(leftX, topyY, leftX + width, topyY + height));

		// draw a circle with the same center
		double centerX = rect.getCenterX();
		double centerY = rect.getCenterY();
		double radius = 150;

		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
		g2.draw(circle);
	}
}
