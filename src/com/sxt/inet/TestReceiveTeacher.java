package com.sxt.inet;

import java.net.SocketException;

/**
 * ѧ����
 * @author Administrator
 *
 */
public class TestReceiveTeacher {
	public static void main(String[] args) throws SocketException {
		// ��������
		TestSend student=new TestSend(6666, 9999, "localhost");
		new Thread(student).start();
		// ��������
		TestReceive receive = new TestReceive(9999);
		new Thread(receive).start();
	}
}
