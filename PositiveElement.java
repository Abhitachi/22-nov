package geek_assignment_26;
import java.util.Scanner;
public class PositiveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of an array:");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("the positive elements of an array are:");
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
