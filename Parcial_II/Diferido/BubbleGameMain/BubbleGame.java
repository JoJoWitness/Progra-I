package Parcial_II.Diferido.BubbleGameMain;

import javax.swing.JFrame;

import Parcial_II.Diferido.GameControler.BubblesController;

public class BubbleGame extends JFrame{

      
     //* Jordano Pernia 29 907 856 *//

    public static void main(String[] args) {
      JFrame mainWindow = new JFrame("Jordano Pernia");
      mainWindow.setTitle("Bubble Game");
      mainWindow.setSize(500, 600);
      mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainWindow.setVisible(true);
      
  


      BubblesController bubblesController = new BubblesController();
      mainWindow.add(bubblesController);
    
    }
}
