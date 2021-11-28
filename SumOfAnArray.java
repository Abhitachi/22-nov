package geek_assignment_26;
import java.util.Scanner;
 class SumOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		
		//
		System.out.print(sum);
	}

}
