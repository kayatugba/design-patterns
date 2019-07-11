package com.tugbakaya.visitorpattern.node;

import com.tugbakaya.visitorpattern.visitor.Visitor;

public interface Node {

	public void accept(Visitor v);

}
