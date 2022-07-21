import java.util.*;

public class Conversation {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose conversation from below :");
        System.out.println("1. Feet -> Inches, Meters, Centimeters");
        System.out.println("2. Meter -> Feets, Inches, Centimeters");
        System.out.println("3. Inches -> Meters, Feets, Centimeters");
        System.out.println("");
        System.out.print("Choose your option :- ");
        int a= sc.nextInt();
        System.out.println("");
        if(a == 1)
        {
            System.out.print("Enter Feets:- ");
            double val = sc.nextDouble();
            System.out.println("");
            double f2i = val * 12;
            double f2m = val * 0.3048; 
            double f2c = val * 30.48;
            System.out.println(val + " Foot in Inches :- " + f2i);
            System.out.println(val + " Foot in Meters :- " + f2m);
            System.out.println(val + " Foot in Centimeters :- " + f2c);
        }
        else if(a == 2)
        {
            System.out.print("Enter Meters :- ");
            double val = sc.nextDouble();
            System.out.println("");
            double m2f = val * 3.28084;
            double m2i = val * 39.3701; 
            double m2c = val * 100.000054;
            System.out.println(val + " Meter in Foot :- " + m2f);
            System.out.println(val + " Meter in Inches :- " + m2i);
            System.out.println(val + " Meter in Centimeters :- " + m2c);
        }
        else if(a == 3)
        {
            System.out.print("Enter Inches :- ");
            double val = sc.nextDouble();
            System.out.println("");
            double i2m = val * 0.0254;
            double i2f = val * 0.0833333; 
            double i2c = val * 2.54;
            System.out.println(val + " Inches in Meters :- " + i2m);
            System.out.println(val + " Inches in Foots :- " + i2f);
            System.out.println(val + " Inches in Centimeters :- " + i2c);
        }
        else
        {
            System.out.println("Please Select Proper Option.");
        }
    }
}
