import java.awt.*;
import java.awt.event.*;
class First extends Frame implements ActionListener 
{	
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	First()
	{
		b1 = new Button("+");
		b1.setBounds(80,250,50,50);
		add(b1);
		b2 = new Button("-");
		b2.setBounds(150,250,50,50);
		add(b2);
		b3 = new Button("*");
		b3.setBounds(80,330,50,50);
		add(b3);
		b4 = new Button("/");
		b4.setBounds(150,330,50,50);
		add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		t1 = new TextField("");
		t1.setBounds(50,50,220,30);
		add(t1);
		t2 = new TextField("");
		t2.setBounds(50,90,220,30);
		add(t2);
		t3 = new TextField("....");
		t3.setBounds(50,130,220,30);
		add(t3);
		
		setSize(320,400);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1 = t1.getText();
		String s2 = t2.getText();
		String op = "";
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		double c = 0;
		if(e.getSource() == b1)
		{
			c = a+b;
			op = "Sum => ";
		}
		else if(e.getSource() == b2)
		{
			c = a-b;
			op = "Diff. => ";
		}
		else if(e.getSource() == b3)
		{
			c = a*b;
			op = "Product => ";
		}
		else if(e.getSource() == b4)
		{
			c = (double)a/b;
			op = "Division => ";
		}
		String result = String.valueOf(c);
		t3.setText(op+result);
	}
}
class CalculatorAwtMain 
{
	public static void main(String []args)
	{
		First f = new First();
	}
}

