package com.notfound.builder;

public class User {

	String name;
	int age;
	String phone;
	String email;
	String address;

	private User() {
	}

	// 构造器模式
	public static class Builder {

		String name;
		int age;
		String phone;
		String email;
		String address;

		public Builder(String name) {
			this.name = name;
		}
		
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		
//		public Builder setName(String name) {
//			this.name = name;
//			return this;
//		}
		
		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}
		
		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			User u = new User();
			u.age = age;
			u.name = name;
			u.phone = phone;
			u.address = address;
			u.email = email;
			
			return u;
		}

	}
}
