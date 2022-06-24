package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;


public class Menu extends Rectangle  {

    public Menu(int x, int y, int width, int height, int id) {
        super(x, y, width, height);

    }


    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case KeyEvent.VK_1:
                Ball.setBallVelocity(2);
                break;
            case KeyEvent.VK_2:
                Ball.setBallVelocity(4);
                break;
            case KeyEvent.VK_3:
                Ball.setBallVelocity(6);
                break;
        }
    }

    public void draw(Graphics g){
        g.setColor(Color.PINK);
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Score1", Font.CENTER_BASELINE, 18));
        g.drawString("EASY (1)", x+25, y+29);
        g.setColor(Color.PINK);
        g.fillRect(x, y+100, width, height);
        g.setColor(Color.BLACK);
        g.drawString("MEDIUM (2)", x+12, y+129);
        g.setColor(Color.PINK);
        g.fillRect(x, y+200, width, height);
        g.setColor(Color.BLACK);
        g.drawString("HARD (3)", x+23, y+229);
    }
}