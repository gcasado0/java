public class RectanglePlus implements Relatable {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }
    public RectanglePlus(Point p) {
        origin = p;
    }
    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea() {
        return width * height;
    }
    
    // a method required to implement
    // the Relatable interface
    public int isLargerThan(Relatable other) {
        
        if (this.getArea() < other.getArea())
            return -1;
        else if (this.getArea() > other.getArea())
            return 1;
        else
            return 0;               
    }

    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        RectanglePlus r1 = new RectanglePlus(p1, 200, 100);
        RectanglePlus r2 = new RectanglePlus(p1, 200, 110);
        System.out.println(r1.isLargerThan(r2));

        Triangle t1 = new Triangle(p1, 200, 100);
        System.out.println(r1.isLargerThan(t1));
    }
}