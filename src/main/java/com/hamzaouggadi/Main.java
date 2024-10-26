package com.hamzaouggadi;

import java.awt.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    private static final int INTERVAL = 10000;
    // Width
    private static final int MAX_X_VALUE = 800;
    // Height
    private static final int MAX_Y_VALUE = 600;

    public static void main(String[] args) throws AWTException {
        System.out.println("If you know, you know");

        Robot robot = new Robot();
        Timer timer = new Timer();
        Random random = new Random();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                robot.mouseMove(random.nextInt(MAX_X_VALUE), random.nextInt(MAX_Y_VALUE));
            }
        }, 0, INTERVAL);
    }
}