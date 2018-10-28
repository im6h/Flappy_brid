package FlappyBird;

import javax.swing.*;
import java.awt.*;

public class Bird extends JPanel {
    private static int y = 100;
    private static int x = 100;
    public int getY(){
        return y;
    }
    public int getX(){
        return x;
    }
    public void paint(Graphics b){
        b.setColor(Color.red);
        b.fillRect(x,y,10,10);
    }

    public void increaseY(){
        y++;
    }
    public void discountY(){
        y-=30;
    }
}
