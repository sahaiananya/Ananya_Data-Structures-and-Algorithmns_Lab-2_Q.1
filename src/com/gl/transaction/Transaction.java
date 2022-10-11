package com.gl.transaction;

public class Transaction {
	public void isTargetAchievable(int target, int[] arr) {
		int sum=0;
		for (int i=0; i <arr.length; i++) {
			sum=sum+arr[i];
			if(sum>= target) {
				System.out.println("Target achieved after" +(i+1)+"transactions");
				break;
			}
		}
		
		if(sum<target) {
			System.out.println("Target not acheved");
		}
	}
}
