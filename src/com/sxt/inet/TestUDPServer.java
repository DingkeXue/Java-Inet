package com.sxt.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * ģ����ն�
 * 1. ʹ�� DatagramSocket �������ն�
 * 2. ׼����������������װ�� DatagramPacket ����ʹ�� receive(DatagramPacket p) ������������
 * 3. ��������
 * 4. �ͷ���Դ
 * @author Administrator
 *
 */
public class TestUDPServer {
	public static void main(String[] args) throws IOException {
		System.out.println("���ն˽�����....");
		// ʹ�� DatagramSocket �������ն�
		DatagramSocket server = new DatagramSocket(9999);
		
		// ׼������ 
		byte[] container = new byte[1024];
		DatagramPacket packet = new DatagramPacket(container, container.length);
		
		// ����
		server.receive(packet);
		
		// �������ݣ�byte[] getData() getLength()
		byte[] data = packet.getData();
		System.out.println(new String(data));
		
		// �ͷ���Դ
		server.close();
	}
}
