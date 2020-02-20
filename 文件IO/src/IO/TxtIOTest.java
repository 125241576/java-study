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
		FileOutputStream fos=null;//�ڵ��࣬����д�ֽ�
		OutputStreamWriter osw=null;//ת���࣬�����ַ�ת��Ϊ�ֽ�
		BufferedWriter bw=null;//װ���࣬����д�ַ���������
		/*
		 * BufferedWriter(OutputStreamWriter(FileOutputStream()))
		 */
		
		//�̶���ʽ
		try {
			fos=new FileOutputStream("D:\\JavaTest\\a.txt");
			osw=new OutputStreamWriter(fos,"UTF-8");
			bw=new BufferedWriter(osw);
			bw.write("���!");
			bw.newLine();//����
			bw.write("����!");
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
		
		//try-resource��䣬JAVA 7 ���Ͽ���
		
		try (BufferedWriter bw2=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\JavaTest\\b.txt")))){
			bw2.write("���!");
			bw2.newLine();//����
			bw2.write("����!");
			bw2.newLine();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		//���ļ�
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
