package factory;

import java.util.ArrayList;
import java.util.List;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        List<Shape> listShape = new ArrayList<>();
        listShape.add(sf.getShape("CIRCLE"));
        listShape.add(sf.getShape("RECTANGLE"));
        listShape.add(sf.getShape("TRIANGLE"));

        listShape.forEach(Shape::draw);


    }
}
