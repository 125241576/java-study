package IOStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;



public class IOdemo2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("D:\\abc\\abc.txt");
		byte[] b= {49,48,48,48};
		f.write(b);
		f.close();
	}
}
