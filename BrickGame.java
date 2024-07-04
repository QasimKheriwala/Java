import java.awt.Color;
import javax.swing.JFrame;
public class BrickGame {
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        GamePlay gamePlay = new GamePlay();

        obj.setBounds(10, 10, 1000, 1000);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        obj.setVisible(true);
    }

}