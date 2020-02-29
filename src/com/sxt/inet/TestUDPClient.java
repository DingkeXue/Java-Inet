package com.sxt.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
/**
 * �û�ģ��ͻ���
 * 1. ʹ�� DatagramSocket �������Ͷ�
 * 2. ׼�����ݣ�ת�����ֽ���
 * 3. ��װ�� DatagramPacket ��������
 * 4. �ر���Դ
 * @author Administrator
 *
 */
public class TestUDPClient {
	public static void main(String[] args) throws IOException {
		System.out.println("���ͷ�������...");
		// ʹ�� DatagramSocket �������Ͷ�
		DatagramSocket datagramSocket = new DatagramSocket(8888);
		// ׼�����ݣ�ת�����ֽ���
		byte[] data = "���ǿͻ���".getBytes();
		// ��װ����(ָ�����͵���)
		DatagramPacket packet = new DatagramPacket(data, 0, new InetSocketAddress("localhost", 9999));
		datagramSocket.send(packet);
		
		// �ͷ���Դ
		datagramSocket.close();
	}
}
