package encapsulation;

public class EncapsulationEx {
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	public void getName() {
		System.out.println("Name:"+name);
	}
}
