
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle implements Comparable<Rectangle>
{
    private int length, width;
    
    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    
    public int area() {
        return length * width;
    }
    
    public int compareTo(Rectangle other) {
        return this.area() - other.area();
    }
}
