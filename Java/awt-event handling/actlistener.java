import java.awt.*;
import java.awt.event.*;


class myframe extends Frame implements ActionListener
{
	int count =0;
	Label l;
	Button b;

	public myframe()
	{
		super("button demo");
		l=new  Label("    "+count);
		b=new Button("Click");
		b.addActionListener(this);
		setLayout(new FlowLayout());
		add(l);
		add(b);

}
public void actionPerformed(ActionEvent e)
{
	count++;
	l.setText("  "+count );
	}
	}
public class actlistener
{
	public static void main(String args[])
	{
myframe f=new myframe();
f.setSize(400,400);
f.setVisible(true);
		}
	}