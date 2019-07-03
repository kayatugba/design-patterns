package com.tugbakaya.builderpatternperson;

import com.tugbakaya.builderpatternperson.person.Person;

public class BuilderPatternPersonApplication {
	public static void main(String[] args) {
		System.out.println("Builder pattern person application");
		
		Person person = new Person.Builder().setName("jack").setSurname("johnson").setAge(5).getPerson();
		System.out.println(person.getName() +" "+ person.getSurname()+" " + person.getAge());

	}

}
