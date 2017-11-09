package com.gk.test.framework.helpers.utils;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by radiwaneh on 10/15/2017.
 */
public class KeyboardActions {

    public static void clickenter() throws InterruptedException, AWTException {

        Robot robot = new Robot();
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);

    }

    public static void ArrowDown() throws InterruptedException, AWTException {

        Robot robot = new Robot();
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_DOWN);

    }
    public static void PageDown() throws InterruptedException, AWTException {

        Robot robot = new Robot();
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);

    }
}
