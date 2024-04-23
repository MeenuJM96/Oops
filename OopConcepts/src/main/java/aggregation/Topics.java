package aggregation;

public class Topics {
	String title;
	int pgno;
	Book b;		// Class name and reference variable name
	public Topics(String title, int pgno, Book b)
	{
		this.title=title;
		this.pgno=pgno;
		this.b=b;
	}
	public void display() {
		System.out.println("Name: "+b.name+" Rate: "+b.rate);
		System.out.println("Title:"+title+" Pageno: "+pgno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj=new Book("ComputerScience",200);
		Topics obj1=new Topics("OOP Concepts",34,obj);
		obj1.display();	
	}

}
