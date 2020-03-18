package com.algorithm.baekjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Basic2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int caseLength = Integer.parseInt(br.readLine());
		
		for(int a = 0 ; a<caseLength; a++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int repeat = Integer.parseInt(st.nextToken());
			char[] arrChar = st.nextToken().toCharArray();
			int line = arrChar.length;
			
			for(int i=0; i<line; i++) {
				for(int k=0; k<repeat; k++) {
					System.out.print(arrChar[i]);
				}
			}
			System.out.println();
		}
		
	}

}
