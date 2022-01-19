package image;

import java.util.Collection;
import java.util.Comparator;

public class LayerComparator implements Comparator<Layer> {

    public int compare(Layer l1, Layer l2) {
        if(l1.getPriority() == l2.getPriority()) {
            return 0;
        }
        else if(l1.getPriority() < l2.getPriority()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
