public class Triangle implements Relatable {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public Triangle() {
        origin = new Point(0, 0);
    }
    public Triangle(Point p) {
        origin = p;
    }
    public Triangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Triangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }
    @Override
    public int getArea() {
        return (width * height)/2;        
    }
    @Override
    public int isLargerThan(Relatable other) {
        if (this.getArea() < other.getArea())
            return -1;
        else if (this.getArea() > other.getArea())
            return 1;
        else
            return 0;             
    }
}