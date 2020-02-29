package com.sxt.inet;

import java.net.SocketException;

/**
 * 学生端
 * @author Administrator
 *
 */
public class TestReceiveStudent {
	public static void main(String[] args) throws SocketException {
		// 发送数据
		TestSend student=new TestSend(8888, 9999, "localhost");
		new Thread(student).start();
		
		// 接收数据
		TestReceive receive = new TestReceive(6666);
		new Thread(receive).start();
	}
}
