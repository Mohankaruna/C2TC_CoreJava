package com.cg.dayone;

import java.util.*;

public class Basics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter String: ");
		name = sc.nextLine();
		char nme[] = name.toCharArray();
		int n = name.length();
	    for(int i = n-1; i>= 0;i--) {
	    	System.out.print(nme[i]);
	    }
	    
	}
}
