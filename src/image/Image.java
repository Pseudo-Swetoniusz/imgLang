package image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Image {
    private String imageName;
    private int width;
    private int height;
    private double opacity;
    private RGB rgb;
    private ArrayList<Layer> layers = new ArrayList<>();
    BufferedImage image;
    Graphics2D graphics;

    public Image(String imageName, int width, int height, double opacity, RGB rgb) {
        this.imageName = imageName;
        this.width = width;
        this.height = height;
        this.opacity = opacity;
        this.rgb = rgb;
        this.image = new BufferedImage(width, height,BufferedImage.TYPE_INT_ARGB);
        this.graphics = this.image.createGraphics();
        int alpha = (int) (this.opacity * 255);
        Color c = new Color(this.rgb.getR(),this.rgb.getG(), this.rgb.getB(), alpha);
        this.graphics.setBackground(c);
        this.graphics.setColor(c);
        this.graphics.fillRect(0,0,this.width, this.height);
    }

    public Image(int width, int height, double opacity, RGB rgb) {
        this("image", width, height, opacity, rgb);
    }

    public Image(String imageName,int width, int height, double opacity) {
        this(imageName, width,height,opacity,new RGB(255,255,255));
    }

    public Image(String imageName,int width, int height, RGB rgb) {
        this(imageName, width,height,1.0,rgb);
    }

    public Image(String imageName,int width, int height) {
        this(imageName, width,height,1.0,new RGB(255,255,255));
    }

    public void sortLayers() {
        this.layers.sort(new LayerComparator());
    }

    public void appendLayer(Layer l) {
        this.layers.add(l);
        sortLayers();
    }

    public void placeLayers() {
        for(Layer l: layers) {
            BufferedImage layerImage = l.returnImage();
            Position layerPosition = l.getPosition();
            //System.out.println(l.getPriority());
            this.graphics.drawImage(layerImage, layerPosition.getX(), layerPosition.getY(), null);
        }
    }

    public void savePNG() throws IOException {
        ImageIO.write(this.image, "PNG", new File(this.imageName + ".PNG"));
    }

    public void scaleImage(double scale) {
        //this.graphics.scale(scale, scale);
        int w = (int) (this.width * scale);
        int h = (int) (this.height *scale);
        int alpha = (int) (this.opacity * 255);
        Color c = new Color(this.rgb.getR(),this.rgb.getG(), this.rgb.getB(), alpha);
        BufferedImage newImage = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = newImage.createGraphics();
        //g.setColor(c);
        //g.fillRect(0,0,w,h);
        java.awt.Image tmp = this.image.getScaledInstance(w,h,BufferedImage.SCALE_SMOOTH);
        g.drawImage(tmp,0,0,null);
        this.image = newImage;
    }

    public void rotateImage(double rotate) {
        //System.out.println("in rotate");
        double angle = Math.toRadians(rotate);
        double sin = Math.abs(Math.sin(angle));
        double cos = Math.abs(Math.cos(angle));
        int w = (int) Math.floor(this.width * cos + this.height * sin);
        int h = (int) Math.floor(this.height * cos + this.width * sin);
        BufferedImage rotated = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = rotated.createGraphics();
        AffineTransform at = new AffineTransform();
        at.translate((w - this.width) / 2, (h - this.height) / 2);
        int x = this.width / 2;
        int y = this.height / 2;

        at.rotate(angle, x, y);
        g.setTransform(at);
        g.drawImage(this.image, 0, 0, null);
        this.image = rotated;
        this.width = w;
        this.height = h;
    }

}
