public class QuadraticEquation {
    private double a, b, c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getC() {
        return this.c;
    }

    public double getB() {
        return this.b;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * (this.a * this.c);
    }

    public double getRoot1(double delta) {
        if (0 <= delta) {
            return (-(this.b) + Math.pow(delta, 0.5)) / (2 * this.a);
        } else {
            return 0;
        }
    }

    public double getRoot2(double delta) {
        if (0 <= delta) {
            return (-(this.b) - Math.pow(delta, 0.5)) / (2 * this.a);
        } else {
            return 0;
        }
    }
}
