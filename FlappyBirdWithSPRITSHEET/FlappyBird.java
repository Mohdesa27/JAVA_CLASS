import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

public class FlappyBird extends JPanel implements ActionListener, KeyListener {
    int boardWidth = 360;
    int boardHeight = 640;

    // Background
    private BufferedImage backgroundImg;

    // Sprite Animation
    private BufferedImage spriteSheet;
    private BufferedImage[] birdSprites;
    private int currentFrame = 0;
    private Timer spriteAnimationTimer;

    // Bird and Pipe Dimensions
    int birdX = boardWidth / 8;
    int birdY = boardWidth / 2;
    int birdWidth = 45;
    int birdHeight = 40;

    // Pipe Details
    int pipeX = boardWidth;
    int pipeY = 0;
    int pipeWidth = 64; // Scaled by 1/6
    int pipeHeight = 512;

    class Pipe {
        int x = pipeX;
        int y = pipeY;
        int width = pipeWidth;
        int height = pipeHeight;
        Image img;
        boolean passed = false;

        Pipe(Image img) {
            this.img = img;
        }
    }

    // Game Logic
    int velocityX = -4; // Move pipes to the left
    int velocityY = 0; // Move bird up/down
    int gravity = 1;

    ArrayList<Pipe> pipes;
    Timer gameLoop;
    Timer placePipeTimer;
    boolean gameOver = false;
    double score = 0;

    FlappyBird() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setFocusable(true);
        addKeyListener(this);

        // Load Background Image
        try {
            backgroundImg = ImageIO.read(new File("flappyBirdbg.png")); // Path to background image
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Load Sprite Sheet for Bird Animation
        try {
            spriteSheet = ImageIO.read(new File("bird.jpg")); // Path to sprite sheet
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Assuming the sprite sheet contains 5 frames in a single row
        int totalSprites = 5;
        int spriteWidth = 145;
        int spriteHeight = 132;
        birdSprites = new BufferedImage[totalSprites];

        // Extract each sprite from the sprite sheet
        for (int i = 0; i < totalSprites; i++) {
            birdSprites[i] = spriteSheet.getSubimage(i * spriteWidth, 0, spriteWidth, spriteHeight-10);
        }

        // Start Bird Animation Timer
        spriteAnimationTimer = new Timer(200, e -> {
            currentFrame = (currentFrame + 1) % birdSprites.length;
            repaint();
        });
        spriteAnimationTimer.start();

        // Pipes
        pipes = new ArrayList<>();

        // Place Pipes Timer
        placePipeTimer = new Timer(1500, e -> placePipes());
        placePipeTimer.start();

        // Game Timer
        gameLoop = new Timer(1000 / 60, this);
        gameLoop.start();
    }

    void placePipes() {
        int randomPipeY = (int) (pipeY - pipeHeight / 4 - Math.random() * (pipeHeight / 2));
        int openingSpace = boardHeight / 4;

        Pipe topPipe = new Pipe(new ImageIcon(getClass().getResource("toppipe.png")).getImage());
        topPipe.y = randomPipeY;
        pipes.add(topPipe);

        Pipe bottomPipe = new Pipe(new ImageIcon(getClass().getResource("bottompipe.png")).getImage());
        bottomPipe.y = topPipe.y + pipeHeight + openingSpace;
        pipes.add(bottomPipe);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // Background
        if (backgroundImg != null) {
            g.drawImage(backgroundImg, 0, 0, boardWidth, boardHeight, null);
        } else {
            g.setColor(Color.CYAN);
            g.fillRect(0, 0, boardWidth, boardHeight);
        }

        // Bird (Animated)
        g.drawImage(birdSprites[currentFrame], birdX, birdY, birdWidth, birdHeight, null);

        // Pipes
        for (Pipe pipe : pipes) {
            g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null);
        }

        // Score
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.PLAIN, 32));
        if (gameOver) {
            g.drawString("Game Over: " + (int) score, 10, 35);
        } else {
            g.drawString(String.valueOf((int) score), 10, 35);
        }
    }

    public void move() {
        // Bird Movement
        velocityY += gravity;
        birdY += velocityY;
        birdY = Math.max(birdY, 0); // Limit bird to top of the canvas

        // Pipes Movement
        for (Pipe pipe : pipes) {
            pipe.x += velocityX;

            if (!pipe.passed && birdX > pipe.x + pipe.width) {
                score += 0.5;
                pipe.passed = true;
            }

            if (collision(pipe)) {
                gameOver = true;
            }
        }

        if (birdY > boardHeight) {
            gameOver = true;
        }
    }

    boolean collision(Pipe pipe) {
        return birdX < pipe.x + pipe.width && birdX + birdWidth > pipe.x && birdY < pipe.y + pipe.height && birdY + birdHeight > pipe.y;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            move();
            repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            velocityY = -9;

            if (gameOver) {
                // Restart game
                birdY = boardHeight / 2;
                velocityY = 0;
                pipes.clear();
                gameOver = false;
                score = 0;
                gameLoop.start();
                placePipeTimer.start();
                spriteAnimationTimer.start();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}
}
