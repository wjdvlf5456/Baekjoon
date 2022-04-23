package com.baekjoon.ex02;

import java.util.Scanner;

public class Q2884 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		
		if (hour>0 && hour<24) {
			if (minute>=45) {
				System.out.println(hour+" "+(minute-45));
			} else {
				System.out.println((hour-1)+" "+(minute+15));
			}
			
		} else if(hour==0){
			if (minute>=45) {
				System.out.println(hour+" "+(minute-45));
			} else {
				System.out.println((hour+23)+" "+(minute+15));

			}

		}
		
		sc.close();
		
		
	}

}
