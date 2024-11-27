import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        // SpriteAnimation animation = new SpriteAnimation();
        // frame.add(animation);
        // frame.setVisible(true); 
        // SpriteSheetExample panel = new SpriteSheetExample();
        // frame.add(panel);   
		frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        // SpriteSheet spriteSheet = new SpriteSheet();
        // frame.add(spriteSheet);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}    