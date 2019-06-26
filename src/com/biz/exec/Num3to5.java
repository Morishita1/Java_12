package com.biz.exec;

public class Num3to5 {

	/*
	 * prob Num : 배수
	 * 10보다 작은 자연수 중에서 3 또는 5의 배수는
	 * 3, 5, 6, 9 이수의 합은 23입니다.
	 * 
	 * 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마
	 */
	public static void main(String[] args) {

		
		int sum=0;
		for(int i=0;i<1000;i++) {
			if(i%3==0 || i%5==0) sum+=i;
		}
		
		System.out.println("총합 : "+sum);
		
		
	}

}
