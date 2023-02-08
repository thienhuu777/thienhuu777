import java.util.Scanner;

public class Inout {
	public static void main(String[] args) {
		//int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap ho va ten: ");
		String hovaten = sc.nextLine();
		
		System.out.print("Nhap so dien thoai: ");
		int sodienthoai = sc.nextInt();
		
		System.out.print("Nhap diem thi: ");
		float diemthi = sc.nextFloat();
		
		System.out.println("-----------");
		System.out.println("Ho va ten: "+ hovaten);
		System.out.println("So dien thoai: 0" + sodienthoai);
		System.out.println("Diem thi: " + diemthi);
	}
}
