import java.awt.*;
import java.awt.event.*;
public class Program13  implements ActionListener
{
    Frame f;
    Label lb1, lb2, lb3;
    Button btn;
    Program13()
    {
        f = new Frame("Java AWT");
        lb1 = new Label("Hi!");
        lb2 = new Label("Good Morning!!");
        lb3 = new Label("Thanks!");
        btn = new Button("Click Here!");



        btn.setSize(20,10);
        btn.addActionListener(this);

        /* Add Labels and btn on the Frame. */
        f.add(lb1);
        f.add(lb2);
        f.add(lb3);
        f.add(btn);

        /* Set properties of the Frame. */
        f.setLayout(new FlowLayout());
        f.setSize(720,600);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        f.setBackground(Color.CYAN);
    }

    public static void main(String[] ar)
    {
        Program13 sl = new Program13();
    }
}