/******************************************************************************

If we list all the natural numbers below 10 that are multiples of 3 and 5, we
get 3, 5, 6 and 9. The sum of these multiples is 23 and reverse is 32. Write a program in
your favourite programming language to find the sum of all the multiples of X and Y
below N and also print the reverse of that sum

*******************************************************************************/
import java.util.*;
public class Problem2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		System.out.println("Enter X and Y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int sum=0;
		for(int i=2;i<n;i++){
		    if(i%x==0 || i%y==0){
		        sum+=i;
		    }
		}
		System.out.println("Sum is :"+sum);
		int temp=sum;
		int s=0;
		while(temp>0){
		    int r=temp%10;
		    s=s*10+r;
		    temp=temp/10;
		}
		System.out.println("Reverse of "+sum+ "is :"+s);
		
	}
}
