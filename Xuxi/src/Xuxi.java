import java.util.Random;
import java.util.Scanner;

public class Xuxi {
	public static void main(String[] args) {
	int n;
	Scanner sc= new Scanner(System.in);
	laitudau: System.out.println(" ");
	System.out.println("\t\tCHOI XU XI");
	System.out.println("\t----------------------------------------");
	System.out.println("\t\tCHON DI");
	System.out.println("\t\t1. Keo.");
	System.out.println("\t\t2. Bua.");
	System.out.println("\t\t3. Bao.");
	System.out.println("\t----------------------------------------");
	do{
		System.out.print("\t\tLua chon cua toi: ");
		n=sc.nextInt();
		if (n>3||n<1) System.out.println("\t\tNHAP SAI! VUI LONG CHOI NGHIEM TUC!");
	} while (n>3||n<1);
	System.out.println("\t----------------------------------------");
	switch(n){
	case 1:
		System.out.println("\tOk, ban da chon KEO.");
		break;
	case 2:
		System.out.println("\tOk, ban da chon BUA.");
		break;
	case 3:
		System.out.println("\tOk, ban da chon BAO.");
		break;
	default:
		break;
}

	int t;
	Random rd=new Random();
	t=rd.nextInt(3)+1;
	switch(t){
		case 1:
			System.out.println("\tMay tinh chon KEO.");
			break;
		case 2:
			System.out.println("\tMay tinh chon BUA.");
			break;
		case 3:
			System.out.println("\tMay tinh chon BAO.");
			break;
		default:
			break;
	}
	System.out.println("\t------------------------");
	if (n==1&&t==1) {
		System.out.println("\tBan da hoa, kha' ga`!");
	}
	else if (n==1&&t==2) {
		System.out.println("\tQua ngu, ban da thua!");
	}
	else if (n==1&&t==3) {
		System.out.println("\tQua hen, ban da thang!");
	}
	if (n==2&&t==1) {
		System.out.println("\tQua hen, ban da thang!");
	}
	else if (n==2&&t==2) {
		System.out.println("\tBan da hoa, kha' ga`!");
	}
	else if (n==2&&t==3) {
		System.out.println("\tQua ngu, ban da thua!");
	}
	if (n==3&&t==1) {
		System.out.println("\tQua ngu, ban da thua!");
	}
	else if (n==3&&t==2) {
		System.out.println("\tQua hen, ban da thang!");
	}
	else if (n==3&&t==3) {
		System.out.println("\tBan da hoa, kha' ga`!");
	}
	System.out.println(" ");
	System.out.println("\t----------------------------------------");
	System.out.println("\t\tCHON LAI KO?");
	System.out.println("\t\t1. Ok, choi lai!");
	System.out.println("\t\t2. Dep cha di!");
	System.out.println("\t----------------------------------------");
	int choilai;
	do{
		System.out.print("\t\tLua chon cua toi: ");
		choilai=sc.nextInt();
		if (choilai>2||choilai<1) System.out.println("\t\tNHAP 1 HOAC 2 THOIIII");
	} while (choilai>2||choilai<1);
	switch(choilai){
	case 1:
		System.out.println("\tOk choi lai!");
//		continue laitudau;
		break;
	case 2:
		System.out.println("\tOk out!");
		System.exit(0);
		break;
	default:
		break;
}
}
}
