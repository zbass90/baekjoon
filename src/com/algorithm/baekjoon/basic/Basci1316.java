package com.algorithm.baekjoon.basic;

import java.io.*;

public class Basci1316 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int repeat = Integer.parseInt(br.readLine());
		String[] arr_str = new String[repeat];
		boolean[] chk; int sum = 0;
		for(int i=0; i<arr_str.length; i++) { //String[] 단어들 주입
			arr_str[i] = br.readLine();
		}
		
		for (String string : arr_str) {
			chk = new boolean[26];
			int n = 0, _n = 0;
			for(int i=0; i<string.length(); i++) {
				n = string.charAt(i)-97;
				if(i>0) {
					_n = string.charAt(i-1)-97;
				}
				
				if(chk[n]) { //chk[n] true일때
					if(n!=_n) {
						i=string.length();
					}else {
						if(i==string.length()-1) {
							sum++;
						}
					}
				}else { //chk[n] false일때
					if(!chk[n]) {
						chk[n] = true;
					}
					if(i==string.length()-1) {
						sum++;
					}
				}
			}
		}
		
		bw.write(sum+"");
		bw.flush();
		br.close();bw.close();
	}

}
