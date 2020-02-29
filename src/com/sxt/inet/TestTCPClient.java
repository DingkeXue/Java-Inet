package com.sxt.inet;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 1. 使用 Socket 创建客户端并建立连接
 * 2. 操作
 * 3. 释放资源
 * @author Administrator
 *
 */
public class TestTCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("client");
		Socket clientSocket = new Socket("localhost", 8888);
		
	}
}
