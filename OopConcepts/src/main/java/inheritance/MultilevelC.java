package inheritance;

public class MultilevelC extends MultilevelB {
	public void disp() {
		System.out.println("Child classC");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MultilevelC obj=new  MultilevelC();
		 obj.add();
		 obj.sub();
		 obj.mul();
		 obj.div();
		 obj.disp();

	}

}
