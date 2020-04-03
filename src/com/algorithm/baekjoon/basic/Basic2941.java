package com.algorithm.baekjoon.basic;

import java.io.*;

public class Basic2941 {

	public static void main(String[] args) throws IOException{
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

 		String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String input = br.readLine();
		
		int result = 0; int i; 
		for(i=0; i<word.length; i++) { 
			if(input.contains(word[i])) { 
				input = input.replaceAll(word[i], "*"); // System.out.println(input); 
			} 
		}
		result = input.length(); 
		bw.write(String.valueOf(result));
		bw.flush(); br.close();
		bw.close(); 
	}
}
