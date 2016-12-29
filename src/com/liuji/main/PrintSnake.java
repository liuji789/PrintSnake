package com.liuji.main;

import java.util.Scanner;

@SuppressWarnings("resource")
public class PrintSnake {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("please input n:");
		int n = input.nextInt();
		int[][] a = new int[n][n];
		int b = 0;
		int h1 = 0;
		int h2 = 0;
		int h3 = 0;
		int h4 = 0;
		int num = 1;
		boolean flag = true;
		do {
			switch (b % 4) {
			case 0:
				for (int i = h4; i < n - h2; i++) {
					a[h1][i] = num++;
				}
				h1++;
				b++;
				break;
			case 1:
				for (int i = h1; i < n - h3; i++) {
					a[i][n - h2 - 1] = num++;
				}
				b++;
				h2++;
				break;
			case 2:
				for (int i = n - h2 - 1; i >= h4; i--) {
					a[n - h3 - 1][i] = num++;
				}
				b++;
				h3++;
				break;
			case 3:
				for (int i = n - h3 - 1; i >= h1; i--) {
					a[i][h4] = num++;
				}
				b++;
				h4++;
				break;
			}
			if (b == 2 * n - 1) {
				flag = false;
			}
		} while (flag);
		
		//循环打印数组
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

}
