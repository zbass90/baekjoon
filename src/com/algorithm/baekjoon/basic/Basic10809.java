package com.algorithm.baekjoon.basic;

import java.util.Scanner;

public class Basic10809 {

	public static void main(String[] args) {
		//input : baaekjoon
		//output : 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 
		
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		sc.close();
		
		char[] arrChar = line.toCharArray(); // String -> char[] 
		int[] arrOut = new int[26]; // 97 ~ 122 lowercase
		int arrCharNum = 0; // 문자가 등장하는 위치 체크
		
		for(int i=0; i< arrOut.length; i++) {
			arrOut[i] = -1;
		}
		
		for(int k=0; k< arrChar.length; k++) {
			int interval = arrChar[k]-'a';
			if(arrOut[interval] == -1) {
				arrOut[interval] = arrCharNum;
				arrCharNum++;
			}else {
				arrCharNum++;
			}
		}
		
		for (int i : arrOut) {
			System.out.print(i+" ");
		}
	}

}
