package overriding;
class Animal{
	public void eat() {
		System.out.println("Dang an...");
	}
}
public class overriding extends Animal {
	public void eat() {
		System.out.println("Dang an banh mi...");
	}
	public static void main(String[] args) {
		overriding obj=new overriding();
		obj.eat();
	}
}
