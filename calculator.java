import java.awt.*;
import javax.swing.*;


class cal extends JFrame {
	JButton n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,eq,div,mul,sum,sub,cl,acl,point,per;
	JTextField inp;
	JLabel out;
	int btnsz = 15;

	void buttonPropertySet (JButton b){
				b.setFont(new Font("Dialog", Font.PLAIN, 22));

				b.setForeground(Color.RED);
				b.setBackground(Color.WHITE);
	}

	cal(){
		// Input and Output Start
		inp = new JTextField("fkjsakjf");
		inp.setBounds(5,0,325,90);

		out = new JLabel("fjkhakjf");
		out.setBounds(5,100,325,90);
		// Input and Output Close

		// Button Start

		// First Row
		per = new JButton("%");
		per.setBounds(5,200,80,60);
		acl = new JButton("AC");
		acl.setBounds(85,200,80,60);
		cl  = new JButton("C");
		cl.setBounds(165,200,80,60);
		div = new JButton("/");
		div.setBounds(245,200,80,60);

		// Second Row
		n7 = new JButton("7");
		n7.setBounds(5,260,80,60);
		n8 = new JButton("8");
		n8.setBounds(85,260,80,60);
		n9  = new JButton("9");
		n9.setBounds(165,260,80,60);
		mul = new JButton("x");
		mul.setBounds(245,260,80,60);

		// Third Row
		n4 = new JButton("4");
		n4.setBounds(5,320,80,60);
		n5 = new JButton("5");
		n5.setBounds(85,320,80,60);
		n6  = new JButton("6");
		n6.setBounds(165,320,80,60);
		sub = new JButton("-");
		sub.setBounds(245,320,80,60);

		// Fourth Row

		n1 = new JButton("1");
		n1.setBounds(5,380,80,60);
		n2 = new JButton("2");
		n2.setBounds(85,380,80,60);
		n3  = new JButton("3");
		n3.setBounds(165,380,80,60);
		sum = new JButton("+");
		sum.setBounds(245,380,80,60);

		// Fifth Row
		point = new JButton(".");
		point.setBounds(5,440,80,60);
		n0 = new JButton("0");
		n0.setBounds(85,440,80,60);
		eq  = new JButton("=");
		eq.setBounds(165,440,160,60);

		// Button Font size, font style
		buttonPropertySet(per);
		buttonPropertySet(acl);
		buttonPropertySet(cl);
		buttonPropertySet(div);
		buttonPropertySet(n7);
		buttonPropertySet(n8);
		buttonPropertySet(n9);
		buttonPropertySet(mul);
		buttonPropertySet(n4);
		buttonPropertySet(n5);
		buttonPropertySet(n6);
		buttonPropertySet(sub);
		buttonPropertySet(n1);
		buttonPropertySet(n2);
		buttonPropertySet(n3);
		buttonPropertySet(sum);
		buttonPropertySet(point);
		buttonPropertySet(n0);
		buttonPropertySet(eq);

		// Add Section

		add(inp);add(out);
		add(per);add(acl);add(cl);add(div);
		add(n7);add(n8);add(n9);add(mul);
		add(n4);add(n5);add(n6);add(sub);
		add(n1);add(n2);add(n3);add(sum);
		add(point);add(n0);add(eq);

		setLayout(null);
		setTitle("Calculator");
		setSize(350, 550);
		setVisible(true);

	}
}

public class calculator{
	public static void main(String args[]){
		new cal();
	}
}