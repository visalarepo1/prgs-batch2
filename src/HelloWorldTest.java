
public class HelloWorldTest {

	public static void main(String[] args) {
		System.out.println("main-start");
		
System.out.println("Hello World");

System.out.println(number());
addition();
System.out.println(multiplication());
System.out.println(division());
System.out.println("main-end");
	}

	public static int number(){
		
		int i=2;
		return i;
	}
	
	public static void addition(){
		
		System.out.println("addition-start");
		int a=2;
		int b=4;
		int c=a+b;
		System.out.println("addition="+ c);
		System.out.println("addition-end");
		
		
		
	}
	public static int multiplication(){
		
		int d=30;
		int g=40;
		int m=g*d;
		return m;
		
	}
public static double division(){
		
		double x=30;
		double y=40;
		double z=x/y;
		return z;
}
public static void importclass(){
	System.out.println("import a class");
}

}
