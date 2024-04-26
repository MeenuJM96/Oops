package polymorphism;

public class CompiletimeEx1 {
	
	public void disp(String a) {
		System.out.println(a);
	}
	public void disp() {
		System.out.println("This is Method Overloading");
	}
	public int disp(int a,int b) {
		return a+b;
}
	public void disp(int a) {
		System.out.println(a);
	}
	public char disp(char a) {
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompiletimeEx1 obj=new CompiletimeEx1();
		obj.disp();
		obj.disp("Compile time polymorphism");
		int x=obj.disp(5,10);
		System.out.println(x);
		obj.disp(100);
		char y=obj.disp('M');
		System.out.println(y);
	}

}
