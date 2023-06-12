package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TcpClient {
	public void client01(String ip, int port) {//서버 접속용 ip, port
		Socket socket = null;
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
	
		try {
			socket = new Socket(ip, port);//서버 접속 리퀘스트
			System.out.println("서버 연결중");
			
			in = socket.getInputStream();//입력스트림
			out = socket.getOutputStream();//출력스트림
			
			br = new BufferedReader(new InputStreamReader(in));//입력보조
			pw = new PrintWriter(new OutputStreamWriter(out));//출력보조
			
			pw.write("반갑습니다.");
			pw.flush();
			
			String sendMsg = null;
			while(true) {
				
			}catch(){
				
			}
		}
		
	}

}
