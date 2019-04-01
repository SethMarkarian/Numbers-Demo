
public class Mixed extends Rational
{
    public Mixed(int n, int d) {
        super(n, d);
    }
    
    public Mixed(int whole, int n, int d) {
        this(whole * d + n, d);
    }
    
    public String toString() {
        System.out.println("Code in Mixed");
        return wholePart() + " " + (this.getN() % this.getD()) + "/" + this.getD();
    }
    
    public int wholePart() {
        return this.getN() / this.getD();
    }
}
