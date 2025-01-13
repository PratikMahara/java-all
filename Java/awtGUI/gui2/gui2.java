import java.awt.*;
class myframe extends Frame
{
	Label l;
	TextField t;
	Button b;
	public myframe()
	{
		super("FIrstapp");
		setLayout(new FlowLayout());
		l=new Label("Name");
		t= new TextField(20);
		b= new Button("ok");
add(l);
add(t);
add(b);
		}
	}

public class gui2
{
	public static void main(String args[])
	{
		myframe f= new myframe();

				f.setSize(1000,1000);
		f.setVisible(true);
		}
	}