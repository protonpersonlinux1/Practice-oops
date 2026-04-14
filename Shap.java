interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}

class AreaCalc {
    public double sumAreas(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

public class Shap {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(2, 4),
            new Circle(5)
        };

        AreaCalc calculator = new AreaCalc();
        double totalArea = calculator.sumAreas(shapes);

        System.out.println("Total area: " + totalArea);
    }
}