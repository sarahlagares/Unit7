package com.codercampus.lesson2;

public class Body implements Part{

	public Body () {
		System.out.println("A Car's Body is being constructed");
	}
	
	@Override
	public Integer getSize() {
		return 20;
	}

	@Override
	public Integer getBuildTime() {
		return 5;
	}

}
