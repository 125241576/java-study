package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {

	public static void main(String[] args) throws Exception {
		DatagramSocket server=new DatagramSocket(9999);//���ý��ն˿ں�
		byte[] r=new byte[1024];
		DatagramPacket packet=new DatagramPacket(r, r.length);
		
		server.receive(packet);//û����Ϣ�յ���һֱ��������
		byte[] datas=packet.getData();
		int len=packet.getLength();
		System.out.println(new String(datas,0,len));
		server.close();
	}

}