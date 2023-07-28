package com.cg.day5;

public class Encapsulation {
	private int id;
	private String name;
	private int phn;
	private int salary;
	public Encapsulation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Encapsulation(int id, String name, int phn, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.phn = phn;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhn() {
		return phn;
	}
	public void setPhn(int phn) {
		this.phn = phn;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Encapsulation [id=" + id + ", name=" + name + ", phn=" + phn + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		Encapsulation a = new Encapsulation();
		a.setId(001);
		a.setName("MOHAN");
		a.setPhn(1234567890);
		a.setSalary(650000);
		System.out.println(a);
	}

}
