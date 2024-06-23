package Parcial_II.Diferido.GameControler;

import Parcial_II.Diferido.BurbujasPaquete.Burbujas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BubblesController extends JPanel {
    private Burbujas[][] bubbles = new Burbujas[6][5]; // 6 rows, 5 columns
    private int nextColorIndex; 
    private int shooterX;
    private int nextBubbleY = 400;
    private Timer timer;
    private int elapsedTime = 0; // Time in seconds
    private String displayTime = "00:00";
    private boolean isRunning = true;


    public BubblesController() {
        setBackground(Color.BLACK);
        setFocusable(true);
        requestFocusInWindow();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if(shooterX > 0)
                        shooterX -= 10;
                        break;
                    case KeyEvent.VK_RIGHT:
                        if(shooterX < 390)
                        shooterX += 10;
                        break;
                    case KeyEvent.VK_SPACE:
                    case KeyEvent.VK_ENTER:
                        shootBubble();
                        prepareNextBubble(); 
                       
                        break;
                }
              
            }
        });


        Thread movementThread = new Thread(() -> {
            while (isRunning) {
                try {
                    updateGameState();
                    repaint();
                   
                    Thread.sleep(50); // Adjust for desired speed of movement
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        movementThread.start();
        
        
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elapsedTime++;
                if(elapsedTime >=120){
                    timer.stop(); 
                    isRunning=false;
                }
                int minutes = (elapsedTime % 3600) / 60;
                int seconds = elapsedTime % 60;
                displayTime = String.format("%02d:%02d", minutes, seconds);
                repaint(); // Repaint the panel to update any time display
            }
        });
        timer.start();


        
       

     
    }

    private void updateGameState() {
        // Update the positions of bubbles or any other game elements
        for (Burbujas[] row : bubbles) {
            for (Burbujas bubble : row) {
                if (bubble != null) {
                    // Assuming bubble.move() updates its position
                    bubble.move();
                }
            }
        }
    }

    private void prepareNextBubble() {
        nextColorIndex = (int) (Math.random() * 3); 
    }

    private void shootBubble() {
        int colorIndex = nextColorIndex;
      
       
        for (int i = 0; i < bubbles.length; i++) {
            for (int j = 0; j < bubbles[i].length; j++) {
                if (bubbles[i][j] == null) {
                    bubbles[i][j] = new Burbujas(shooterX, nextBubbleY, 30, colorIndex);
                  
                    return; 
                }
            }
        }
    
    }

    private void drawNextBubble(Graphics g) {
        int bubbleDiameter = 30; // Diameter of the bubble, adjust as needed
       

    Color nextBubbleColor;
    switch (nextColorIndex) {
        case 0:
            nextBubbleColor = Color.BLUE;
            break;
        case 1:
            nextBubbleColor = Color.GREEN;
            break;
        case 2:
            nextBubbleColor = Color.ORANGE;
            break;
        default:
            nextBubbleColor = Color.BLACK; // Default or unknown color
    }

    g.setColor(nextBubbleColor);
    g.fillOval(shooterX, nextBubbleY, bubbleDiameter, bubbleDiameter);

    // Optionally, draw a border around the next bubble
    g.setColor(Color.BLACK);
    g.drawOval(shooterX, nextBubbleY, bubbleDiameter, bubbleDiameter);
    
}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Burbujas[] row : bubbles) {
            for (Burbujas bubble : row) {
            if (bubble != null) {
                bubble.move();
                bubble.draw(g);
            }
        }
        // Draw the shooter
      
        drawNextBubble(g);
        g.setColor(Color.WHITE); // Ensure the timer text is visible against the background
        int yOffset = 20;
        int textY = getHeight() - yOffset;
        g.drawString(displayTime, 380, textY);
       
       
       
      
        

     
    }
}
}