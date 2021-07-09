import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class six extends Applet implements ActionListener {
    private static final long serialVersionUID = 1L;
    TextField input1 = new TextField(10);
    TextField input2 = new TextField(10);
    TextField result = new TextField(10);
    Button add = new Button("Add");
    Button sub = new Button("Substract");

    public void init() {
        input1.setBounds(10, 10, 50, 20);
        add(input1);
        setLayout(null);
        input2.setBounds(80, 10, 50, 20);
        add(input2);
        setLayout(null);
        add.setBounds(10, 50, 30, 20);
        add(add);
        add.addActionListener(this);
        setLayout(null);
        sub.setBounds(50, 50, 60, 20);
        add(sub);
        sub.addActionListener(this);
        setLayout(null);
        result.setBounds(10, 90, 50, 20);
        add(result);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(input1.getText());
        int n2 = Integer.parseInt(input2.getText());
        if (e.getSource() == add)
            result.setText(" " + (n1 + n2));
        if (e.getSource() == sub)
            result.setText(" " + (n1 - n2));
    }
}
/* <applet code="six" width="120" height="120"> </applet> */