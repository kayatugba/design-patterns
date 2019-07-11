package com.tugbakaya.visitorpattern.visitor;

import com.tugbakaya.visitorpattern.node.City;
import com.tugbakaya.visitorpattern.node.Industry;

public class StringVisitor implements Visitor {

	public void visitCity(City c) {
		System.out.println("Visiting city " + c.toString());
	}

	public void visitIndustry(Industry i) {
		System.out.println("Visiting industry " + i.toString());
	}

}
