package structural.flyweight;

import java.awt.*;
import java.util.HashMap;

public class RectangleFactory {

    private static final HashMap<Color, MyRectangle> rectanglesByColor = new HashMap<>();

    public static MyRectangle getRectangle(Color color) {
        MyRectangle rectangle = rectanglesByColor.get(color);

        if (rectangle == null) {
            rectangle = new MyRectangle(color);
            rectanglesByColor.put(color, rectangle);
        }

        return rectangle;
    }
}
