package com.notfound.builder;

import com.notfound.builder.User.Builder;

public class UserTest {

	public static void main(String[] args) {
		
		
		User u1 = new User.Builder("bob")
				.setAddress("")
				.setAge(21)
				.setEmail("")
				.setPhone("")
				.build();
		
		User u2 = new User.Builder("jack")
				.setPhone("")
				.build();
		
	}
}
