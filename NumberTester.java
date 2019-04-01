
public class NumberTester
{
    public static Comparable max(Comparable a, Comparable b) {
        if(a.compareTo(b) > 0) {
            return a;
        }
        else {
            return b;
        }
    }
    
    public static Rational multiply(Rational a, Rational b) {
        return new Mixed(a.getN() * b.getN(), a.getD() * b.getD());
    }
    
    public static Mixed multiply(Mixed a, Mixed b) {
        return new Mixed(a.getN() * b.getN(), a.getD() * b.getD());
    }
    
    public int totalArea(Rectangle a, Rectangle b) {
        return a.area() + b.area();
    }
}
