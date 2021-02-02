import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends View{

    public Model model = new Model(); //creating the object for model
    public View view = new View(); //creating the object for view
    public long ans; //initializing the variable to store answer for every operation

    public void ControllerInit(Model m, View v){
        //Action Event handler
        processOperator handler = new processOperator();
        //Add Events
        getBtn_add().addActionListener(handler);
        getBtn_multiply().addActionListener(handler);
        getBtn_minus().addActionListener(handler);
        getBtn_divide().addActionListener(handler);
        getBtn_percent().addActionListener(handler);
        getBtn_clear().addActionListener(handler);
    }
    //parses num1 from JTextfield String to Long Data Type
    public long num1parser(){
        JTextField t1 = view.getT1();
        String text1 = t1.getText();
        Long parsedt1 = Long.parseLong(text1);
        return parsedt1;
    }
    //parses num2 from JTextfield String to Long Data Type
    public long num2parser(){
        JTextField t2 = view.getT2();
        String text2 = t2.getText();
        Long parsedt2 = Long.parseLong(text2);
        return parsedt2;
    }

    //Action Listeners
    private class processOperator implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==view.getBtn_add()){
                ans = model.calculate(num1parser(), num2parser(), "+");
                view.t3.setText(Long.toString(ans));
            } else if (e.getSource()==view.getBtn_multiply()){
                ans = model.calculate(num1parser(), num2parser(), "*");
                view.t3.setText(Long.toString(ans));
            } else if (e.getSource()==view.getBtn_divide()){
                ans = model.calculate(num1parser(), num2parser(), "/");
                view.t3.setText(Long.toString(ans));
            } else if (e.getSource()==view.getBtn_minus()){
                ans = model.calculate(num1parser(), num2parser(), "-");
                view.t3.setText(Long.toString(ans));
            } else if (e.getSource()==view.getBtn_percent()){
                ans = model.calculate(num1parser(), num2parser(), "%");
                view.t3.setText(Long.toString(ans));
            } else if (e.getSource()==view.getBtn_clear()){
                view.t1.setText("");
                view.t2.setText("");
                view.t3.setText("");
            }
        }
    }

}
