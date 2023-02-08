package student;

public class student2 {
	//khoi tao thuoc tinh cho cac doi tuong:
	int id;
	String name;
	public void chen(int id, String name1) {
		this.id=id;
		name=name1;
	}
	public void hienthi() {
		System.out.println(id+": "+name);
	}
	public static void main(String[] args) {
		student2 sv1=new student2();
		student2 sv2=new student2();
		sv1.chen(1, "Thien Huu"); sv2.chen(2, "Huu Thien");
		sv1.hienthi();sv2.hienthi();
	}
}
