package com.sxt.inet;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL Àà
 * @author Administrator
 *
 */
public class TestInet03 {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://www.sxt.cn:80/Java_jQuery_in_action/twelve-url.html");
		System.out.println(url.getProtocol()+ "--->" + url.getHost());
		System.out.println(url.getPort()+ "--->" + url.getPath());
		System.out.println(url.getQuery()+ "--->" + url.getRef());
		
	}
}
