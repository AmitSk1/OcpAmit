package OCP.src.main.java.area_calculator;

public class Rectangle implements CalculaterArea {

    public Double length;
    public Double width;

    public Rectangle(Double width, double length) {
        this.width = width;
        this.length = length;
    }


    @Override
    public double area() {
        return this.length * this.width;
    }
}