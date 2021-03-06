package String;

import java.text.MessageFormat;

public class StringFormatTest {
	public static void main(String[] args) {
		String msg = "{0}{1}{2}{3}{4}{5}{6}{7}{8}";  
		Object [] array = new Object[]{"A","B","C","D","E","F","G","H","I",};         
		String value = MessageFormat.format(msg, array);  
		System.out.println(value);
		
		String value2 = MessageFormat.format("oh, {0} and {1} is ''a'' pig", "ZhangSan","LiSi"); 
		System.out.println(value2);
		
		String value3 = MessageFormat.format("oh, {0,number,#.##} is good num", Double.valueOf("3.1415"));  
		System.out.println(value3);
	}
	
}
