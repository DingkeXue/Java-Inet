package com.sxt.inet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1. 使用 ServerSocket 创建服务器端
 * 2. 监听
 * 3. 处理
 * 4. 释放资源
 * @author Administrator
 *
 */
public class TestTCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8888);
		
		// 监听
		Socket clientSocket = serverSocket.accept();
		
		// 处理
		System.out.println("有人连接上拉");
		
		
	}
}
