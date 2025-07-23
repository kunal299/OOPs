abstract class Shape {
    String objectName;

    Shape(String _objectName) {
        objectName = _objectName;
    }

    abstract double area();

    abstract double perimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double _radius, String _shape) {
        super(_shape);
        radius = _radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }

    @Override
    double perimeter() {
        return 2.0 * 3.14 * radius;
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
    double area() {
        return length * breadth;
    }

    @Override
    double perimeter() {
        return 2 * (length + breadth);
    }
}

class Main {
    public static void main(String[] args) {
        Shape c1 = new Circle(10, "Circle Object");
        System.out.println(c1.area());
        System.out.println(c1.perimeter());

        Shape r1 = new Rectangle(10, 10, "Rectangle Object");
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}