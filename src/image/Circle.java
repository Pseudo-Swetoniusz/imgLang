package image;

import java.awt.*;

public class Circle implements Shape{
    private int radius;
    private Position center;
    private int priority;
    private RGB rgb;
    private double opacity;

    public Circle(int radius, Position center, int priority, RGB rgb, double opacity) {
        this.radius = radius;
        this.center = center;
        this.priority = priority;
        this.rgb = rgb;
        this.opacity = opacity;
    }

    public Circle(int radius, Position center, int priority) {
        this(radius,center, priority, new RGB(255,255,255),1);
    }

    public int getPriority() {
        return this.priority;
    }

    public void drawShape(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        int alpha = (int) (this.opacity*255);
        Color c = new Color(this.rgb.getR(),this.rgb.getG(), this.rgb.getB(), alpha);
        g.setColor(c);
        int x = this.center.getX() - this.radius;
        int y = this.center.getY() - this.radius;
        g.fillOval(x, y, this.radius*2, this.radius*2);
    }
}
