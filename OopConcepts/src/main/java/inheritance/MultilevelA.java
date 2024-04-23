package inheritance;

public class MultilevelA {
	public void add() {
		System.out.println("Multilevel inheritance");
		System.out.println("Parent classA");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("add="+c);	
	}
	public void sub() {
		int a=50;
		int b=25;
		int c=a-b;
		System.out.println("sub="+c);
	}

}
