package com.sxt.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 通过 InetAddress 获取网络基本信息,该类没有构造方法，只有静态方法
 * getLocalHost():获取本机
 * getByName():通过域名获取IP地址
 * getAddress():获取IP地址
 * getHostName():获取主机名
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
