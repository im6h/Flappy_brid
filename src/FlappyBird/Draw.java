package FlappyBird;

import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel implements Runnable {

    Bird bird = new Bird();
    Pipe pipe = new Pipe();
    Check check = new Check();
    Thread threadDraw;
    public Draw(){
        threadDraw = new Thread(this);
        threadDraw.start();
    }
    @Override
    public void run() {
        while(true){
            repaint();
            pipe.discountX();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pipe.repeatX();

            bird.increaseY();
            if (check.die()==true){
                threadDraw.stop();
            }
        }
    }



    public void paint(Graphics g){
        // draw everthing
        g.setColor(Color.cyan);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.green);
        g.fillRect(0,300,getWidth(),getHeight());
        pipe.paint(g);
        g.setColor(Color.orange);
        g.fillRect(0,320,getWidth(),getHeight());
        bird.paint(g);
    }

}
