package com.tugbakaya.visitorpattern.node;

import com.tugbakaya.visitorpattern.visitor.Visitor;

public class Industry implements Node {

	public void accept(Visitor v) {
		v.visitIndustry(this);

	}

}
