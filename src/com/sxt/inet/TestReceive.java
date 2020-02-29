package com.sxt.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 发送端
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
			// 创建容器
			byte[] container = new byte[1024*10];
			// 将容器转换成packet
			DatagramPacket packet = new DatagramPacket(container, 0, container.length);
			// 接收数据
			try {
				socket.receive(packet);
				// 分析数据
				String string = new String(packet.getData(), 0, packet.getLength());
				System.out.println(string);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			socket.close();
		}
}
