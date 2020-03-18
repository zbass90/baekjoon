package com.algorithm.baekjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Basic2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = "";
		String num = "";
	
		int length = st.countTokens();
		int max = 0;
		
		String[] arrNum = new String[length];
		
		for(int n=0; n<length;n++) {
			str = st.nextToken();
			for(int i=str.length(); i>0; i--) {
				num += str.charAt(i-1);
			}
			arrNum[n] = num;
			num = "";
		}
		
		for(int i=0;i<length;i++) {
			int n = Integer.parseInt(arrNum[i]);
			if(max < n) {
				max = n;
			}
		}
		System.out.println(max);
	}
}
