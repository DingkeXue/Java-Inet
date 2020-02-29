package com.sxt.inet;

import java.net.SocketException;

/**
 * 学生端
 * @author Administrator
 *
 */
public class TestReceiveTeacher {
	public static void main(String[] args) throws SocketException {
		// 发送数据
		TestSend student=new TestSend(6666, 9999, "localhost");
		new Thread(student).start();
		// 接收数据
		TestReceive receive = new TestReceive(9999);
		new Thread(receive).start();
	}
}
