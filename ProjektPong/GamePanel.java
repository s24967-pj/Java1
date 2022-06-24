package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class GamePanel extends JPanel implements Runnable {
    static Racket racket1;
    static Racket racket2;
    static Ball ball;
    Score score;
    Menu gameMenu;
    winWindow winner;
    Image image;
    Graphics graphics;
    Thread gameThread;
    boolean isGameMenu = true;

    public GamePanel() {
        createRackets();
        createBall();
        createScore();
        createWinWindow();
        createMenu();
        this.addKeyListener(new AL());
        this.setFocusable(true);
        gameThread = new Thread(this);
        gameThread.start();
        score = new Score();
    }

    public void createRackets() {
        racket1 = new Racket(10, 10, 20, 100, 1);
        racket2 = new Racket(955, 10, 20, 100, 2);
    }

    public void createBall() {
        ball = new Ball(100, 100, 15, 15);
    }

    public void createScore() {
        score = new Score();
    }

    public void createWinWindow() {
        winner = new winWindow();
    }

    public void createMenu() {
        gameMenu = new Menu(440, 200, 120, 50, 1);
    }


    public void paint(Graphics g) {
        image = createImage(getWidth(), getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image, 0, 0, this);
    }

    public void draw(Graphics g) {
        if (isGameMenu) {
            gameMenu.draw(g);
        }
        racket1.draw(g);
        racket2.draw(g);
        if (!isGameMenu) {
            ball.draw(g);
            score.draw(g);
        }

        if (Integer.valueOf(Score.firstPointCounter()) == 5 || Integer.valueOf(Score.secondPointCounter()) == 5) {
            winner.draw(g);
        }
        else{
            racket1.draw(g);
            racket2.draw(g);
            ball.draw(g);
            score.draw(g);
        }
    }


    public void move() {
        racket1.move();
        racket2.move();
        if (!isGameMenu) {
            ball.moveBall();
        }
    }

    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;

        while (true) {
            if (Integer.valueOf(Score.firstPointCounter()) == 5 || Integer.valueOf(Score.secondPointCounter()) == 5) {
                ball.x = 500;
                ball.y = 500;
                racket1.y = 200;
                racket2.y = 200;
            }
                long now = System.nanoTime();
                delta += (now - lastTime) / ns;
                lastTime = now;
                if (delta >= 1) {
                    move();
                    repaint();
                    delta--;
            }
        }
    }



    public class AL extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            if(isGameMenu) {
                gameMenu.keyPressed(e);
                isGameMenu = false;
                repaint();
            }
            else
            {
                racket1.keyPressed(e);
                racket2.keyPressed(e);
            }
        }

        public void keyReleased(KeyEvent e) {
            racket1.keyReleased(e);
            racket2.keyReleased(e);
        }
    }
}


