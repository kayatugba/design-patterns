package com.tugbakaya.builderpatternperson.person;

public class Person {

	private String name;
	private String surname;
	private int age;

	public static class Builder {
		private String name;
		private String surname;
		private int age;
		


		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setSurname(String surname) {
			this.surname = surname;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Person getPerson() {
			Person person = new Person();
			person.name = this.name;
			person.surname = this.surname;
			person.age = this.age;
			return person;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
