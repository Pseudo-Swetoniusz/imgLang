package image;

import java.awt.*;
import java.util.ArrayList;

public class Polygon implements Shape{
    private ArrayList<Position> vertexes;
    private Position position;
    private int priority;
    private RGB rgb;
    private double opacity;

    public Polygon(ArrayList<Position> vertexes, Position position, int priority, RGB rgb, double opacity) {
        this.vertexes = vertexes;
        this.position = position;
        this.priority = priority;
        this.rgb = rgb;
        this.opacity = opacity;
    }

    public Polygon(ArrayList<Position> vertexes, Position position, int priority) {
        this(vertexes,position,priority,new RGB(255,255,255),1);
    }

    public Polygon(ArrayList<Position> vertexes, Position position, int priority, RGB rgb) {
        this(vertexes,position,priority,rgb,1);
    }

    public Polygon(ArrayList<Position> vertexes, Position position, int priority, double opacity) {
        this(vertexes,position,priority,new RGB(255,255,255),opacity);
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
        int n = this.vertexes.size();
        int [] xes = new int[n];
        int [] yes = new int[n];
        for(int i=0; i<n; i++) {
            int x = this.vertexes.get(i).getX();
            int y = this.vertexes.get(i).getY();
            xes[i] = x + this.position.getX();
            yes[i] = y + this.position.getY();
        }
        g.fillPolygon(xes,yes,n);
    }
}
