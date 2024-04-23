package inheritance;

public class HierarchialB extends HierarchialA{
	public void disp() {
		System.out.println("This is first child class of A");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialB obj=new HierarchialB();
		obj.print();
		obj.disp();
	}

}
