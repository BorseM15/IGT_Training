package Encapsulation;

class Emp{ //encupulated class // bean class // pojo class (plane old java obj )
	private int id;
	private String name;
	
	//create getter setter ->rightclick on w/s->source->generate getter and setter
	public int getId () {
	return id;}

	public void setId(int id) {
	this.id = id;}

	public String getName () {
	return name;}

	public void setName (String name) {
	this. name = name;}

}

	public class Demo {
	public static void main (String [] args) {
	Emp e = new Emp() ;
	e.setId(2);
	e.setName ("Monali");
	System. out.println(e.getId());
	System. out.println (e.getName());
	}
}
