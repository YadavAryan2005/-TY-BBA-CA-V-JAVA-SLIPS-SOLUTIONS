// A) Write a java program to display Label with text “Dr. D Y Patil College”,
// background color Red and font size 20 on the frame.
import java.awt.*;
public class slip7_1 extends Frame
{
    Label l1;
    slip7_1()
    {
        setVisible(true);
        setSize(500 ,500);
        setLayout(new FlowLayout());
        l1=new Label("Dr. D Y Patil College");
        l1.setBackground(Color.red);
        l1.setFont(new Font("gigi",50, 20));
        add(l1); 
    }
    public static void main(String[] args) {
        new slip7_1();
    }
}
