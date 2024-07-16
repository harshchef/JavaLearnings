package AbstractFactory;

// Concrete Factory: Shape Factory (creates shapes)
class ShapeFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Circle(); // Creating a Circle shape
    }

    @Override
    public Color createColor() {
        return new Red(); // Creating a Red color
    }
}

// Concrete Factory: Color Factory (creates colors)
class ColorFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Square(); // Creating a Square shape
    }

    @Override
    public Color createColor() {
        return new Blue(); // Creating a Blue color
    }
}
