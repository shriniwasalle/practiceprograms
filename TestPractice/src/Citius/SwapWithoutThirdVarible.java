package Citius;

public class SwapWithoutThirdVarible {
	
	public static void main(String[] args) {
		
		int a=2, b =3;
		
		a = a+b; // 5
		b = a-b; // b = 5-3 = 3
		a = a-b; // a = 5-3 = 2
		
		System.out.println("a:"+a +" "+"b:"+b);
	}
}
