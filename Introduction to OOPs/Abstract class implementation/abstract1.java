abstract class Shape {
    String objectName;

    Shape(String _objectName) {
        objectName = _objectName;
    }

    abstract double area();

    abstract void draw();
}

class Circle extends Shape {
    double radius;

    Circle(double _radius, String _shape) {
        super(_shape);
        radius = _radius;
    }

    @Override
    void draw() {
        System.out.println("Circle has been drawn");
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double _length, double _breadth, String _shape) {
        super(_shape);
        length = _length;
        breadth = _breadth;
    }

    @Override
    void draw() {
        System.out.println("Rectangle has been drawn");
    }

    @Override
    double area() {
        return length * breadth;
    }
}

class Main {
    public static void main(String[] args) {
        Shape c1 = new Circle(10, "Circle Object");
        c1.draw();
        System.out.println(c1.area());

        Shape r1 = new Rectangle(10, 10, "Rectangle Object");
        r1.draw();
        System.out.println(r1.area());
    }
}