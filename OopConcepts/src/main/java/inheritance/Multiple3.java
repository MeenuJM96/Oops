package inheritance;

public class Multiple3 implements Multiple1, Multiple2 {

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Parent class A");
	}

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Parent class B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multiple3 obj=new Multiple3();
		obj.meth1();
		obj.meth2();
		System.out.println("Child class");
		
	}

}
