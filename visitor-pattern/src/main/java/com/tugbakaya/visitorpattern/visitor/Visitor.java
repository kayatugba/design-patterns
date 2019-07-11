package com.tugbakaya.visitorpattern.visitor;

import com.tugbakaya.visitorpattern.node.City;
import com.tugbakaya.visitorpattern.node.Industry;

public interface Visitor {

	public void visitCity(City c);
	public void visitIndustry(Industry i);
}
