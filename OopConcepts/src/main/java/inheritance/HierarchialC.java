package inheritance;

public class HierarchialC extends HierarchialA{
	public void display() {
		System.out.println("This is second child class of A");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialC obj=new HierarchialC();
		obj.print();
		obj.display();
	}

}
