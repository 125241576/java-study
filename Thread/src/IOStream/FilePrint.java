package IOStream;

import java.io.File;

public class FilePrint {
	public static void main(String[] args) {
		File fileParent=new File("D:\\abc");
		print(fileParent);
	}
	public static void print(File f) {
			System.out.println(f.getAbsolutePath());
			File[] filename=f.listFiles();
			for(File file: filename)
			{
				if(file.isDirectory())
					print(file);
				else
					System.out.println(file.getAbsolutePath());
			}
		
			
	}
}
