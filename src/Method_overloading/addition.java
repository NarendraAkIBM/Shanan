package Method_overloading;

public class addition {//
	public static void main(String[] args) {
	addition add =new addition();
	add.addition(10, 20);
	add.substraction(10, 20, 30);
	
	}



public void addition(int a,int b) {
	System.out.println(a+b);
}
public void substraction(int p,int q,int r) {
	System.out.println(p+q+r);
}
}