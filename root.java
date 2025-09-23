import java.util.Scanner;
import java.lang.Math;

public class root {
    public static void main(String[] args) {
        int a, b, c;
        double d, root1, root2;
        double realpart, imagpart;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the coefficient a");
        a = sc.nextInt();
        System.out.println("enter the coefficient b");
        b = sc.nextInt();
        System.out.println("enter the coefficient c");
        c = sc.nextInt();

        d = b * b - 4 * a * c;

        if (d > 0) {
            System.out.println("the roots are real and different");
            root1 = ((-b) + Math.sqrt(d)) / (2 * a);
            root2 = ((-b) - Math.sqrt(d)) / (2 * a);
            System.out.println("root1=" + root1);
            System.out.println("root2=" + root2);
        } else if (d == 0) {
            System.out.println("the roots are real and equal");
            root1 = root2 = (-b) / (2.0 * a); 
            System.out.println("root1=root2=" + root1);
        } else {
            System.out.println("the roots are complex and imaginary");
            realpart = (-b) / (2.0 * a); 
            imagpart = Math.sqrt(-d) / (2 * a);
            System.out.println("real part " + realpart + " + " + imagpart + "i");
            System.out.println("real part " + realpart + " - " + imagpart + "i");
        }

        
    }
}