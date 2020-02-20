package TCP;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		try {
			Socket s=new Socket(InetAddress.getByName("localhost"), 9090);//连接服务器
			
			InputStream ips=s.getInputStream();//开启输入流
			BufferedReader brNet=new BufferedReader(new InputStreamReader(ips));
			
			OutputStream ops=s.getOutputStream();//开启输出流
			DataOutputStream dos= new DataOutputStream(ops);
			
			BufferedReader brKey= new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				String str=brKey.readLine();
				if(str.equalsIgnoreCase("q"))
					break;
				else {
					System.out.println("send : "+str);
					dos.writeBytes(str+"\n");
					System.out.println("recive : "+brNet.readLine());
				}
				
			}
			dos.close();
			brNet.close();
			brKey.close();
			s.close();
			
			
			
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
