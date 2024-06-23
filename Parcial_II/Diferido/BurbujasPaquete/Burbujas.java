package Parcial_II.Diferido.BurbujasPaquete;

import java.awt.Color;
import java.awt.Graphics;

public class Burbujas {
  public int x, y, size, dx, dy;
  int speed =5;
  private Color color;
  private static final Color[] colors = {Color.BLUE, Color.GREEN, Color.ORANGE};

  public Burbujas(int x, int y, int size, int colorIndex) {
      this.x = x;
      this.y = y;
      this.size = size;
      this.color = colors[colorIndex];
      this.dx = 0;
      this.dy = -5; // Move upwards
  }

  public void move() {
      x += dx * speed;
      y += dy * speed;
  }

  public void draw(Graphics g) {
      g.setColor(color);
      g.fillOval(x, y, size, size);
  }
}
