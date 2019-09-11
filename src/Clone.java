
public class Clone implements Cloneable{

	int i=2;
	int j=3;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Clone c=new Clone();
		Clone c2=(Clone)c.clone();	
		c.i=4;
		c.j=5;
		System.out.println(c.hashCode()+"  "+c2.hashCode());
		System.out.println(c.i+" "+c.j);
		System.out.println(c2.i+" "+c2.j);
		
		Boolean b=new Boolean("aaaa");
		Boolean b1=new Boolean("no");
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b.equals(b1));
	}
}
