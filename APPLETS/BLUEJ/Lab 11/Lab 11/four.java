import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class four extends Applet implements ActionListener {
    private static final long serialVersionUID = 1L;
    Label l1, l2;
    TextField t1;
    Button btn;

    public void init() {
        l1 = new Label("Enter the Number:");
        l2 = new Label("Result: ");
        t1 = new TextField();
        btn = new Button("CHECK RESULT");
        add(l1);
        add(t1);
        add(btn);
        add(l2);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            if (Integer.parseInt(t1.getText()) % 2 == 0) {
                l2.setText(t1.getText() + " is even");
            } else {
                l2.setText(t1.getText() + " is Odd");
            }
        }
    }
}
/* <applet code="four" width="190" height="110"> </applet> */