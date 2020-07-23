package com.mashibing.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        TankFrame frame = new TankFrame();

        int initTankCount = Integer.parseInt((String)PropertyMgr.get("initTankCount"));

        //初始化敌方坦克
        for (int i = 0; i < initTankCount; i++) {
            frame.tanks.add(new Tank(50 + i * 80, 200, Dir.DOWN, Group.BAD, frame));
        }

        while (true) {
            Thread.sleep(50);
            List list = new ArrayList();
            frame.repaint();
        }


    }

}
