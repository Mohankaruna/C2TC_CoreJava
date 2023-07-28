package com.cg.day2;

public class Constructor {
	String name;
	int id;
	int phn;
	Constructor(String name,int id){
		this.name = name;
		this.id = id;
	}
	Constructor(String name,int id,int phn){
		this.name = name;
		this.id = id;
		this.phn=phn;
	}
	public static void main(String[] args) {
		Constructor a = new Constructor("Mohan",34000);
		System.out.println(a.name+ " "+a.id);
		Constructor b = new Constructor("Mohan",34,546987);
		System.out.println(b.name+ " "+b.id+" "+b.phn);
	}

}
