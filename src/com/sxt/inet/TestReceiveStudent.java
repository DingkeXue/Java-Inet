package com.sxt.inet;

import java.net.SocketException;

/**
 * ѧ����
 * @author Administrator
 *
 */
public class TestReceiveStudent {
	public static void main(String[] args) throws SocketException {
		// ��������
		TestSend student=new TestSend(8888, 9999, "localhost");
		new Thread(student).start();
		
		// ��������
		TestReceive receive = new TestReceive(6666);
		new Thread(receive).start();
	}
}
