import java.awt.*;
public class gui
{
	public static void main(String args[])
	{

		Frame f=new Frame("FIRST");
f.setLayout(new FlowLayout());

		Label l=new Label("Name");
		TextField t=new TextField(20);
		Button b=new Button("ok");

f.add(l);
f.add(t);

f.add(b);

		f.setSize(400,400);
		f.setVisible(true);
	}
	}