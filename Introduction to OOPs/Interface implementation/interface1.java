interface Drawable {
    void draw();
}

interface Movable {
    void moveTo(int x, int y);
}

class Circle implements Drawable, Movable {
    double radius;

    Circle(double _radius) {
        _radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn");
    }

    @Override
    public void moveTo(int x, int y) {
        System.out.println("Circle has been moved");
    }
}

class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10.0);
        c1.draw();
        c1.moveTo(4, 5);
    }
}