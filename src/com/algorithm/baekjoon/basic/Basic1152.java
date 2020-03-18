package com.algorithm.baekjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Basic1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		int cnt = st.countTokens();
		System.out.println(cnt);
	}
}
