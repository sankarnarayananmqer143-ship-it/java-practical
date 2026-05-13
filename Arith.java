import java.awt.*;
import java.awt.event.*;

class Arith extends Frame implements ActionListener
{
    Label l0, l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;

    public static void main(String args[])
    {
        Arith f = new Arith();
        f.setTitle("Arithmetic");
        f.setSize(500, 700);
        f.setVisible(true);
    }

    Arith()
    {
        setLayout(null);
        l0 = new Label("Arithmetic Operations");
        Font f0=new Font("Arial",Font.BOLD,30);
        l0.setFont(f0);
        l0.setForeground(Color.BLUE);
        l1 = new Label("Number");
        l2 = new Label("Number");
        l3 = new Label("Result");

        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mul");
        b4 = new Button("Div");

        add(l0);
        l0.setBounds(100, 100, 500, 50);

        add(l1);
        l1.setBounds(100, 200, 100, 30);
        add(t1);
        t1.setBounds(250, 200, 150, 30);

        add(l2);
        l2.setBounds(100, 250, 100, 30);
        add(t2);
        t2.setBounds(250, 250, 150, 30);

        add(l3);
        l3.setBounds(100, 300, 100, 30);
        add(t3);
        t3.setBounds(250, 300, 150, 30);

        add(b1);
        b1.addActionListener(this);
        b1.setBounds(100, 400, 60, 40);

        add(b2);
        b2.addActionListener(this);
        b2.setBounds(180, 400, 60, 40);

        add(b3);
        b3.addActionListener(this);
        b3.setBounds(260, 400, 60, 40);

        add(b4);
        b4.addActionListener(this);
        b4.setBounds(340, 400, 60, 40);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == b1)
        {
            String s1 = t1.getText();
            String s2 = t2.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a + b;
            t3.setText("" + c);
        }
        else if (ae.getSource() == b2)
        {
            String s1 = t1.getText();
            String s2 = t2.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a - b;
            t3.setText("" + c);
        }
        else if (ae.getSource() == b3)
        {
            String s1 = t1.getText();
            String s2 = t2.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a * b;
            t3.setText("" + c);
        }
        else if (ae.getSource() == b4)
        {
            String s1 = t1.getText();
            String s2 = t2.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a / b;
            t3.setText("" + c);
        }
    }
}