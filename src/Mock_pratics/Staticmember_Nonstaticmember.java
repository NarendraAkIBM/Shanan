package Mock_pratics;

public class Staticmember_Nonstaticmember {//
	static int i =20;// static m
          int j =50; // nonstatic m
	
	public static void main(String[] args) {
		System.out.println(i);
		Staticmember_Nonstaticmember t=new Staticmember_Nonstaticmember();
		System.out.println(t.j);
		m1();
		t.m2();
		
		
	}
public static void m1() {//
	System.out.println("boss i am from static member");
	System.out.println("i love my country");
	
}
 public void m2( ) {//
	 System.out.println("yes i am from non static member");
 }

}
