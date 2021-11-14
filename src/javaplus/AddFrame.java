package javaplus;

import javax.swing.*;
import java.awt.*;

public class AddFrame extends JFrame {
    AddFrame(){
        setTitle("Jframe");
        setSize(300,300);

        JButton button = new JButton("button");
        JCheckBox box = new JCheckBox("checkBox");
        JSlider slide = new JSlider();
        JTextField tf = new JTextField("text 입력",20);
        this.setLayout(new FlowLayout());

        this.add(button);
        this.add(box);
        this.add(slide);
        this.add(tf);

        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//지금 만든 프로그램의 닫는기능을 설정
    }
    public static void main(String[] args) {
            new AddFrame();

    }
}

