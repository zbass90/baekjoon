package com.algorithm.baekjoon.basic;

import java.util.Scanner;

public class Basic5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toCharArray();
		int sum = 0;
		sc.close();
		
		for(int i=0; i<str.length;i++) {	//65 ~ 90
			if(str[i]>64 && str[i]<68) {
				sum+=3;
			}else if(str[i]>67 && str[i]<71) {
				sum+=4;
			}else if(str[i]>70 && str[i]<74) {
				sum+=5;
			}else if(str[i]>73 && str[i]<77) {
				sum+=6;
			}else if(str[i]>76 && str[i]<80) {
				sum+=7;
			}else if(str[i]>79 && str[i]<84) {
				sum+=8;
			}else if(str[i]>83 && str[i]<87) {
				sum+=9;
			}else if(str[i]>86 && str[i]<91) {
				sum+=10;
			}
		}
		System.out.println(sum);
	}

}
