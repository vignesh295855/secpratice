package com.ust;

import java.util.Scanner;

public class multiple356 {
	public static void main(String[] args) {
		int num = 1;
		while(num <= 50) {
			if(num%3 == 0||num%5==0||num%7==0) {
				System.out.println("Swapna");
			}else {
				System.out.println("Byee...");
			
			}
			num++;
		}
	}

}
