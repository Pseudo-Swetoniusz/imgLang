package image;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {

    public int compare(Shape s1, Shape s2) {
        if(s1.getPriority() == s2.getPriority()) {
            return 0;
        }
        else if(s1.getPriority() < s2.getPriority()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
