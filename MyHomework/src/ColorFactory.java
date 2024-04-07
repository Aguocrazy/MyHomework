interface Color {
    void fill();
}
class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red");
    }
}
class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Blue");
    }
}
interface AbstractFactory {
    Color getColor(String color);
}
class ColorFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
