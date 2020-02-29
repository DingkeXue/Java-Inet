package com.sxt.inet;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * ��������
 * @author Administrator
 *
 */
public class TestInet04 {
	public static void main(String[] args) throws IOException {
		// ��ȡURL
		URL url = new URL("https://www.baidu.com/?tn=78000241_9_hao_pg");
		// ��������
		HttpURLConnection connection =(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
		
		// ������Դ
		BufferedReader inputStream = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
		
		String msgString = null;
		while((msgString = inputStream.readLine()) != null) {
			System.out.println(msgString);
		}
		inputStream.close();
	}
}
