package javaplus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse extends JFrame {
    JPanel jp = new JPanel();
    JLabel la;
    Mouse(){
        setTitle("mouse 이벤트창");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(jp);

        jp.addMouseListener(new MouseListnener1());
        jp.addMouseMotionListener(new MouseListnener1());
        la = new JLabel("마우스를 올려보세요!");
        jp.add(la);
        setSize(300,300);
        setVisible(true);

    }




    class MouseListnener1 implements MouseListener, MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            la.setText("마우스 클릭횟수: "+e.getClickCount());
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JPanel p = (JPanel)e.getSource();
            p.setBackground(Color.RED);//판의 배경을 빨간색으로 바꾸겠다.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JPanel p = (JPanel)e.getSource();
            p.setBackground(Color.YELLOW);//판의 배경을 노란색으로 바꾸겠다.
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            la.setText("Mouse Dragged ("+e.getX()+","+e.getY()+")");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            la.setText("Mouse Dragged ("+e.getX()+","+e.getY()+")");
        }
    }





    public static void main(String[] args) {
        new Mouse();
    }
}
