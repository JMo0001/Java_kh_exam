package kh.lclass.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpEchoreceiver {
	public static void main(String[] args) {
		new UdpEchoreceiver().udpEchoreceiver();
	}
	
		
	public void udpEchoreceiver() {
		int myPort = 4001;	//포트 번호 정함
		DatagramSocket dSock = null;
		
		try {
			dSock = new DatagramSocket(myPort);
			while(true) {//메시지 수신
				byte[] byteMsg = new byte[20];
				DatagramPacket youData//메시지 받을 DatagramPacket 객체
				= new DatagramPacket(byteMsg, byteMsg.length);
				dSock.receive(youData);
				
				String gotStr = new String(youData.getData());
				System.out.println("수신 메시지 :"+gotStr);
			}
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
