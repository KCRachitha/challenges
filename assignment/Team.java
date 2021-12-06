package com.te.assignment;

public class Team {
	int num;
	String name;
	int age;
	static int count;
	int count1;
	public void check(int count1) {
		if(count1>11) {
			throw new NotApplicable("can not add players more than 11");
		}
		
	}
	public Team(int num, String name, int age, int count1) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.count1 = count1;
	}
	@Override
	public String toString() {
		return "Team [num=" + num + ", name=" + name + ", age=" + age + ", count1=" + count1 + "]";
	}
	

}
