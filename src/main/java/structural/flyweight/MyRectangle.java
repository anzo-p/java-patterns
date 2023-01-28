package structural.flyweight;

import java.awt.*;

public class MyRectangle {

    private Color color;

    public MyRectangle(Color color) {
        this.color = color;
    }

    public void draw(Graphics g, int upperLeft, int upperRight, int lowerLeft, int lowerRight) {
        g.setColor(this.color);
        g.fillRect(upperLeft, upperRight, lowerLeft, lowerRight);

    }
}
