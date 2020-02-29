package com.sxt.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ͨ�� InetAddress ��ȡ���������Ϣ,����û�й��췽����ֻ�о�̬����
 * getLocalHost():��ȡ����
 * getByName():ͨ��������ȡIP��ַ
 * getAddress():��ȡIP��ַ
 * getHostName():��ȡ������
 * @author Administrator
 *
 */
public class TestInet01 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println(inetAddress.getHostAddress()+inetAddress.getHostName());
		
		inetAddress = InetAddress.getByName("www.baidu.com");
		System.out.println(inetAddress.getHostAddress()+inetAddress.getHostName());
		
	}
}
