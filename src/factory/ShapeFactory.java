package factory;

public class ShapeFactory {
    public Shape getShape(String type) {
        Shape shape;
        switch (type){
            case "CIRCLE": return new Circle();
            case "RECTANGLE":return new Rectangle();
            case "TRIANGLE": return new Triangle();
            default: return null;
        }
    }
}
