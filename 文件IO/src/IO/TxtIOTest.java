package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TxtIOTest {

	public static void main(String[] args) {
		FileOutputStream fos=null;//节点类，负责写字节
		OutputStreamWriter osw=null;//转化类，负责字符转化为字节
		BufferedWriter bw=null;//装饰类，负责写字符到缓存区
		/*
		 * BufferedWriter(OutputStreamWriter(FileOutputStream()))
		 */
		
		//固定格式
		try {
			fos=new FileOutputStream("D:\\JavaTest\\a.txt");
			osw=new OutputStreamWriter(fos,"UTF-8");
			bw=new BufferedWriter(osw);
			bw.write("你好!");
			bw.newLine();//换行
			bw.write("世界!");
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//try-resource语句，JAVA 7 以上可用
		
		try (BufferedWriter bw2=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\JavaTest\\b.txt")))){
			bw2.write("你好!");
			bw2.newLine();//换行
			bw2.write("世界!");
			bw2.newLine();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		//读文件
		try (BufferedReader bw3=new BufferedReader(new InputStreamReader(new FileInputStream("D:\\JavaTest\\b.txt")))){
			String line;
			while((line=bw3.readLine())!=null)
			System.out.println(line);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
