package String;

public class StringDemo {
	public static void main(String[] args) {
		String s="123;456;789;000";
		System.out.println(s.charAt(3));
		System.out.println(s.codePointAt(3));
		System.out.println(s.concat(";123"));
		System.out.println(s.endsWith(";000"));
		System.out.println(s.compareTo("123;456;789;000;"));
		System.out.println(s.hashCode());
		System.out.println(s.equals(args));
		System.out.println(s.contains("23;4"));
		StringBuffer sb=new StringBuffer("123");
		sb.append(false);
		System.out.println(sb);
	}
}
