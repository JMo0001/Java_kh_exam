package kh.lclass.chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ServerBackground {
	private ServerSocket ss;
	private ServerGUI gui;
	
	private Map<String, PrintWriter> mapClients = new HashMap<String, PrintWriter>();
	
	private Socket socket;
	private int count;
	
	public void setting() {
		Collections.synchronizedMap(mapClients);
		try {
			ss = new ServerSocket(5001);
			while(true) {
				socket = ss.accept();
				new Client(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void addClient(String nickname) {
		gui.appendMsg(nickname+"님이 접속 했습니다.");
	}
	////////////////////Inner class////////////////////
	class Client extends Thread{
		private BufferedReader br;
		private PrintWriter pw;
		private String nickname;
		
		public Client(Socket socket) {
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
				String nickname = br.readLine();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}
