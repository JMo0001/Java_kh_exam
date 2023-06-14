package kh.lclass.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpEchoSender {
	public static void main(String[] args) {
		new UdpEchoSender().senderUdp();
	}
	
	public void senderUdp() {
		int myPort = 3001;//내 포트
		int youPort = 4001;//상대 포트
		
		String youName = "localhost";
		
		BufferedReader br = null;
		DatagramSocket dSock = null;//datagramSocket 객체
		
			try {
				dSock = new DatagramSocket(myPort);
				//메시지 입력을 위한 inputstream
				br = new BufferedReader(new InputStreamReader(System.in));
				
				while(true) {//전달할 메시지
					System.out.println("입력 >>");
					String myMsg = br.readLine();
					if(myMsg.equals("exit")) {//프로그램 종료 exit 입력
						break;
					}
					InetAddress youIp = null;
					try {//연결할 대상 inetAddress 객체 생성
						youIp = InetAddress.getByName(youName);
						//전송할 메시지 byte[] 형식으로 바꿈.
						byte[] byteMsg = myMsg.getBytes();
						//메시지를 datagrampacket 객체에 담음.
						DatagramPacket myData = 
								new DatagramPacket(byteMsg, byteMsg.length, youIp, youPort);
						dSock.send(myData);//소켓 이용하여 packet 전송
						
					}catch(UnknownHostException e) {
						e.printStackTrace();
					}
				}
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if(br!=null) br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				if(dSock!=null) dSock.close();
			}
	}
}
