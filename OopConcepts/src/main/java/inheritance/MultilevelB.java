package inheritance;

public class MultilevelB extends MultilevelA {
	public void mul() {
		System.out.println("Child classB and Parent class of C");
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("product="+c);
	}
	public void div() {
		int a=100;
		int b=50;
		int c=a/b;
		System.out.println("div="+c);
	}


}
