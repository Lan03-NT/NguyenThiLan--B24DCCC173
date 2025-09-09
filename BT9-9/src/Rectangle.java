public class Rectangle {
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Tính chu vi
    public int getPerimeter() {
        return 2 * (width + height);
    }

    // Tính diện tích
    public int getArea() {
        return width * height;
    }
}

