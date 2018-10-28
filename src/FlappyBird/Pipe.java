package FlappyBird;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Pipe extends JPanel {


    private static int x = 400, x2 = x + 140, x3 = x2 + 140, x4 = x3 + 140;
    private static int h1, h2, h3, h4;
    private static boolean b11 = false;
    private static boolean b12 = false;
    private static boolean b13 = false;
    private static boolean b14 = false;

    public static int getH1() {
        return h1;
    }

    public static int getH2() {
        return h2;
    }

    public static int getH3() {
        return h3;
    }

    public static int getH4() {
        return h4;
    }

    @Override
    public int getX() {
        return x;
    }

    public static int getX2() {
        return x2;
    }

    public static int getX3() {
        return x3;
    }

    public static int getX4() {
        return x4;
    }

    public void randomFun() {
        Random rd = new Random();
        if (b11 == false) {
            h1 = rd.nextInt(200);
            b11 = true;
        }
        if (b12 == false) {
            h2 = rd.nextInt(200);
            b12 = true;
        }
        if (b13 == false) {
            h3 = rd.nextInt(200);
            b13 = true;
        }
        if (b14 == false) {
            h4 = rd.nextInt(200);
            b14 = true;
        }
    }

    public void paint(Graphics pipe) {
        randomFun();
        // x1
        pipe.setColor(Color.green);
        pipe.fillRect(x, 0, 50, h1);
        pipe.setColor(Color.green);
        pipe.fillRect(x, h1 + 90, 50, 300);

        //x2
        pipe.setColor(Color.green);
        pipe.fillRect(x2, 0, 50, h2);
        pipe.setColor(Color.green);
        pipe.fillRect(x2, h2 + 90, 50, 300);

        pipe.setColor(Color.green);
        pipe.fillRect(x3, 0, 50, h3);
        pipe.setColor(Color.green);
        pipe.fillRect(x3, h3 + 90, 50, 300);


        pipe.setColor(Color.green);
        pipe.fillRect(x4, 0, 50, h4);
        pipe.setColor(Color.green);
        pipe.fillRect(x4, h4 + 90, 50, 300);
    }

    public void discountX() {
        x--;
        x2--;
        x3--;
        x4--;
    }

    public void repeatX() {
        if (x == -50) {
            x = 500;
            b11 = false;
        }
        if (x2 == -50) {
            x2 = 500;
            b12 = false;
        }
        if (x3 == -50) {
            x3 = 500;
            b13 = false;
        }
        if (x4 == -50) {
            x4 = 500;
            b14 = false;
        }
    }
}
