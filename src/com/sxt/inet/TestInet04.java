package com.sxt.inet;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 网络爬虫
 * @author Administrator
 *
 */
public class TestInet04 {
	public static void main(String[] args) throws IOException {
		// 获取URL
		URL url = new URL("https://www.baidu.com/?tn=78000241_9_hao_pg");
		// 发起请求
		HttpURLConnection connection =(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
		
		// 下载资源
		BufferedReader inputStream = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
		
		String msgString = null;
		while((msgString = inputStream.readLine()) != null) {
			System.out.println(msgString);
		}
		inputStream.close();
	}
}
