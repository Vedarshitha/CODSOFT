import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int[] a=new int[n];
		System.out.println("Enter your marks: ");
		for(int i=0;i<n;i++){
		    int marks=sc.nextInt();
		    a[i]=marks;
		    sum+=marks;
		}
		for(int i=0;i<n;i++){
		    System.out.println("Subject "+(i+1)+" marks: "+a[i]);
		}
		System.out.println("Your total marks: "+sum);
		double avg=(double)sum/n;
		char grade='E';
		System.out.println("The average percentage: "+avg);
		if(avg>90){
		    grade='A';
		}
		else if(avg>80){
		    grade='B';
		}
		else if(avg>70)
		    grade='C';
		else if(avg>60)
		    grade='D';
		System.out.println("Your grade is: "+grade);
	}
}
