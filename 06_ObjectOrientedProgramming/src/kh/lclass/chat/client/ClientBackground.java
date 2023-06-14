package kh.lclass.chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientBackground {
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	private String nickname;
	private ClientGUI gui;
	
	public void connection() {
		try {
			socket = new Socket("localhost", 5001);
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			pw.write(nickname);
			pw.flush();
			while(br!=null) {
				String msg = br.readLine();
				gui.appendMsg(msg);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void disconnection() {
			try {
				if(socket!=null) {
				socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	public void sendMsg(String msg) {
		pw.write(nickname+" : "+msg+"\n");
		pw.flush();
		gui.appendMsg(msg);
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public void setGui(ClientGUI gui) {
		this.gui = gui;
	}
	
	

}
