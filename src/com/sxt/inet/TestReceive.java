package com.sxt.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * ���Ͷ�
 * @author Administrator
 *
 */
public class TestReceive implements Runnable {
	private DatagramSocket socket;
	
	public TestReceive(int port) throws SocketException {
		super();
		socket = new DatagramSocket(port);
	}


	@Override
		public void run() {
			// ��������
			byte[] container = new byte[1024*10];
			// ������ת����packet
			DatagramPacket packet = new DatagramPacket(container, 0, container.length);
			// ��������
			try {
				socket.receive(packet);
				// ��������
				String string = new String(packet.getData(), 0, packet.getLength());
				System.out.println(string);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			socket.close();
		}
}
