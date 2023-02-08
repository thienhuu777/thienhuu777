import java.util.Scanner;

public class Try_catch {
public static void main(String[] args) {
	int n=0;
	System.out.println("\t\tHom nay chung ta hoc bai TRY-CATCH-FINALLY.");
	System.out.print("Xin moi nhap mot so nguyen n: ");
	try (Scanner sc = new Scanner(System.in)) {
		n = sc.nextInt();
	}
	catch (Exception e) {
		System.out.println("Nhap du lieu sai!");
	}
	finally {
		System.out.println("Finally!");
	}
	System.out.println("So nguyen vua nhap la: " + n);
	System.out.println("Chuong trinh ket thuc!");
}
}
