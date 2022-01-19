import image.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImageListener extends ImgLangBaseListener{
    private Image image;
    private String imageName;
    private Layer currentLayer = null;
    private boolean inLayer = false;
    private boolean inBackground = false;
    private String width = null;
    private String height = null;
    private String positionX = null;
    private String positionY = null;
    private String opacity = null;
    private String r = null;
    private String g = null;
    private String b = null;
    private String priority = null;
    private String shapeWidth = null;
    private String shapeHeight = null;
    private String shapeR = null;
    private String shapeG = null;
    private String shapeB = null;
    private String shapeOpacity = null;
    private String shapePriority = null;
    private String shapePositionX = null;
    private String shapePositionY = null;
    private ArrayList<Position> shapeVertexes = new ArrayList<>();
    private boolean transformationsR = false;
    private boolean transformationsS = false;
    private int rotate;
    private double scale;
    private boolean opacityB = false;
    private boolean rgbB = false;
    private boolean opacityS = false;
    private boolean rgbS = false;

    public void enterImgBlock(ImgLangParser.ImgBlockContext ctx) {
        //System.out.println("In image_block");
        this.imageName = ctx.ID().toString();
        System.out.println("Creating new image: " + this.imageName);
    }

    public void exitImgBlock(ImgLangParser.ImgBlockContext ctx) {
        this.image.placeLayers();
        if(this.transformationsR) {
            //System.out.println(this.rotate);
            this.image.rotateImage(this.rotate);
        }
        if(this.transformationsS) {
            this.image.scaleImage(this.scale);
        }
        try {
            this.image.savePNG();
            System.out.println("New image created: " + this.imageName + ".png");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Couldn't create new image - IOException");
        }
        //System.out.println("Out of image_block");
    }

    public void enterBack_block(ImgLangParser.Back_blockContext ctx) {
        this.inBackground = true;
        //System.out.println("in back_block");
    }

    public void exitBack_block(ImgLangParser.Back_blockContext ctx) {
        //System.out.println("out of back_block");
        int w = Integer.parseInt(this.width);
        int h = Integer.parseInt(this.height);
        if(this.opacityB == false && this.rgbB == false) {
            this.image = new Image(this.imageName,w,h);
            this.inBackground = false;
        }
        else if(this.opacityB == true && this.rgbB == true) {
            double o = Double.parseDouble(this.opacity);
            RGB rgb = new RGB(Integer.parseInt(this.r), Integer.parseInt(this.g),Integer.parseInt(this.b));
            this.image = new Image(this.imageName,w,h,o,rgb);
            this.inBackground = false;
        }
        else if(this.opacityB == true && this.rgbB == false) {
            double o = Double.parseDouble(this.opacity);
            this.image = new Image(this.imageName,w,h,o);
            this.inBackground = false;
        }
        else if(this.opacityB == false && this.rgbB == true) {
            RGB rgb = new RGB(Integer.parseInt(this.r), Integer.parseInt(this.g),Integer.parseInt(this.b));
            this.image = new Image(this.imageName,w,h,rgb);
            this.inBackground = false;
        }
    }

    public void enterBack_param(ImgLangParser.Back_paramContext ctx) {
        //System.out.println("in back_param");
        this.width = ctx.width_sub().NUMBER().toString();
        this.height = ctx.height_sub().NUMBER().toString();
        TerminalNode opac = ctx.opacity_sub().DOUBLE();
        if(opac != null) {
            this.opacity = ctx.opacity_sub().DOUBLE().toString();
            this.opacityB = true;
        }
        TerminalNode rNode = ctx.color_sub().rgb_val().NUMBER(0);
        TerminalNode gNode = ctx.color_sub().rgb_val().NUMBER(1);
        TerminalNode bNode = ctx.color_sub().rgb_val().NUMBER(2);
        if(rNode != null && gNode != null && bNode != null) {
            this.r = ctx.color_sub().rgb_val().NUMBER(0).toString();
            this.g = ctx.color_sub().rgb_val().NUMBER(1).toString();
            this.b = ctx.color_sub().rgb_val().NUMBER(2).toString();
            this.rgbB = true;
        }
    }

    public void exitBack_param(ImgLangParser.Back_paramContext ctx) {
        //System.out.println("out of bac_param");
    }

    public void enterLayer_block(ImgLangParser.Layer_blockContext ctx) {
        this.inLayer = true;
        //System.out.println("in layer_block");
    }

    public void exitLayer_block(ImgLangParser.Layer_blockContext ctx) {
        //System.out.println("out of layer_block");
        this.currentLayer.drawShapes();
        this.inLayer = false;
    }

    public void enterLayer_param(ImgLangParser.Layer_paramContext ctx) {
        //System.out.println("in layer_param");
        this.width = ctx.width_sub().NUMBER().toString();
        this.height = ctx.height_sub().NUMBER().toString();
        this.priority = ctx.priority_sub().NUMBER().toString();
        this.positionX = ctx.position_sub().position_val().NUMBER(0).toString();
        this.positionY = ctx.position_sub().position_val().NUMBER(1).toString();
    }

    public void exitLayer_param(ImgLangParser.Layer_paramContext ctx) {
        int w = Integer.parseInt(this.width);
        int h = Integer.parseInt(this.height);
        int p = Integer.parseInt(this.priority);
        Position pos = new Position(Integer.parseInt(this.positionX),Integer.parseInt(this.positionY));
        Layer l = new Layer(w,h,pos,p);
        this.image.appendLayer(l);
        this.currentLayer = l;
        //System.out.println("out of layer_param");
    }

    public void enterRect_block(ImgLangParser.Rect_blockContext ctx) {
        //System.out.println("in rect_block");
    }

    public void exitRect_block(ImgLangParser.Rect_blockContext ctx) {
        //System.out.println("out of rect_block");
    }

    public void enterRect_param(ImgLangParser.Rect_paramContext ctx) {
        //System.out.println("in rect_param");
        this.shapeWidth = ctx.width_sub().NUMBER().toString();
        this.shapeHeight = ctx.height_sub().NUMBER().toString();
        TerminalNode rNode = ctx.color_sub().rgb_val().NUMBER(0);
        TerminalNode gNode = ctx.color_sub().rgb_val().NUMBER(1);
        TerminalNode bNode = ctx.color_sub().rgb_val().NUMBER(2);
        if(rNode != null && gNode != null && bNode != null) {
            this.shapeR = ctx.color_sub().rgb_val().NUMBER(0).toString();
            this.shapeG = ctx.color_sub().rgb_val().NUMBER(1).toString();
            this.shapeB = ctx.color_sub().rgb_val().NUMBER(2).toString();
            this.rgbS = true;
        }
        TerminalNode oNode = ctx.opacity_sub().DOUBLE();
        this.shapePriority = ctx.priority_sub().NUMBER().toString();
        this.shapePositionX = ctx.position_sub().position_val().NUMBER(0).toString();
        this.shapePositionY = ctx.position_sub().position_val().NUMBER(1).toString();
        if(oNode != null) {
            this.shapeOpacity = ctx.opacity_sub().DOUBLE().toString();
            this.opacityS = true;
        }
    }

    public void exitRect_param(ImgLangParser.Rect_paramContext ctx) {
        //System.out.println("out of rect_param");
        int w = Integer.parseInt(this.shapeWidth);
        int h = Integer.parseInt(this.shapeHeight);
        int x = Integer.parseInt(this.shapePositionX);
        int y = Integer.parseInt(this.shapePositionY);
        Position pos = new Position(x,y);
        int p = Integer.parseInt(this.shapePriority);
        if(this.opacityS == false && this.rgbS == false) {
            Rectangle r = new Rectangle(w,h,pos,p);
            this.currentLayer.appendShape(r);
        }
        else if(this.opacityS == true && this.rgbS == true){
            RGB rgb = new RGB(Integer.parseInt(this.shapeR), Integer.parseInt(this.shapeG), Integer.parseInt(this.shapeB));
            double o = Double.parseDouble(this.shapeOpacity);
            Rectangle r = new Rectangle(w,h,pos,p,rgb,o);
            this.currentLayer.appendShape(r);
            this.opacityS = false;
            this.rgbS = false;
        }
        else if(this.opacityS == true && this.rgbS == false){
            double o = Double.parseDouble(this.shapeOpacity);
            Rectangle r = new Rectangle(w,h,pos,p,o);
            this.currentLayer.appendShape(r);
            this.opacityS = false;
        }
        else if (this.opacityS == false && this.rgbS == true){
            RGB rgb = new RGB(Integer.parseInt(this.shapeR), Integer.parseInt(this.shapeG), Integer.parseInt(this.shapeB));
            Rectangle r = new Rectangle(w,h,pos,p,rgb);
            this.currentLayer.appendShape(r);
            this.rgbS = false;
        }
    }

    public void enterCirc_block(ImgLangParser.Circ_blockContext ctx) {
        //System.out.println("in circ_block");
    }

    public void exitCirc_block(ImgLangParser.Circ_blockContext ctx) {
        //System.out.println("out of circ_block");
    }

    public void enterCirc_param(ImgLangParser.Circ_paramContext ctx) {
        //System.out.println("in circ_param");
        this.shapeWidth = ctx.radius_sub().NUMBER().toString();
        this.shapePositionX = ctx.position_sub().position_val().NUMBER(0).toString();
        this.shapePositionY = ctx.position_sub().position_val().NUMBER(1).toString();
        TerminalNode oNode = ctx.opacity_sub().DOUBLE();
        if(oNode != null) {
            this.shapeOpacity = ctx.opacity_sub().DOUBLE().toString();
            this.opacityS = true;
        }
        TerminalNode rNode = ctx.color_sub().rgb_val().NUMBER(0);
        TerminalNode gNode = ctx.color_sub().rgb_val().NUMBER(1);
        TerminalNode bNode = ctx.color_sub().rgb_val().NUMBER(2);
        if(rNode != null && gNode != null && bNode != null) {
            this.shapeR = ctx.color_sub().rgb_val().NUMBER(0).toString();
            this.shapeG = ctx.color_sub().rgb_val().NUMBER(1).toString();
            this.shapeB = ctx.color_sub().rgb_val().NUMBER(2).toString();
            this.rgbS = true;
        }
        this.shapePriority = ctx.priority_sub().NUMBER().toString();
    }

    public void exitCirc_param(ImgLangParser.Circ_paramContext ctx) {
        //System.out.println("out of circ_param");
        int r = Integer.parseInt(this.shapeWidth);
        int x = Integer.parseInt(this.shapePositionX);
        int y = Integer.parseInt(this.shapePositionY);
        Position center = new Position(x,y);
        int p = Integer.parseInt(this.shapePriority);
        if(this.opacityS == false && this.rgbS == false) {
            Circle c = new Circle(r,center,p);
            this.currentLayer.appendShape(c);
        }
        else if(this.opacityS == true && this.rgbS == true){
            RGB rgb = new RGB(Integer.parseInt(this.shapeR), Integer.parseInt(this.shapeG), Integer.parseInt(this.shapeB));
            double o = Double.parseDouble(this.shapeOpacity);
            Circle c = new Circle(r,center,p,rgb,o);
            this.currentLayer.appendShape(c);
            this.opacityS = false;
            this.rgbS = false;
        }
        else if(this.opacityS == true && this.rgbS == false) {
            double o = Double.parseDouble(this.shapeOpacity);
            Circle c = new Circle(r,center,p,o);
            this.currentLayer.appendShape(c);
            this.opacityS = false;
        }
        else if(this.opacityS == false && this.rgbS == true) {
            RGB rgb = new RGB(Integer.parseInt(this.shapeR), Integer.parseInt(this.shapeG), Integer.parseInt(this.shapeB));
            Circle c = new Circle(r,center,p,rgb);
            this.currentLayer.appendShape(c);
            this.rgbS = false;
        }
    }

    public void enterPoly_block(ImgLangParser.Poly_blockContext ctx) {
        //System.out.println("in poly_block");
    }

    public void exitPoly_block(ImgLangParser.Poly_blockContext ctx) {
        shapeVertexes.clear();
        //System.out.println("out of poly_block");
    }

    public void enterPoly_param(ImgLangParser.Poly_paramContext ctx) {
        //System.out.println("in poly_param");
        List<ImgLangParser.Position_valContext> positions = ctx.vertex_sub().vertex_list().position_val();
        for(ImgLangParser.Position_valContext pos: positions) {
            int x = Integer.parseInt(pos.NUMBER(0).toString());
            int y = Integer.parseInt(pos.NUMBER(1).toString());
            Position p = new Position(x,y);
            shapeVertexes.add(p);
        }
        this.shapePositionX = ctx.position_sub().position_val().NUMBER(0).toString();
        this.shapePositionY = ctx.position_sub().position_val().NUMBER(1).toString();
        TerminalNode oNode = ctx.opacity_sub().DOUBLE();
        if(oNode != null) {
            this.shapeOpacity = ctx.opacity_sub().DOUBLE().toString();
            this.opacityS = true;
        }
        TerminalNode rNode = ctx.color_sub().rgb_val().NUMBER(0);
        TerminalNode gNode = ctx.color_sub().rgb_val().NUMBER(1);
        TerminalNode bNode = ctx.color_sub().rgb_val().NUMBER(2);
        if(rNode != null && gNode != null && bNode != null) {
            this.shapeR = ctx.color_sub().rgb_val().NUMBER(0).toString();
            this.shapeG = ctx.color_sub().rgb_val().NUMBER(1).toString();
            this.shapeB = ctx.color_sub().rgb_val().NUMBER(2).toString();
            this.rgbS = true;
        }
        this.shapePriority = ctx.priority_sub().NUMBER().toString();
    }

    public void exitPoly_param(ImgLangParser.Poly_paramContext ctx) {
        //System.out.println("out of poly_param");
        ArrayList<Position> vertexes = new ArrayList<>();
        for(Position position: shapeVertexes) {
            vertexes.add(position);
        }
        int x = Integer.parseInt(this.shapePositionX);
        int y = Integer.parseInt(this.shapePositionY);
        Position pos = new Position(x,y);
        int p = Integer.parseInt(this.shapePriority);
        if(this.opacityS == false && this.rgbS == false) {
            Polygon poly = new Polygon(vertexes,pos,p);
            this.currentLayer.appendShape(poly);
        }
        else if(this.opacityS == true && this.rgbS == true){
            RGB rgb = new RGB(Integer.parseInt(this.shapeR), Integer.parseInt(this.shapeG), Integer.parseInt(this.shapeB));
            double o = Double.parseDouble(this.shapeOpacity);
            Polygon poly = new Polygon(vertexes,pos,p,rgb,o);
            this.currentLayer.appendShape(poly);
            this.opacityS = false;
            this.rgbS = false;
        }
        else if(this.opacityS == true && this.rgbS == false) {
            double o = Double.parseDouble(this.shapeOpacity);
            Polygon poly = new Polygon(vertexes,pos,p,o);
            this.currentLayer.appendShape(poly);
            this.opacityS = false;
        }
        else if(this.opacityS == false && this.rgbS == true) {
            RGB rgb = new RGB(Integer.parseInt(this.shapeR), Integer.parseInt(this.shapeG), Integer.parseInt(this.shapeB));
            Polygon poly = new Polygon(vertexes,pos,p,rgb);
            this.currentLayer.appendShape(poly);
            this.rgbS = false;
        }
    }

    public void enterTrans_block(ImgLangParser.Trans_blockContext ctx) {
        //System.out.println("in trans_block");
    }

    public void exitTrans_block(ImgLangParser.Trans_blockContext ctx) {
        //System.out.println("out of trans_block");
    }

    public void enterTrans_param(ImgLangParser.Trans_paramContext ctx) {
        TerminalNode rotateNumber = ctx.rotate_sub().NUMBER();
        TerminalNode rotateNumberWS = ctx.rotate_sub().NUMBER_WS();
        TerminalNode scale = ctx.scale_sub().DOUBLE();
        if(rotateNumber != null) {
            this.rotate = Integer.parseInt(rotateNumber.toString());
            this.transformationsR = true;
        }
        else if(rotateNumberWS != null) {
            this.rotate = Integer.parseInt(rotateNumberWS.toString());
            this.transformationsR = true;
        }
        if(scale != null) {
            this.scale = Double.parseDouble(scale.toString());
            this.transformationsS = true;
        }
    }

    public void exitTrans_param(ImgLangParser.Trans_paramContext ctx) {
    }
}
