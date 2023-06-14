package kh.lclass.chat.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

public class ClientGUI extends JFrame implements ActionListener{

	private static final long serialVersionUID = -6309558503354317301L;
	private JTextArea jta = new JTextArea(40,25);
	private JTextField jtf = new JTextField(80);
	
	private String nickname;
	private ClientBackground cb = new ClientBackground();
	
	public ClientGUI(String nickname) {
		this.nickname = nickname;
		
		setBounds(200, 100, 400, 600);
		setTitle(nickname+" 님 창");
		
		jta.setEditable(false);
		jta.setFont(new Font("맑은고딕", Font.ITALIC, 14));
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
		String msg = jtf.getText();
		System.out.println(msg);
		jtf.setText("");
		cb.sendMsg(msg);
	}

}
