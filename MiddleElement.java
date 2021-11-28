package geek_assignment_26;
import java.util.Scanner;
public class MiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of an array:");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int mid=(a.length)/2;
		if((a.length)%2 !=0) {
			System.out.println("Middle element in the array is:"+a[mid]);
		}
		else {
			System.out.println("Middle elements in the array is:"+a[mid-1]+" and "+a[mid]);
		}
	}

}
