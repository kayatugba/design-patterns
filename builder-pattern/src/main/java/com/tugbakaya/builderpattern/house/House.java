package com.tugbakaya.builderpattern.house;

public class House {

	private String basement;
	private String structure;
	private String interior;
	private String roof;

	public String getBasement() {
		return basement;
	}

	public void setBasement(String basement) {
		this.basement = basement;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getInterior() {
		return interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public void showHouseProperties() {
		System.out.println("Basement " + this.basement);
		System.out.println("Structure " + this.structure);
		System.out.println("Interior " + this.interior);
		System.out.println("Roof " + this.roof);
	}

}
