import java.util.Scanner;
import java.text.DecimalFormat;

public class Pheptoancoban {
	public static void main(String[] args) {
		int a, b;
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Nhap vao a: ");
			a=sc.nextInt();
			System.out.print("Nhap vao b: ");
			b=sc.nextInt();
		}
		System.out.println("-----------");
		int tong = a + b;
		int hieu = a - b;
		int tich = a*b;
		float thuong = (float)a/(float)b;
		int chialaydu =a%b;
		
		DecimalFormat df= new DecimalFormat("0.000");
		
		System.out.println("Ket qua a + b = " + tong);
		System.out.println("Ket qua a - b = " + hieu);
		System.out.println("Ket qua a nhan b = " + tich);
		System.out.println("Ket qua a chia b = " + df.format(thuong) + "  (Da lam tron den so thap phan thu ba)");
		System.out.println("Ket qua phan du a chia b = " + chialaydu);
	}
}
