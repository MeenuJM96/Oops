package polymorphism;

public class RuntimeEx1 extends RuntimeEx {
	public void print() {
		super.print();
		System.out.println("This is Method Overriding");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuntimeEx1 obj=new RuntimeEx1();
		obj.print();
	}

}
