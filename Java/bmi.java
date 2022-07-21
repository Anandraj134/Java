import java.util.Scanner;

public class bmi {
	public static void main(String[] args) {
		double weight,height,bmi;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your weight in pound: ");
        weight= sc.nextDouble();
        weight *= 0.45359273;
		
		System.out.print("Enter your height in inches: ");
        height = sc.nextDouble();
        height *= 0.0254;
		
		bmi = weight / (height*height);
		System.out.print("Your BMI is : "+bmi);
	}
}