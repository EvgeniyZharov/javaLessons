package com.company.Лабораторная6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

class TaskSix{
    public static void main(String[] args){
        Random random = new Random();
        int number = random.nextInt(20) + 1;
        System.out.println(number);
        NewWindow window = new NewWindow(number);
    }
}

class NewWindow extends JFrame{
    private int number;
    private int colvo = 0;

    JTextField textField = new JTextField(10);
    JButton button = new JButton("Check it.");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);
    JLabel label = new JLabel("Угадайте число с трех попыток.");

    NewWindow(int number){
        super("Task 6");

        this.number = number;
        setLayout(new FlowLayout());
        setSize(350, 400);
//        add(new JLabel("Угадайте число с трех попыток."));
        add(label);
        add(textField);
        add(button);
        textField.setFont(fnt);
        setVisible(true);
        button.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent event) {
            try {
                int num = Integer.parseInt(textField.getText().trim());
                if (num == number){
                    JOptionPane.showMessageDialog(null, "Вы угадали!");
                    setVisible(false);
                }


                else if (num > number && colvo < 3){
                    colvo++;
                    label.setText("Неправильно! Загаданное число меньше.");
                }

                else if (num < number && colvo < 3){
                    colvo++;
                    label.setText("Неправильно! Загаданное число больше.");
                }


                else {
                    JOptionPane.showMessageDialog(null, "Неправильно.");
                    setVisible(false);
                }

            } catch (Exception ex) {
                label.setText("Ошибка в числе.");
            }
            }
        });
    }
}