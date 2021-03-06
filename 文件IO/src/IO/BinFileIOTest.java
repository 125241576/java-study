package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class BinFileIOTest {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		BufferedOutputStream bos=null;
		
		try {
			fos=new FileOutputStream("D:\\JavaTest\\a.dat");
			bos=new BufferedOutputStream(fos);
			dos=new DataOutputStream(bos);
			
			dos.writeUTF("你好！");
			dos.writeInt(20);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//DataOutputStream(BufferedOutputStream(FileOutputStream()))
		
	//写数据
	
	try(DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\JavaTest\\a.dat")))){
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
	}catch(Exception e) {
		e.printStackTrace();
	}//读数据

}
}
