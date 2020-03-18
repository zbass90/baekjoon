package com.algorithm.baekjoon.basic;

import java.util.Scanner;

public class Basic1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toUpperCase();
		sc.close();
		
		int[] arrChar = new int[26];
		int maxNum = 0;
		char result = '?';
		
		for(int i=0; i< word.length(); i++) {
			arrChar[word.charAt(i)-65]++;
			if(maxNum < arrChar[word.charAt(i)-65]) {
				maxNum = arrChar[word.charAt(i)-65];
				result = word.charAt(i);
			}else if(maxNum == arrChar[word.charAt(i)-65]) {
				result = '?';
			}
		}
		System.out.println(result);
		
		
	}
}
