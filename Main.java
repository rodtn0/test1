import javax.swing.*;

/**
 * 23:45초부터 시작
 */
public class Main {

   private static final int WIDTH = 800;
   private static final int HEIGHT = 600;
   public static void main(String[] args) {
      final JFrame frame = new JFrame("Snake Game");
      frame.setSize(WIDTH, HEIGHT);
      SnakeGame game = new SnakeGame(WIDTH, HEIGHT);
      frame.add(game);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setResizable(false);
      frame.setVisible(true);
      frame.pack();
      game.startGame();
   }
}