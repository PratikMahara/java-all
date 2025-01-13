import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myframe extends JFrame implements ActionListener
{
	JLabel r;
	JLabel n;
	JLabel m;
	JTextField rt;
	JTextField nt;
	JTextField mt;
	JButton b;
	JLabel o;
	myframe()
	{
		super("applicaion");
		setLayout(new FlowLayout());
		r=new JLabel("Enter ROLLNO");
		rt=new JTextField(30);
		n=new JLabel("Enter Name");
		nt=new JTextField(30);
		m=new JLabel("Enter Marks");
		mt=new JTextField(30);
		b=new JButton("Insert");
		o=new JLabel();
		add(r);
		add(rt);
		add(n);
		add(nt);
		add(m);
		add(mt);
		add(b);
		b.addActionListener(this);
		add(o);
	}
	public void actionPerformed(ActionEvent e)
	{
		o.setText("Data is inserted into the database");
		}

	}
	public class application
	{
		public static void main(String args[])
	{
		myframe  my=new myframe();
		my.setSize(500,500);
		my.setVisible(true);
		}
		}