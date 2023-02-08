import java.util.Scanner;

public class He10sanghe2 {
	public static void main(String[] args) {
		int n = 0;
		System.out.print("Nhap so muon chuyen tu he 10 sang he 2: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		String nhiphan="";
		while(n>0) {
			nhiphan=(n%2)+nhiphan;
			n/=2;
		}
		System.out.println("So nhi phan sau khi chuyen doi: "+nhiphan);
	}
}
