package Lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    JTextField display = null;
    int res = 0;
    int res1 = 0;
    String operation = "";

    public Calculator() {
        setBounds(100, 100, 300, 350);
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(null);

        JTextField display = new JTextField();
        display.setBounds(0, 0, 300, 25);

        JButton b0 = new JButton("0");
        b0.setBounds(0, 250, 75, 75);

        JButton b1 = new JButton("1");
        b1.setBounds(0, 175, 75, 75);

        JButton b2 = new JButton("2");
        b2.setBounds(75, 175, 75, 75);

        JButton b3 = new JButton("3");
        b3.setBounds(150, 175, 75, 75);

        JButton b4 = new JButton("4");
        b4.setBounds(0, 100, 75, 75);

        JButton b5 = new JButton("5");
        b5.setBounds(75, 100, 75, 75);

        JButton b6 = new JButton("6");
        b6.setBounds(150, 100, 75, 75);

        JButton b7 = new JButton("7");
        b7.setBounds(0, 25, 75, 75);

        JButton b8 = new JButton("8");
        b8.setBounds(75, 25, 75, 75);

        JButton b9 = new JButton("9");
        b9.setBounds(150, 25, 75, 75);

        JButton bRes = new JButton("=");
        bRes.setBounds(75, 250, 150, 75);

        JButton bPlus = new JButton("+");
        bPlus.setBounds(225, 25, 75, 75);

        JButton bMinus = new JButton("-");
        bMinus.setBounds(225, 100, 75, 75);

        JButton bMulti = new JButton("*");
        bMulti.setBounds(225, 175, 75, 75);

        JButton bDivision = new JButton("/");
        bDivision.setBounds(225, 250, 75, 75);

        add(display);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(bRes);
        add(bPlus);
        add(bMinus);
        add(bMulti);
        add(bDivision);

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                display.setText(display.getText() + 1);
                if (res == 0) {
                    res = Integer.valueOf(display.getText());
                } else {
                    res1 = Integer.valueOf(display.getText());
                }
            }
        });

        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                display.setText(display.getText() + 2);
                if (res == 0) {
                    res = Integer.valueOf(display.getText());
                } else {
                    res1 = Integer.valueOf(display.getText());
                }
            }
        });

        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                display.setText(display.getText() + 3);
                if (res == 0) {
                    res = Integer.valueOf(display.getText());
                } else {
                    res1 = Integer.valueOf(display.getText());
                }
            }
        });

        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                display.setText(display.getText() + 4);
                if (res == 0) {
                    res = Integer.valueOf(display.getText());
                } else {
                    res1 = Integer.valueOf(display.getText());
                }
            }
        });

        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                display.setText(display.getText() + 5);
                if (res == 0) {
                    res = Integer.valueOf(display.getText());
                } else {
                    res1 = Integer.valueOf(display.getText());
                }
            }
        });

        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                display.setText(display.getText() + 6);
                if (res == 0) {
                    res = Integer.valueOf(display.getText());
                } else {
                    res1 = Integer.valueOf(display.getText());
                }
            }
        });

        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                display.setText(display.getText() + 7);
                if (res == 0) {
                    res = Integer.valueOf(display.getText());
                } else {
                    res1 = Integer.valueOf(display.getText());
                }
            }
        });

        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                display.setText(display.getText() + 8);
                if (res == 0) {
                    res = Integer.valueOf(display.getText());
                } else {
                    res1 = Integer.valueOf(display.getText());
                }
            }
        });

        b9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                display.setText(display.getText() + 9);
                if (res == 0) {
                    res = Integer.valueOf(display.getText());
                } else {
                    res1 = Integer.valueOf(display.getText());
                }
            }
        });

        b0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                display.setText(display.getText() + 0);
                if (res == 0) {
                    res = Integer.valueOf(display.getText());
                } else {
                    res1 = Integer.valueOf(display.getText());
                }
            }
        });

        bPlus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                res = Integer.valueOf(display.getText());
                display.setText("");
                operation = "+";
            }
        });

        bMinus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                res = Integer.valueOf(display.getText());
                display.setText("");
                operation = "-";
            }
        });

        bMulti.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                res = Integer.valueOf(display.getText());
                display.setText("");
                operation = "*";
            }
        });

        bDivision.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg1) {
                res = Integer.valueOf(display.getText());
                display.setText("");
                operation = "/";
            }
        });

        bRes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
//                int num = res;
//                int num1 = res1;
//                String strOperation = operation;

                String strRes = String.valueOf(calc(res, operation, res1));
                display.setText(strRes);
            }
        });

        setVisible(true);
    }

    public int calc (int n1, String operation, int n2) {
        int res = 0;
        switch (operation) {
            case "+":
                res = n1 + n2;
                break;
            case "-":
                res = n1 - n2;
                break;
            case "*":
                res = n1 * n2;
                break;
            case "/":
                res = n1 / n2;
                break;
            default:
                break;
        }
        return res;
    }
}
