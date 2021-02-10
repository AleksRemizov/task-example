import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameField extends JPanel implements ActionListener{
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[]x = new int[ALL_DOTS];
    private int[]y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = false;


    public GameField(){
        setBackground(Color.DARK_GRAY);
        loadImages();
    }
    public void initGame(){
        dots = 3;
        for (int i = 0; i < dots; i++) {
            x[i] = 48 -i*DOT_SIZE;
            y[i] = 48;
        }
        timer = new Timer(250,this);
        timer.start();
        createApple();
    }
    public void createApple(){
        appleX = new Random().nextInt(20)*DOT_SIZE;
        appleY = new Random().nextInt(20)*DOT_SIZE;

    }

    public void loadImages(){
        ImageIcon saveApple = new ImageIcon("apple.png");
        apple = saveApple.getImage();

        ImageIcon saveDot = new ImageIcon("dot.png");
        dot = saveDot.getImage();
    }
    public void moveSnake(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(inGame){
            moveSnake();
        }

    }
        repaint();

}
