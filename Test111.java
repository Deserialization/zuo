package cn.it.zuo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test111 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();		
		Scanner scanner = new Scanner(System.in);	
		while(scanner.hasNext()){		
			String string = scanner.nextLine();
			String[] strings = string.split(" ");
			int[] array = new int [strings.length];
			for (int i = 0; i < strings.length; i++) {
				array[i] = Integer.parseInt(strings[i]);								
				list.add(array[i]);		
			}
			System.out.println(list.size());		
		}		
		
	}

}
