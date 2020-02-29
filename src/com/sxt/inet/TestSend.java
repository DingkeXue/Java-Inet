package com.sxt.inet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * �������칦�ܣ����̣߳����з��ͺͽ��չ���
 * @author Administrator
 *
 */
public class TestSend implements Runnable {
	private DatagramSocket socket;
	// �Է��˿�
	private int ToPort;
	// �Է���ַ
	private String target;
	// ��������
	private String from;
	private BufferedReader reader;
	
	public TestSend(int port, int toPort, String target) throws SocketException {
		super();
		socket = new DatagramSocket(port);
		reader = new BufferedReader(new InputStreamReader(System.in));
		ToPort = toPort;
		this.target = target;
	}

	@Override
	public void run() {
		while(true) {
			String dataString;
			try {
				dataString = reader.readLine();
				byte[] data = dataString.getBytes();
				// �����ݷ�װ�� packet����
				DatagramPacket packet = new DatagramPacket(data, 0, data.length, new InetSocketAddress(this.target, this.ToPort));
				socket.send(packet);
				if (dataString.equals("bye")) {
					break;
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			socket.close();
		}
	}
}
