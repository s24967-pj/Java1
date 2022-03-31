package gamers;

import main.Pair;
import main.Unit;

public class s24967 extends Unit {
    public s24967(String id, Pair<Double, Double> position, double rotate, CollisionModel model) {
        super(id, position, rotate, model);
    }

    final int TIMER_10000 = 10000;

    @Override
    public void run() {
        this.enableStopOnWall();
        this.enableMovement();
        this.forward();

        int timer = 0;
        boolean isRotateLeftTrue = true;
        while (true) {


            if (this.nearestCollision() <= 2 && this.nearestCollision() > 0) {
                if (this.whatIsInRange() == 3) {
                    ShotIfTargetNearby();
                } else if (this.nearestCollision() > 0 && this.whatIsInRange() == 2) {
                    this.rotateBy(45);
                   // this.goBy(3);
                } else if (this.nearestCollision() > 0 && this.whatIsInRange() == 1) {
                    this.rotateBy(45);
                   // this.goBy(3);
                }
                //this.goBy(3);
            }
            if (timer > TIMER_10000 && isRotateLeftTrue) {
                StopRobotAndCheckSurroundings(true, 1200);
                timer = 0;
                isRotateLeftTrue = false;
            }

            if(timer > TIMER_10000)
            {
                StopRobotAndCheckSurroundings(false, 1200);
                timer = 0;
                isRotateLeftTrue = true;
            }
            timer++;
        }
    }

    private void ShotIfTargetNearby() {
        for (int i = 0; i < 1000; i++) {
            this.attackInNextMove();
        }
    }

    private void RobotSleep(int timeToSleep){
        try {
            Thread.sleep(timeToSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void StopRobotAndCheckSurroundings(boolean rotateLeft, int howLongToRotate)
    {
        if(rotateLeft)
        {
            for (int i = 0; i < howLongToRotate; i++) {
                this.stop();
                this.rotateLeft();
                if (this.whatIsInRange() == 3) {
                    ShotIfTargetNearby();
                }
                RobotSleep(1);
            }
            this.stopRotate();
            this.forward();
            return;
        }

        for (int i = 0; i < howLongToRotate; i++) {
            this.stop();
            this.rotateRight();
            if (this.whatIsInRange() == 3) {
                ShotIfTargetNearby();
            }
            RobotSleep(1);
        }
        this.stopRotate();
        this.forward();


    }
}









