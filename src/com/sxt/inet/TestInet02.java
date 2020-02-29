package com.sxt.inet;

import java.net.InetSocketAddress;

/**
 * 1.Socket套接字：IP + 端口
 * 2.端口号为2字节，16位 65535个  TCP/UDP
 * 3.统一协议端口号不能冲突
 * 4.自定义端口尽量大于8000
 * 
 * 使用 InetSocketAddress 类
 * 1. 构造函数 new InetSocketAddress(IP|域名,端口号)
 * 2. 方法：getAddress()  getPort()
 * @author Administrator
 *
 */
public class TestInet02 {
	public static void main(String[] args) {
		InetSocketAddress inetSocketAddress = new InetSocketAddress("localhost", 9999);
		InetSocketAddress inetSocketAddress2 = new InetSocketAddress("61.135.169.125", 9990);
		System.out.println(inetSocketAddress.getAddress() + "===>" + inetSocketAddress.getPort());
		System.out.println(inetSocketAddress2.getHostName() + "===>" + inetSocketAddress2.getPort());
	}
}
