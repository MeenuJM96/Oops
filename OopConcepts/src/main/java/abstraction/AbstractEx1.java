package abstraction;

public class AbstractEx1 extends AbstractEx{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEx1 obj=new AbstractEx1();
		obj.disp();
		obj.print(); 
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Abstraction"); //body of abstract method
	}

}
