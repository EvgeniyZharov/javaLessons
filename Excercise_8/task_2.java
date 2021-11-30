package com.company.Excercise_8;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Main extends JPanel{
    public static String line;

    public static void main(String[] args){
        //создаем окно
//        line = args[0];

        JFrame fr = new JFrame("Load image");
        fr.setSize(900, 700);
        fr.setVisible(true);
        fr.add(new Main());
        fr.setResizable(false);


    }

    public void paint(Graphics g){
        String[] titles = new String[]{"C:\\JavaPrograms\\IntelliJIDEAProjects\\ProjectThree\\src\\com\\company\\Excercise_8\\images\\image_one.png",
                "C:\\JavaPrograms\\IntelliJIDEAProjects\\ProjectThree\\src\\com\\company\\Excercise_8\\images\\image_2.jpg",
                "C:\\JavaPrograms\\IntelliJIDEAProjects\\ProjectThree\\src\\com\\company\\Excercise_8\\images\\image_3.jpg",
                "C:\\JavaPrograms\\IntelliJIDEAProjects\\ProjectThree\\src\\com\\company\\Excercise_8\\images\\image_2.jpg"};
        for (String elem : titles){
            g.drawImage(new ImageIcon(elem).getImage(), 0, 0, 900, 700, null);//выводим линию

            g.drawLine(20, 20, 200, 200);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ok");
        }
//
//        Image img = new ImageIcon(s).getImage();//записываем изображение в переменную
//
//        g.drawImage(img, 0, 0, 900, 700, null);//выводим линию
//
//        g.drawLine(20, 20, 200, 200);//выводим изображение

    }
}

