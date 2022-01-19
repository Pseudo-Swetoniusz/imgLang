package image;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Layer {
    private int width;
    private int height;
    private Position position;
    private int priority;
    ArrayList<Shape> shapes = new ArrayList<>();
    BufferedImage image;
    Graphics2D graphics;


    public Layer(int width, int height, Position position, int priority) {
        this.width = width;
        this.height = height;
        this.position = position;
        this.priority = priority;
        this.image = new BufferedImage(width, height,BufferedImage.TYPE_INT_ARGB);
        this.graphics = this.image.createGraphics();
        //Color c = new Color(255,255,255);
        //this.graphics.setColor(c);
        //this.graphics.fillRect(0,0, this.width,this.height);
    }

    public int getPriority() {
        return this.priority;
    }

    public Position getPosition() {
        return this.position;
    }

    public BufferedImage returnImage() {
        return this.image;
    }

    public void sortShapes() {
        this.shapes.sort(new ShapeComparator());
    }

    public void appendShape(Shape s) {
        this.shapes.add(s);
        sortShapes();
    }

    public void drawShapes() {
        for(Shape s: shapes) {
            s.drawShape(this.graphics);
        }
    }
}
