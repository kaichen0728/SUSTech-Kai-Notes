

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RectangleTest {
    public static void main(String[] args) {
        Shape.setScreenSize(9);
        StdDraw.setScale(-Shape.getScreenSize(), Shape.getScreenSize());

        List<Shape> rectanglList = new ArrayList<>();
        for (int i = -5; i < 5; i ++) {
            rectanglList.add(new Rectangle(i,2*i,Math.abs(i), 2*Math.abs(i)));
        }
        Collections.sort(rectanglList);

        for (int i = 0; i < rectanglList.size(); i++) {
            rectanglList.get(i).customizedColor(ColorScheme.GRAY, i);
            System.out.println(rectanglList.get(i));
        }
    }
}
