import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myframe extends JFrame implements ActionListener
{
	JTextField t;
	JLabel j;
	JButton b1;
	JButton b2;
	JLabel o;
	 myframe()
	 {
		 super("operation");
		 setLayout(new FlowLayout());
		 j=new JLabel("Enter Number To Perfrom Square Or Factorial");
		 t=new JTextField(10);
		 b1=new JButton("Square");
		 b2=new JButton("Factorial");
		 o= new JLabel();
		 add(j);
		 add(t);
		 add(b1);
		 add(b2);
		 add(o);
		 b1.addActionListener(this);
		 b2.addActionListener(this);

		 }
		 public void actionPerformed(ActionEvent e)
		 {
             String inp= t.getText();
             if(!inp.isEmpty())
             {
if(e.getSource()==b1)
{
	int num=Integer.parseInt(inp);
	int n=num*num;
	o.setText("the square is "+n);
	}
	if(e.getSource()==b2)
	{
		int num1=Integer.parseInt(inp);
		int i;
		for(i=num1-1;i>0;i--)
		{
			num1=num1*i;
			}
			o.setText("the factorial is "+num1);
		}

			 }
			 }

	}

	public class swing
	{
		public static void main(String args[])
		{
			myframe obj=new myframe();
			obj.setSize(500,500);
obj.setVisible(true);

			}
		}