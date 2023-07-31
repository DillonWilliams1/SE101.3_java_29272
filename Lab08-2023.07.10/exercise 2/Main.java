public class Main {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

      
        circle.setRadius(7.0);
        rectangle.setLength(5.0);
        rectangle.setWidth(8.0);
        triangle.setSide1(6.0);
        triangle.setSide2(8.0);
        triangle.setSide3(10.0);

     
        double circleArea = circle.calculateArea();
        double circlePerimeter = circle.calculatePerimeter();

        double rectangleArea = rectangle.calculateArea();
        double rectanglePerimeter = rectangle.calculatePerimeter();

        double triangleArea = triangle.calculateArea();
        double trianglePerimeter = triangle.calculatePerimeter();

      
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

        System.out.println("Triangle Area: " + triangleArea);
        System.out.println("Triangle Perimeter: " + trianglePerimeter);
    }
}
