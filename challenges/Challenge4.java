package com.te.challenges;

public class Challenge4 {
	public boolean isCatPlaying(String summer,int temp) {
		if(summer==summer&&temp>=25&&temp<=45) {
			return true;
		}else if(summer!=summer&&temp>=25&&temp<=35) {
			return true;
		}else
			return false;
	}
	

	public static void main(String[] args) {
		Challenge4 challenge4 = new Challenge4();
		System.out.println(challenge4.isCatPlaying("winter", 44));

	}

}
