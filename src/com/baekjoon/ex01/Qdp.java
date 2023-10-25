package com.baekjoon.ex01;

import java.util.ArrayList;
import java.util.Collections;

public class Qdp {
	
	public static void main(String[] args) {
		ArrayList<Integer> pos  = new ArrayList<>();
		ArrayList<Integer> posx  = new ArrayList<>();
		
		pos.add(1);		// 1을 리스트에 추가
		pos.add(2);
		pos.add(3);
		pos.add(4);
		pos.add(5);
		pos.add(7);
		pos.add(6);
		
//		pos.remove(0);	// 0번째 인덱스 삭제
//		pos.contains(1);	// 리스트에 1을 포함하고 있는지 판별(boolean)
//		
		Collections.sort(pos);				// 리스트 오름차순 정렬
		
		int min = 0;
		
		for (int i = 0; i < pos.size(); i++) {
		}
		
		
		System.out.println(pos.toString());	// 리스트의 내용을 출력
		System.out.println(pos.size());		// 리스트의 크기를 출력
		
		
		
//		pos = new ArrayList<>();
//		pos.removeAll(pos);
//		pos.clear();
		
	}
	
	
	
	
	
	
  /**
    a: A
    b: B
    n: 도로의 길이
    pos: 재활용 쓰레기의 위치를 나타내는 ArrayList (ArrayList의 크기가 재활용 쓰레기의 개수, 가장 왼쪽 위치가 1, 가장 오른쪽 위치가 n)
  */
  public static long getEffort(int a, int b, int n, ArrayList<Integer> pos) {
    // Write your code here
	  
	  
    return 0;
  }
}