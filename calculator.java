import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

class cal extends JFrame {
    JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, eq, div, mul, sum, sub, cl, acl, point, per;
    JTextField inp;
    JLabel out;
    int pn = 0;

    // Button Font, Font Style, Font Size
    void buttonPropertySet(JButton b) {
        b.setFont(new Font("Dialog", Font.PLAIN, 22));

        b.setForeground(Color.RED);
        b.setBackground(Color.WHITE);
        if (b.getText() == "%") {
            b.setBackground(Color.BLACK);
        }
    }

    // Text Field Font, Font Style, Font Size
    void tfFontSet(JTextField tf) {
        tf.setFont(new Font("Dialog", Font.PLAIN, 30));
    }

    // Label Font, Font Style, Font Size
    void labelFontSet(JLabel lb) {
        lb.setFont(new Font("Dialog", Font.PLAIN, 28));
    }

    // Input Button Get Input Handling
    void hillClimb(ActionEvent e) {
        String s = e.getActionCommand();
        String str = inp.getText();
        str += s;
        inp.setText(str);
    }

    cal() {
        // Input and Output Start
        inp = new JTextField("");
        inp.setBounds(5, 10, 325, 90);

        out = new JLabel("");
        out.setBounds(5, 100, 325, 90);
        // Input and Output Close

        // Button Start

        // First Row
        per = new JButton("%");
        per.setBounds(5, 200, 80, 60);
        acl = new JButton("AC");
        acl.setBounds(85, 200, 80, 60);
        cl = new JButton("C");
        cl.setBounds(165, 200, 80, 60);
        div = new JButton("/");
        div.setBounds(245, 200, 80, 60);

        // Second Row
        n7 = new JButton("7");
        n7.setBounds(5, 260, 80, 60);
        n8 = new JButton("8");
        n8.setBounds(85, 260, 80, 60);
        n9 = new JButton("9");
        n9.setBounds(165, 260, 80, 60);
        mul = new JButton("x");
        mul.setBounds(245, 260, 80, 60);

        // Third Row
        n4 = new JButton("4");
        n4.setBounds(5, 320, 80, 60);
        n5 = new JButton("5");
        n5.setBounds(85, 320, 80, 60);
        n6 = new JButton("6");
        n6.setBounds(165, 320, 80, 60);
        sub = new JButton("-");
        sub.setBounds(245, 320, 80, 60);

        // Fourth Row

        n1 = new JButton("1");
        n1.setBounds(5, 380, 80, 60);
        n2 = new JButton("2");
        n2.setBounds(85, 380, 80, 60);
        n3 = new JButton("3");
        n3.setBounds(165, 380, 80, 60);
        sum = new JButton("+");
        sum.setBounds(245, 380, 80, 60);

        // Fifth Row
        point = new JButton(".");
        point.setBounds(5, 440, 80, 60);
        n0 = new JButton("0");
        n0.setBounds(85, 440, 80, 60);
        eq = new JButton("=");
        eq.setBounds(165, 440, 160, 60);

        // Set Button Font size, font style, font
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

        // Set TextField Font size, font style, font
        tfFontSet(inp);

        // Set Label Font size, font style, font
        labelFontSet(out);
        // Add Section

        add(inp);
        add(out);
        add(per);
        add(acl);
        add(cl);
        add(div);
        add(n7);
        add(n8);
        add(n9);
        add(mul);
        add(n4);
        add(n5);
        add(n6);
        add(sub);
        add(n1);
        add(n2);
        add(n3);
        add(sum);
        add(point);
        add(n0);
        add(eq);

        // ---------------Action Listener Add-------------

        per.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent x) {
                float val = Float.parseFloat(inp.getText());
                val = val / 100;
                out.setText(String.valueOf(val));
                inp.setText(String.valueOf(val));
            }
        });

        acl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent x) {
                inp.setText("");
                out.setText("");
                pn = 0;
            }
        });

        cl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent x) {
                String str = inp.getText();
                // String hstr = str;
                int l = str.length();
                str = str.substring(0, l - 1);
                inp.setText(str);
            }
        });
        inp.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (caracter == '.') {
                    String str = inp.getText();
                    int l = str.length();
                    int cnt = 0;
                    for (int i = 0; i < l; i++) {
                        if (str.charAt(i) != '.')
                            cnt++;
                    }
                    if (cnt != l) {
                        e.consume();
                    }
                } else if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    e.consume();
                }
            }
        });

        n0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hillClimb(e);
            }
        });

        n1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hillClimb(e);
            }
        });
        n2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hillClimb(e);
            }
        });
        n3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hillClimb(e);
            }
        });
        n4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hillClimb(e);
            }
        });
        n5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hillClimb(e);
            }
        });
        n6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hillClimb(e);
            }
        });
        n7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hillClimb(e);
            }
        });
        n8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hillClimb(e);
            }
        });

        n9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hillClimb(e);
            }
        });

        point.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = inp.getText();
                int l = str.length();
                int cnt = 0;
                for (int i = 0; i < l; i++) {
                    if (str.charAt(i) != '.')
                        cnt++;
                }
                if (cnt == l) {
                    String s = e.getActionCommand();
                    str += s;
                    inp.setText(str);
                }
            }
        });

        setLayout(null);
        setTitle("Calculator");
        setSize(350, 550);
        setVisible(true);

    }
}

public class calculator {
    public static void main(String args[]) {
        new cal();
    }
}