package structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/*
    Flyweight
    - When you need a large number of similar objects
    - Save memory
    - Should be faster (was not, but what the heck..)
    - Something about 'Intrinsic state vs. Extrinsic state'

    (Pssst. it's just a Key-Value -store of some description)
 */

public class Runner extends JFrame {

    JButton startDrawing;

    int windowWidth = 2000;
    int windowHeight = 1400;

    Color[] shapeColor = {
            Color.black, Color.blue, Color.cyan, Color.gray, Color.magenta,
            Color.orange, Color.pink,Color.red, Color.yellow
    };

    private Color getRandColor() {
        Random randomGen = new Random();

        return shapeColor[randomGen.nextInt(9)];
    }

    private int getRandX() {
        return (int) (Math.random() * this.windowWidth);
    }

    private int getRandY() {
        return (int) (Math.random() * this.windowHeight);
    }

    public static void main(String[] args) {
        new Runner();
    }

    public Runner() {
        this.setSize(this. windowWidth, this.windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Draw stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(e -> {
            Graphics g = drawingPanel.getGraphics();

            long startTime = System.currentTimeMillis();

            for (int i = 1; i < 100000; i++) {
                MyRectangle rect = RectangleFactory.getRectangle(getRandColor());
                rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
            }

            long endTime = System.currentTimeMillis();

            System.out.println("That took " + (endTime - startTime) + " milliseconds");
        });

        this.add(contentPane);
        this.setVisible(true);
    }
}
