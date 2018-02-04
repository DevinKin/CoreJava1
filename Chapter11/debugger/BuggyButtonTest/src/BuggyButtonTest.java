package debugger;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;

/**
 * @version 1.22
 * @author DevinKin
 */

public class BuggyButtonTest {
    public static void main(String [] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BuggyButtonFrame();
                frame.setTitle("BuggyButtonTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}


class BuggyButtonFrame extends JFrame
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public BuggyButtonFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // add panel to frame
        BuggyButtonPanel panel = new BuggyButtonPanel();
        add(panel);
    }
}


class BuggyButtonPanel extends JPanel
{
    public BuggyButtonPanel()
    {
        ActionListener listener = new ButtonListener();

        JButton yellowButton = new JButton("Yellow");
        add(yellowButton);
        yellowButton.addActionListener(listener);

        JButton blueButton = new JButton("Blue");
        add(blueButton);
        blueButton.addActionListener(listener);

        JButton redButton = new JButton("Red");
        add(redButton);
        redButton.addActionListener(listener);
    }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String arg = event.getActionCommand();
            if (arg.equals("yellow")) setBackground(Color.yellow);
            else if (arg.equals("blue")) setBackground(Color.blue);
            else if (arg.equals("red")) setBackground(Color.red);
        }
    }
}