package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public void server01(int port) {//포트번호 생성
		ServerSocket ss = null;//소켓
		Socket sc = null;//객체 소켓
		InputStream in = null;//인풋
		OutputStream out = null;//아웃풋
		BufferedReader br = null;//인풋보조
		BufferedWriter bw = null;//아웃풋보조
		
		try {// 서버용 객체 생성
			ss = new ServerSocket(port);
			while(true) {//클라이언트 접속 대기
				System.out.println("접속 대기중");
				sc = ss.accept();//접속 요청 수락
				System.out.println("접속 수락");
				
				in = sc.getInputStream();//입력 스트림
				out = sc.getOutputStream();//출력 스트림
				
				br = new BufferedReader(new InputStreamReader(in));//인풋 보조
				bw = new BufferedWriter(new OutputStreamWriter(out));//아웃풋 보조
				
				String gotMsg = null;
				while((gotMsg = br.readLine())!=null) {
					System.out.println("받은 메시지 : "+gotMsg);
					bw.write("메세지 수신완료.");
					bw.flush();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw!=null)bw.close();
				if(br!=null)br.close();
				if(out!=null)out.close();
				if(in!=null)in.close();
				if(sc!=null)sc.close();
				if(ss!=null)ss.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
