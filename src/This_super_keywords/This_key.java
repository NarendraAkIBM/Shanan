package This_super_keywords;

public class This_key {// BLC
	int a=10; // global variable
	public void test () {
		int b=20;
		System.out.println(b);//20 now i want call global variable from same class
		System.out.println(a);// 10
	}

}
