package com.te.assignment;

import java.util.HashSet;

public class Cricket {

	public static void main(String[] args) {
		HashSet<Team> hashSet = new HashSet<>();
		hashSet.add(new Team(1,"kL rahul",26,1));
		hashSet.add(new Team(2,"dhoni",22,23));
		hashSet.add(new Team(3,"kohli",33,32));
		hashSet.add(new Team(4,"ABD",37,4));
		hashSet.add(new Team(5,"hardik",28,5));
		hashSet.add(new Team(6,"Ahwin",23,6));
		hashSet.add(new Team(7,"siraj",25,7));
		hashSet.add(new Team(8,"Archar",47,8));
		hashSet.add(new Team(9,"maxwel",29,9));
		hashSet.add(new Team(10,"sachin",25,10));
		hashSet.add(new Team(11,"kiran",23,11));

		for(Team x:hashSet) {
			System.out.println(x);
		}
		System.out.println("===============");
		hashSet.add(new Team(12,"rachi",21,12));
		for(Team x:hashSet)
			System.out.println(x);
		


	}

}
