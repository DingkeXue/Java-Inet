package com.sxt.inet;

import java.net.InetSocketAddress;

/**
 * 1.Socket�׽��֣�IP + �˿�
 * 2.�˿ں�Ϊ2�ֽڣ�16λ 65535��  TCP/UDP
 * 3.ͳһЭ��˿ںŲ��ܳ�ͻ
 * 4.�Զ���˿ھ�������8000
 * 
 * ʹ�� InetSocketAddress ��
 * 1. ���캯�� new InetSocketAddress(IP|����,�˿ں�)
 * 2. ������getAddress()  getPort()
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
