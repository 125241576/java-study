package UDP;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class Iptest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		InetAddress add=InetAddress.getLocalHost();
//		System.out.println(add.getHostAddress());
//		System.out.println(add.getHostName());
//		
//		add=InetAddress.getByName("www.google.com");
//		System.out.println(add.getHostAddress());
//		System.out.println(add.getHostName());
//		InetSocketAddress addr=new InetSocketAddress("localhost", 8080);
//		System.out.println(addr.getAddress());
		
		URL u=new URL("https://www.jd.com");
		InputStream is=u.openStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is,"UTF-8"));
		String msg=null;
		while(null!=(msg=br.readLine())) {
			System.out.println(msg);
			
		}
		br.close();
	}

}
