import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        QuadraticEquation demo = new QuadraticEquation();
        demo.setA(a);
        demo.setB(b);
        demo.setC(c);
        if (0 < demo.getDiscriminant()) {
            System.out.println("The equation has two roots " + demo.getRoot1(demo.getDiscriminant()) + " and " + demo.getRoot2(demo.getDiscriminant()));
        } else if (demo.getDiscriminant() == 0) {
            System.out.println("The equation has one roots " + demo.getRoot1(demo.getDiscriminant()));
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
