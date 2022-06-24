package com.company;

import java.awt.*;

public class winWindow extends Rectangle {
    public String winner;
    public winWindow() {
        super();
    }

    public void draw(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Score1", Font.BOLD, 40));
        g.drawString(whoIsWinner(), 340, 300);
    }

    public String whoIsWinner(){
        if(Score.g1 == 5)
        {
            winner = "PLAYER 2 WINS!";
        }
        if(Score.g2 == 5)
        {
            winner = "PLAYER 1 WINS!";
        }
        return winner;
    }
}
