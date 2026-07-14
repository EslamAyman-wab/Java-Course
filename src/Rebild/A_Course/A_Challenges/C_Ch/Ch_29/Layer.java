package Rebild.A_Course.A_Challenges.C_Ch.Ch_29;

import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable> {
    private List<T> elements = new ArrayList<>();
    public void add(T element) {
        elements.add(element);
    }
    public void remove(T element) {
        elements.remove(element);
    }
    public void renderLayer() {
        for (T element : elements) {
            element.render();
        }
        
    }
    
    
}
