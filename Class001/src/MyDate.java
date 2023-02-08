
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int d, int m, int y) {
		day=d;
		month=m;
		year=y;
	}
	
	public void printday() {
		System.out.println("Ngay: "+ day);
	}
	public void printmonth() {
		System.out.println("Thang: "+ month);
	}
	public void printyear() {
		System.out.println("Nam: "+ year);
	}
	public void printdate() {
		System.out.println("");
		System.out.println(day +"-"+ month +"-"+ year);
	}
}
