package kh.lclass.chat.server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGUI extends JFrame implements ActionListener{
	private JTextArea jta = new JTextArea(40, 25);
	private JTextField jtf = new JTextField(25);
	private ServerBackground sb = new ServerBackground();
	
	public ServerGUI() {
		setBounds(200, 100, 400, 600);
		setTitle("서버창");
		
		jta.setEditable(false);
		jta.setFont(new Font("맑은고딕", Font.ITALIC,14));	
		jta.setBackground(new Color(225, 120, 330));
		
		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		jtf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public void appendMsg(String msg) {
		jta.append(msg);
		jta.append("\n");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
