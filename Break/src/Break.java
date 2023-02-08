import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		int out, in = 0;
		out: for(out=0; out < 10; out ++) {
			for (in=0; in <20; in ++) {
				if (in>10) break out;
			}
			System.out.println("Ngoai: Out="+out+"; "+"In="+in+".");
		}
		System.out.println("Trong: Out="+out+"; "+"In="+in+".");
	}
}
