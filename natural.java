package guvi;
import java.util.Scanner;
public class natural {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers:");
			int a=sc.nextInt();		
			int	k=(a*(a+1))/2;
			System.out.println("Sum is:"+k);
		}

}
