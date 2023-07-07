package sub3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mycalc extends JFrame {
    String st1 = "";
    String st2 = "";
    String temp="";
    private JPanel Mycalc;
    private JTextField tiping;
    private JButton bt7;
    private JButton bt0;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt8;
    private JButton bt9;
    private JButton btDiv;
    private JButton btMulti;
    private JButton btMinus;
    private JButton btPlus;
    private JButton btEq;
    private JButton btCancel;
    private JTextField answer;
    private double num1 = 0;
    private double num2 = 0;
    private double result = 0;

    private int opreator = 0;// 1 plus, 2 minus, 3 multi, 4 Div

    private int count = 0;

    public Mycalc() {
        setContentPane(Mycalc);
        setTitle("Mycal v1.0");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (temp.equals("")) {
                    st1 += bt0.getText();
                } else
                    st2+=bt0.getText();
                    tiping.setText(temp + st2);
                try {
                    oper(Double.parseDouble(st1), Double.parseDouble(st2));
                } catch (Exception ei) {
                    tiping.setText(st1);
                    answer.setText(st1);
                }
            }
        });
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (temp.equals("")) {
                    st1 += bt1.getText();
                } else
                    st2+=bt1.getText();
                tiping.setText(temp + st2);
                try {
                    oper(Double.parseDouble(st1), Double.parseDouble(st2));
                } catch (Exception ei) {
                    tiping.setText(st1);
                    answer.setText(st1);
                }
            }
        });
        btEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiping.setText(String.valueOf(result));
                answer.setText("");
                st1 = String.valueOf(result);
                temp="";
                opreator=0;
                result=0;

            }
        });
        btCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = 0;
                result = 0;
                st1 = "";
                st2 = "";
                opreator = 0;
                tiping.setText("");
                answer.setText("");
                temp="";
            }
        });
        btPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opreator = 1;
                if(opreator!=0) {
                    st1 = answer.getText();
                }
                temp=st1+btPlus.getText();
                tiping.setText(temp);
                st2 = "";
            }
        });
        btMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opreator = 2;
                if(opreator!=0) {
                    st1 = answer.getText();
                }
                temp=st1+btMinus.getText();
                tiping.setText(temp);
                st2 = "";
            }
        });
        btMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            opreator = 3;
                if(opreator!=0) {
                st1 = answer.getText();
            }
            temp=st1+btMulti.getText();
                tiping.setText(temp);
            st2 = "";
        }
    });
        btDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opreator = 4;
                if(opreator!=0) {
                    st1 = answer.getText();
                }
                temp=st1+btDiv.getText();
                tiping.setText(temp);
                st2 = "";
            }
        });
    }

    public static void main(String[] args) {
        sub3.Mycalc mycalc = new Mycalc();
    }

    public void oper(double a, double b) {
        if (opreator == 1)
            result = a + b;
        else if (opreator == 2)
            result = a - b;
        else if (opreator == 3)
            result = a * b;
        else if (opreator == 4)
            result = a / b;
        else
            result = a;
        answer.setText(String.valueOf(result));
    }
}
