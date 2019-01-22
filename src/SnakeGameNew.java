import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SnakeGameNew extends JFrame {

    static char dir = '•';
    public static int[] map = new int[]{50, 16};
    public static int[] tailX, tailY;
    public static int[] snakeHead = new int[2];
    public static int[] food = new int[2];
    public static int snakeLength = 0;
    public static boolean gameOver = false;

    public SnakeGameNew() {
        this.setSize(250,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Snake");
        this.setVisible(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                dir = e.getKeyChar();
            }
        });
    }
}
