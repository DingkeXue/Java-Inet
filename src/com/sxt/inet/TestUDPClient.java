package com.sxt.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
/**
 * 用户模拟客户端
 * 1. 使用 DatagramSocket 创建发送端
 * 2. 准备数据，转换成字节流
 * 3. 封装成 DatagramPacket 发送数据
 * 4. 关闭资源
 * @author Administrator
 *
 */
public class TestUDPClient {
	public static void main(String[] args) throws IOException {
		System.out.println("发送方发送中...");
		// 使用 DatagramSocket 创建发送端
		DatagramSocket datagramSocket = new DatagramSocket(8888);
		// 准备数据，转换成字节流
		byte[] data = "我是客户端".getBytes();
		// 封装后发送(指定发送到哪)
		DatagramPacket packet = new DatagramPacket(data, 0, new InetSocketAddress("localhost", 9999));
		datagramSocket.send(packet);
		
		// 释放资源
		datagramSocket.close();
	}
}
