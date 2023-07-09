package OCP.src.main.java.area_calculator;

public class AreaCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(15.0);
        Rectangle rectangle = new Rectangle(7.0, 2.0);
        System.out.println(circle.area());
        System.out.println(rectangle.area());


    }
}