package Parcial_II.Diferido.BurbujasPaquete;

public class Grid {
  Burbujas[][] positions; // 2D array representing the grid

  public Grid(int rows, int cols) {
      positions = new Burbujas[rows][cols];
  }

  // Method to add a ball to the grid, snapping it to the nearest position
  public void addBall(Burbujas ball) {
      // Calculate the nearest grid position for the ball
      int gridX = ball.x / 40 ;// Assuming BALL_SIZE is the diameter of the balls
      int gridY = ball.y /    40;
      
      // Place the ball in the grid
      positions[gridY][gridX] = ball;
  }
}