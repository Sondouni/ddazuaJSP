package javaplus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutEX {
    public static void main(String[] args) {
        new GridWindow();
    }
}
class FlowWindow extends JFrame{
    FlowWindow(){
        setTitle("flow window");
        setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");
        JButton btn3 = new JButton("btn3");

        this.add(btn1);
        this.add(btn2);
        this.add(btn3);

        this.setLayout(new FlowLayout());

        setVisible(true);
    }
}
class BorderWindow extends JFrame{
    BorderWindow(){
        setTitle("Border window");
        setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");
        JButton btn3 = new JButton("btn3");
        JButton btn4 = new JButton("btn4");
        JButton btn5 = new JButton("btn5");



        this.setLayout(new BorderLayout());
        //동서남북 중 어디로 할지 지정해줘야함
        this.add(btn1,BorderLayout.EAST);
        this.add(btn2,BorderLayout.WEST);
        this.add(btn3,BorderLayout.CENTER);
        this.add(btn4,BorderLayout.NORTH);
        this.add(btn5,BorderLayout.SOUTH);
        setVisible(true);
    }
}
class GridWindow extends  JFrame{
    GridWindow(){
        setTitle("Grid window");
        setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");
        JButton btn3 = new JButton("btn3");
        JButton btn4 = new JButton("btn4");
        JButton btn5 = new JButton("btn5");

        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        this.add(btn5);

        this.setLayout(new GridLayout(2,2));
        setVisible(true);
    }
}

