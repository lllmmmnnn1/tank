package com.mashibing.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        TankFrame frame = new TankFrame();

        while (true) {
            Thread.sleep(50);
            List list = new ArrayList();
            frame.repaint();
        }


    }

}
