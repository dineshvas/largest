package guvi;
import java.util.Scanner;
public class largest {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b)&&(a>c)){
			System.out.println("a is big:"+a);
			}
		else if((b>a)&&(b>c)){
			System.out.println("b is big:"+b);
			}
		else{
			System.out.println("c is big:"+c);
		}
	}

}
