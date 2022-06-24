package com.company;

import javax.swing.*;


public class MyFrame extends JFrame {
    GamePanel panel;

    public MyFrame() {
        super("Bopek Pong");
        panel = new GamePanel();
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(1000,600);
        this.setLocation(50,50);

        this.setResizable(false);
        this.setVisible(true);

    }

}