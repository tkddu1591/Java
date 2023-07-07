package sub2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ComponentsTest extends JFrame {
    private JPanel Components;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JLabel lbuid1;
    private JLabel lbuid2;
    private JLabel lbuid3;
    private JCheckBox chk1;
    private JButton button7;
    private JCheckBox chk2;
    private JCheckBox chk3;
    private JCheckBox chk4;
    private JCheckBox chk5;
    private JLabel ccc;
    private JRadioButton rb1;
    private JButton button8;
    private JLabel lbGender;
    private JRadioButton rb2;


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public  ComponentsTest(){
        setContentPane(Components);
        setTitle("Welcome");
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answer =JOptionPane.showConfirmDialog(null, "버튼 1 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
                if(answer==0)
                    System.out.println("YES 클릭...");
                else
                    System.out.println("No 클릭...");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uid = textField1.getText();
                lbuid1.setText("결과 : "+uid);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uid = textField2.getText();
                lbuid2.setText("결과 : "+uid);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uid = textField3.getText();
                lbuid3.setText("결과 : "+uid);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<String> fruits = new ArrayList<>();
                if(chk1.isSelected())
                    fruits.add(chk1.getText());
                if(chk2.isSelected())
                    fruits.add(chk2.getText());
                if(chk3.isSelected())
                    fruits.add(chk3.getText());
                if(chk4.isSelected())
                    fruits.add(chk4.getText());
                if(chk5.isSelected())
                    fruits.add(chk5.getText());
                ccc.setText("결과 : "+fruits);

            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rb1.isSelected())
                    lbGender.setText("선택결과 : "+rb1.getText());
                else if(rb2.isSelected())
                    lbGender.setText("선택결과 : "+rb2.getText());
            }
        });
    }

    public static void main(String[] args) {
        ComponentsTest com = new ComponentsTest();
    }


}
