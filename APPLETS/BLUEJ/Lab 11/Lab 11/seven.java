import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class seven extends Applet implements ItemListener {
    private static final long serialVersionUID = 1L;
    CheckboxGroup c = new CheckboxGroup();
    Checkbox c1 = new Checkbox("RED", c, false);
    Checkbox c2 = new Checkbox("BLUE", c, false);
    TextField out = new TextField(10);

    public void init() {
        c1.setBounds(10, 10, 50, 10);
        add(c1);
        c1.addItemListener(this);
        setLayout(null);
        c2.setBounds(70, 10, 50, 10);
        add(c2);
        c2.addItemListener(this);
        setLayout(null);
        out.setBounds(10, 30, 150, 20);
        add(out);
        setLayout(null);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1)
            out.setText("You have pressed RED");
        if (e.getSource() == c2)
            out.setText("You have pressed BLUE");
    }
}
/* <applet code="seven" width="80" height="60"> </applet> */