import java.util.Scanner;
public class AOC{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle :- ");
        double r = sc.nextDouble();
        System.out.print("Area of a circle (A) = " + (3.141592653589793238 *r *r));
    }
}