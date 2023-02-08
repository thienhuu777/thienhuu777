
	public class nguyento {
		public static void ktra(int m) {
			boolean k=false;
			for (int i=m;i>0;i--) {
				if (m%i!=0) {
					k=true;
					break;
				}
			}
			if (k)System.out.println("So "+m+" la so nguyen to!");
			else System.out.println("So "+ m+" khong phai la so nguyen to");
		}
}
