package com.company;
import java.awt.*;

public class Ball extends Rectangle  {
    private static int xVelocity;
    private static int yVelocity;

    public Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void draw(Graphics g){
        g.setColor(Color.GRAY);
        g.fillOval(x, y, width, height);
    }

    public void moveBall(){
        y += yVelocity;
        x += xVelocity;

        checkWallCollision();
        checkRacketCollision();
    }

    public void checkWallCollision(){
        if(y <= 0)
        {
            yVelocity = -yVelocity;
        }
        if(y >= 550)
        {
            yVelocity = -yVelocity;
        }
    }

    public void checkRacketCollision()
    {
        if(x <= 30)
        {
            if(y >= GamePanel.racket1.y  && y <= GamePanel.racket1.y + 100) {
                xVelocity = -xVelocity;
            }
        }
        if(x >= 940)
        {
            if(y >= GamePanel.racket2.y  && y <= GamePanel.racket2.y + 100) {
                xVelocity = -xVelocity;
            }
        }
    }

    public void showBallAgain(){
        if(GamePanel.ball.x <= 5)
        {
            GamePanel.ball.x = 500;
            GamePanel.ball.y = 200;
            xVelocity = -xVelocity;
        }
        if(GamePanel.ball.x >= 995)
        {
            GamePanel.ball.x = 500;
            GamePanel.ball.y = 200;
            xVelocity = -xVelocity;
        }
    }

    public static void setBallVelocity(int velocity){
        xVelocity = velocity;
        yVelocity = velocity;
    }
}
