package com.sxt.inet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1. ʹ�� ServerSocket ������������
 * 2. ����
 * 3. ����
 * 4. �ͷ���Դ
 * @author Administrator
 *
 */
public class TestTCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8888);
		
		// ����
		Socket clientSocket = serverSocket.accept();
		
		// ����
		System.out.println("������������");
		
		
	}
}
