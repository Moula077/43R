package operators;

public class Arithmeticoperators {

	public static void main(String[] args) {
		
		int a=15;
		int b=4;
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int g=a%b;
		
		
		System.out.println("Arithmetic operations");
		System.out.println("a+b=" + c);
		System.out.println("a-b=" + d);
		System.out.println("a*b=" + e);
		System.out.println("a/b=" + f);
		System.out.println("a%b=" + g);
		
		System.out.println("Relational operations");
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<=b);
		System.out.println(a>=b);
	}
}
