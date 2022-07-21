import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number for table :- ");
        n = sc.nextInt();
        System.out.println(n + "'s table is as below");
        System.out.println(" ");
        System.out.println("===========");
        for(int i = 1;i < 11;i++)
        {
            System.out.println(n + " * " + i + " = " + n*i);
            System.out.println("===========");
        }
    }
}
