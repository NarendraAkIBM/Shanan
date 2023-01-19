package This_super_keywords;

public class Y extends X {//ULC
	int b=100;
	public void m1() {
		System.out.println(this.b); // call variable from same class 
		System.out.println (super.a); //call variable from different class we use super class
	}

}
