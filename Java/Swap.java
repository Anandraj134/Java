import java.util.Scanner;

public class Swap{
	public static void main(String[] args) {
		int i,j,arr[]= {0,0,0};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers:");
        for(i=0;i<3;i++)
        {
            System.out.print("Enter " + (i+1) + " value :- ");
			arr[i]=sc.nextInt();
        }
		for(i=0;i<3-1;i++)
			for(j=0;j<3-i-1;j++)
				if(arr[j]<arr[j+1])
				{
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
				}
		
		System.out.println("Decreasing order:");
		for(i=0;i<3;i++)
			System.out.print(arr[i] + " ");	
	}
}