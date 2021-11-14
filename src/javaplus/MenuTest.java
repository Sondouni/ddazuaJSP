package javaplus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MenuActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"팝업");//간단한 알림창
    }
}

public class MenuTest extends JFrame {
    MenuTest(){
        setTitle("Menu 만들기");
        createMenu();
        setSize(250,200);
        setVisible(true);
    }
    public void createMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu screenMenu = new JMenu("메뉴바1");
        JMenuItem item = new JMenuItem("팝업");
        item.addActionListener(new MenuActionListener());
        screenMenu.add(item);
        JMenuItem jim = new JMenuItem("ㅇㅇ");
        jim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"ㅇㅇ");
            }
        });
        screenMenu.add(new JMenuItem("Hide"));
        screenMenu.add(jim);
        screenMenu.add(new JMenuItem("ReShow"));
        screenMenu.addSeparator();//메뉴아이템을 구분하는 구분선
        screenMenu.add(new JMenuItem("Exit"));
        JMenu jm = new JMenu("편집");
        jm.add(new JMenuItem("편집안해"));
        mb.add(screenMenu);
        mb.add(jm);
        mb.add(new JMenu("실행"));
        mb.add(new JMenu("도움말"));


        //메뉴바를 현재 프레임의 메뉴로 지정
        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new MenuTest();
    }
}
