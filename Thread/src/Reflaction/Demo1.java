package Reflaction;

public class Demo1 {
	public static void main(String[] args) {
		String s1="hello";
		Demo1 d1=new Demo1();
		
		Class c1=s1.getClass();
		Class c2=d1.getClass();
		Class c3=Demo1.class;
		System.out.println(c1.getFields());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
	}
}
