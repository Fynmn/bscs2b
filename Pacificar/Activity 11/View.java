import javax.swing.*;
import java.awt.*;

public class View{
    private JLabel firstnum, secondnum, result;
    public static JButton btn_add, btn_multiply, btn_minus, btn_percent, btn_divide, btn_clear;
    public static JTextField t1, t2, t3;

    //The GUI
    public View() {
        JFrame frame = new JFrame("Swing Arithmetics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(280, 240);
        frame.setLocationRelativeTo(null);

        //Creating the panel and the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 3));
        firstnum = new JLabel("First Number");
        secondnum = new JLabel("Second Number");
        result = new JLabel("Result");
        btn_add = new JButton("+");
        btn_multiply = new JButton("*");
        btn_percent = new JButton("%");
        btn_minus = new JButton("-");
        btn_divide = new JButton("/");
        btn_clear = new JButton("CLEAR");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false);

        //Adding the components to the panel
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel.add(firstnum);
        panel.add(t1);
        panel.add(secondnum);
        panel.add(t2);
        panel.add(result);
        panel.add(t3);
        panel.add(btn_add);
        panel.add(btn_minus);
        panel.add(btn_multiply);
        panel.add(btn_divide);
        panel.add(btn_percent);
        panel.add(btn_clear);
        frame.add(panel);
    }
    //getters
    public static JButton getBtn_add() {
        return btn_add;
    }
    public JButton getBtn_multiply() {
        return btn_multiply;
    }
    public JButton getBtn_minus() {
        return btn_minus;
    }
    public JButton getBtn_percent() {
        return btn_percent;
    }
    public JButton getBtn_divide() {
        return btn_divide;
    }
    public JButton getBtn_clear() {
        return btn_clear;
    }
    public JTextField getT1() {
        return t1;
    }
    public JTextField getT2() {
        return t2;
    }
}
