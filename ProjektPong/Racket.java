package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;


public class Racket extends Rectangle  {

    private int id;
    private int speed = 10;
    private int velocity;

    public Racket(int x, int y, int width, int height, int id) {
        super(x, y, width, height);

        this.id = id;
    }

    public void keyPressed(KeyEvent e){
        switch(id){
            case 2:
                if(e.getKeyCode() == KeyEvent.VK_UP)
                {
                    racketDirection(-speed);

                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN)
                {
                    racketDirection(speed);
                }
                break;
            case 1:
                if(e.getKeyCode() == KeyEvent.VK_W)
                {
                    racketDirection(-speed);
                }
                if(e.getKeyCode() == KeyEvent.VK_S)
                {
                    racketDirection(speed);
                }
                break;
        }
    }

    public void keyReleased(KeyEvent e){
        switch(id){
            case 2:
                if(e.getKeyCode() == KeyEvent.VK_UP)
                {
                    racketDirection(0);
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN)
                {
                    racketDirection(0);
                }
                break;
            case 1:
                if(e.getKeyCode() == KeyEvent.VK_W)
                {
                    racketDirection(0);
                }
                if(e.getKeyCode() == KeyEvent.VK_S)
                {
                    racketDirection(0);
                }
                break;
        }
    }

    public void racketDirection(int direction){
        velocity = direction;
    }

    public void move(){
        y = y + velocity;

        if(y <= 0)
        {
            y = 0;
        }

        if(y >= 460)
        {
            y = 460;
        }

    }

    public void draw(Graphics g){
        g.setColor(Color.PINK);
        g.fillRect(x, y, width, height);
    }
}