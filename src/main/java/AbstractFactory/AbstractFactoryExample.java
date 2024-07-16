package AbstractFactory;
// Abstract Factory: Abstract Factory interface
interface AbstractFactory {
    Shape createShape();
    Color createColor();
}

// Client code to use Abstract Factory
public class AbstractFactoryExample {
    public static void main(String[] args) {
        // Creating a shape factory
        AbstractFactory shapeFactory = new ShapeFactory();

        // Creating a circle and red color
        Shape circle = shapeFactory.createShape();
        Color red = shapeFactory.createColor();

        // Drawing circle and filling with red
        circle.draw();
        red.fill();

        // Creating a color factory
        AbstractFactory colorFactory = new ColorFactory();

        // Creating a square and blue color
        Shape square = colorFactory.createShape();
        Color blue = colorFactory.createColor();

        // Drawing square and filling with blue
        square.draw();
        blue.fill();
    }
}
