package com.sxt.inet;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 1. ʹ�� Socket �����ͻ��˲���������
 * 2. ����
 * 3. �ͷ���Դ
 * @author Administrator
 *
 */
public class TestTCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("client");
		Socket clientSocket = new Socket("localhost", 8888);
		
	}
}
