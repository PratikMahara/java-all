import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class myframe extends JFrame implements ActionListener
{
	int count=0;
	JLabel l;
	JButton b;
	myframe()
	{
		super("Swing demo");
		setLayout(new FlowLayout());
		l=new JLabel("Please CLick Me");

		b=new JButton("click");
		add(l);
		add(b);
		b.addActionListener(this);
		}

		public void actionPerformed(ActionEvent e)
		{
			count++;
			l.setText("Clicked"+count+"times");


			}
	}
	public class guiswing
	{
		public static void main(String args[])
		{
			myframe f=new myframe();
			f.setSize(500,500);
			f.setVisible(true);
			}
		}