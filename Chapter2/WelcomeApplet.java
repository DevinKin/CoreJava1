import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

public class WelcomeApplet extends JApplet
{
	public void init()
	{
		EventQueue.invokeLater(new Runnable()
			{
				public void run()
				{
					setLayout(new BorderLayout());

					JLabel label = new JLabel(getParameter("greeting"), SwingConstants.CENTER);
					label.setFont(new Font("Serif", Font.BOLD, 18));
					add(label, BorderLayout.CENTER);

					JPanel panel = new JPanel();
					JButton cayButton = new JButton("Cay Horstmann");
					panel.add(cayButton);

					JButton grayButton = new JButton("Gray Cornell");
					grayButton.addActionListener(makeAction("mailto:gray_cornell@apress.com"));
					panel.add(grayButton);
				}
			});
	}

	private ActionListener makeAction(final String urlString)
	{
		return new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					try
					{
						getAppletContext().showDocument(new URL(urlString));
					}
					catch (MalformedURLException e)
					{
						e.printStackTrace();
					}
				}
			};
	}
}
