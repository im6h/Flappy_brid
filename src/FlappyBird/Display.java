package FlappyBird;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Vu
 * @version 1.0
 * date : 26/10/2018
 */
public class Display extends JFrame {

    /**
     *
     */

    Draw draw = new Draw();
    private Bird bird = new Bird();
    public Display(){
        this.setTitle("Flappy Bird");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,450);
        this.setResizable(false);
        this.setLocation(400,400);
        this.add(draw);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                bird.discountY();
            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                bird.discountY();
            }
        });
    }

    public static void main(String[] args) {
        Display display = new Display();
    }
}
