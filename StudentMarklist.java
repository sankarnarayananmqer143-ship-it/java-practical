import java.awt.*;
import java.awt.event.*;

public class StudentMarklist extends Frame implements ActionListener {

    Label l1, l2, l3, l4, l5, l6, l7, l8;
    TextField t1, t2, t3, t4, t5, t6, t7, t8;
    Button b1;

    public StudentMarklist() {

        setLayout(null); // IMPORTANT for setBounds

        l1 = new Label("Register No:");
        t1 = new TextField();
        l1.setBounds(50, 80, 120, 30);
        t1.setBounds(200, 80, 200, 30);

        l2 = new Label("Name:");
        t2 = new TextField();
        l2.setBounds(50, 130, 120, 30);
        t2.setBounds(200, 130, 200, 30);

        l3 = new Label("Java Mark:");
        t3 = new TextField();
        l3.setBounds(50, 180, 120, 30);
        t3.setBounds(200, 180, 200, 30);

        l4 = new Label("CWS Mark:");
        t4 = new TextField();
        l4.setBounds(50, 230, 120, 30);
        t4.setBounds(200, 230, 200, 30);

        l5 = new Label("OS Mark:");
        t5 = new TextField();
        l5.setBounds(50, 280, 120, 30);
        t5.setBounds(200, 280, 200, 30);

        l6 = new Label("Total:");
        t6 = new TextField();
        t6.setEditable(false);
        l6.setBounds(50, 380, 120, 30);
        t6.setBounds(200, 380, 200, 30);

        l7 = new Label("Average:");
        t7 = new TextField();
        t7.setEditable(false);
        l7.setBounds(50, 430, 120, 30);
        t7.setBounds(200, 430, 200, 30);

        l8 = new Label("Grade:");
        t8 = new TextField();
        t8.setEditable(false);
        l8.setBounds(50, 480, 120, 30);
        t8.setBounds(200, 480, 200, 30);

        b1 = new Button("Calculate");
        b1.addActionListener(this);
        b1.setBounds(200, 330, 120, 40);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(l5); add(t5);
        add(l6); add(t6);
        add(l7); add(t7);
        add(l8); add(t8);
        add(b1);

        setTitle("Student Marklist");
        setSize(500, 600);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int javaMark = Integer.parseInt(t3.getText());
            int cwsMark = Integer.parseInt(t4.getText());
            int osMark = Integer.parseInt(t5.getText());

            int total = javaMark + cwsMark + osMark;
            double average = total / 3.0;
            String grade;

            if (average >= 90) grade = "A";
            else if (average >= 75) grade = "B";
            else if (average >= 60) grade = "C";
            else if (average >= 50) grade = "D";
            else grade = "F";

            t6.setText(String.valueOf(total));
            t7.setText(String.valueOf(average));
            t8.setText(grade);

        } catch (NumberFormatException ex) {
            t6.setText("Invalid Input");
            t7.setText("");
            t8.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentMarklist();
    }
}