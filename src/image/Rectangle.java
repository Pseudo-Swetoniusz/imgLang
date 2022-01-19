package image;

import java.awt.*;

public class Rectangle implements Shape {
    private int width;
    private int height;
    private Position position;
    private int priority;
    private RGB rgb;
    private double opacity;

    public Rectangle(int width, int height, Position position, int priority, RGB rgb, double opacity) {
        this.width = width;
        this.height = height;
        this.position = position;
        this.priority = priority;
        this.rgb = rgb;
        this.opacity = opacity;
    }

    public Rectangle(int width, int height, Position position, int priority) {
        this(width,height,position,priority,new RGB(255,255,255),1);
    }

    public int getPriority() {
        return this.priority;
    }

    public void drawShape(Graphics2D g) {
        int alpha = (int) (this.opacity*255);
        Color c = new Color(this.rgb.getR(),this.rgb.getG(), this.rgb.getB(), alpha);
        g.setColor(c);
        g.fillRect(this.position.getX(), this.position.getY(), this.width, this.height);
    }
}
