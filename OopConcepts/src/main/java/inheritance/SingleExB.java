package inheritance;

public class SingleExB extends SingleExA{
	public void display() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleExB obj=new SingleExB();
		obj.print();
		obj.display();
	}

}
