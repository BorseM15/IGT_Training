class Parent
{
	int site=1000;
}
class Child extends Parent
{
int site=100;
void display(int site)
{
System.out.println("Site :"+site);//10
System.out.println("Site :"+this.site);//100
System.out.println("Site :"+super.site); // 1000

}

}

class Demo2
{
public static void main(String args[])
{
Child c = new Child();
c.display(10);
}

}