package exceptionhandling;

public class ThrowsExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		des1();
		System.out.println("Main Method");
	}

public static void des1()throws Exception{
	try {
		int aa=des2();
	}catch(Exception e) {
		System.out.println(e);
	}
		System.out.println("inside des1 method");
	}
	public static int des2()throws Exception{
		int a=5;
		int b=0;
		int c;
		c=a/b;
		System.out.println("valu of c is:"+c);
		return c;
	}
	}


