package com.sxt.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 模拟接收端
 * 1. 使用 DatagramSocket 创建接收端
 * 2. 准备容器，将容器封装成 DatagramPacket 包，使用 receive(DatagramPacket p) 阻塞接收数据
 * 3. 分析数据
 * 4. 释放资源
 * @author Administrator
 *
 */
public class TestUDPServer {
	public static void main(String[] args) throws IOException {
		System.out.println("接收端接收中....");
		// 使用 DatagramSocket 创建接收端
		DatagramSocket server = new DatagramSocket(9999);
		
		// 准备容器 
		byte[] container = new byte[1024];
		DatagramPacket packet = new DatagramPacket(container, container.length);
		
		// 接收
		server.receive(packet);
		
		// 分析数据：byte[] getData() getLength()
		byte[] data = packet.getData();
		System.out.println(new String(data));
		
		// 释放资源
		server.close();
	}
}
