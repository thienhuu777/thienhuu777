import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	double mang1[];
	double tong=0;
	System.out.print("Nhap so phan tu thu cua mang 1: ");
	int n=sc.nextInt();
	mang1 = new double[n];
	System.out.println("Nhap phan tu cho mang 1:");
	for (int i=0; i<mang1.length; i++) {
		System.out.print("Nhap phan tu thu "+(i+1)+" cua mang 1: ");
		mang1[i]= sc.nextDouble();
		tong+=mang1[i];
	}
	System.out.println("");
	System.out.println("Tong cua mang 1 vua nhap: "+tong);
	System.out.println("\n\n");
	double mang2[]=new double[] {1,2,3,4,5};
	for (int j=0; j<mang2.length; j++) {
		System.out.println("Phan tu thu "+(j+1)+" cua mang 2 la: "+mang2[j]);
	}
}
	
}
