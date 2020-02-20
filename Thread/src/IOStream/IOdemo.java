package IOStream;

import java.io.File;
import java.io.IOException;



public class IOdemo {
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		File f1=new File("D:\\Ñ¸À×ÏÂÔØ");
//		System.out.println(f1.isFile());
//		System.out.println(f1.isDirectory());
//		System.out.println(f1.exists());
//		System.out.println(f1.mkdirs());
//		try {
//			f1.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("chucuo !");
//		}
		String[] arr=f1.list();
		for(String filename : arr)
			System.out.println(filename);
		File[] arrf=f1.listFiles();
		for(File filename:arrf)
			System.out.println(filename.getPath());
	}
}
