package com.tugbakaya.visitorpattern.node;

import com.tugbakaya.visitorpattern.visitor.Visitor;

public class City implements Node {

	public void accept(Visitor v) {
		v.visitCity(this);
	}

}
