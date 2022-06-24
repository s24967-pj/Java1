package com.company;

import java.awt.*;

public class Score extends Rectangle{

    public static int g1 = 0;
    public static int g2 = 0;
    public Score() {
        super();
    }

    public void draw(Graphics g) {
            g.setColor(Color.PINK);
            g.setFont(new Font("Score1", Font.BOLD, 40));
            g.drawString(firstPointCounter(), 540, 100);

            g.setColor(Color.PINK);
            g.setFont(new Font("Score2", Font.BOLD, 40));
            g.drawString(secondPointCounter(), 420, 100);
    }

    public static String firstPointCounter() {

            if (GamePanel.ball.x <= 5) {
                g1++;
                GamePanel.ball.showBallAgain();
            }
        return String.valueOf(g1);
    }

    public static String secondPointCounter() {
            if (GamePanel.ball.x >= 995) {
                g2 += 1;
                GamePanel.ball.showBallAgain();
            }
        return String.valueOf(g2);
    }

}
