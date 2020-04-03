package com.algorithm.baekjoon.basic;

import java.util.Scanner;

public class Basic1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr_str = str.split(" ");
		long a = Long.parseLong(arr_str[0]); //생산 고정비용
		long b = Long.parseLong(arr_str[1]); //생산 가변비용
		long c = Long.parseLong(arr_str[2]); //판매 비용
		int cnt = 1;
		//c * 컴퓨터 새수 - a + b * 컴터 대수 = 0보다 클때
		//a+b*컴퓨터 대수 < c * 컴퓨터 새수
		if(b >= c) {
			System.out.println(-1); System.exit(0);
		}else {
			while(a+b*cnt >= c*cnt) {
				cnt+=1;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}

}
