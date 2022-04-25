package com.baekjoon.ex02;

import java.util.Scanner;

public class Q2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int minute = sc.nextInt();

		int cook = sc.nextInt();

		int cooktime = cook + minute;

		if (hour + (cooktime / 60) > 23) {
			System.out.println((hour - 24) + (cooktime / 60) + " " + cooktime % 60);

		} else if (cooktime < 60) {
			System.out.println(hour + " " + (cook + minute));
			
		} else if (cooktime >= 60) {
			System.out.println((cooktime / 60 + hour) + "");

		}
		sc.close();

	}

}
