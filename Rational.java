
/**
 * Write a description of class Rational here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rational implements Comparable<Rational>
{
    private int a, b;
    
    public Rational(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public double decimal() {
        return ((double) a)/b;
    }
    
    public String toString() {
        System.out.println("Code in Rational");
        return a + "/" + b;
    }
    
    public int getN() {
        return a;
    }
    
    public int getD() {
        return b;
    }
    
    public boolean equals(Object other) {
        Rational r = (Rational) other;
        return this.getN() == r.getN() && this.getD() == r.getD();
    }
    
    public int compareTo(Rational other) {
        if(this.decimal() > other.decimal()) {
            return +1;
        }
        else if(this.decimal() < other.decimal()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
