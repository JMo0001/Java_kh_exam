package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

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
				System.out.println("메시지 >> ");
				sendMsg = stdIn.readLine();
				System.out.println(sendMsg);
				
				pw.print(sendMsg);
				pw.flush();
				
				String gotMsg = br.readLine();
				System.out.println("서버로부터의 메시지 : "+gotMsg);
				}
			}catch(UnknownHostException e){
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}finally{
				try {
					if(pw!=null)pw.close();
					if(br!=null)br.close();
					if(out!=null)out.close();
					if(in!=null)in.close();
					if(socket!=null)socket.close();
				}catch(IOException e) {
					e.printStackTrace();
			}
		}
	}
}
