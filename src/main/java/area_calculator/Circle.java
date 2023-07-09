package OCP.src.main.java.area_calculator;

public class Circle implements CalculaterArea {

    public Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (22 / 7) * this.radius * this.radius;
    }
}