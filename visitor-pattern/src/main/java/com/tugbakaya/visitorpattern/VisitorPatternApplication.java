package com.tugbakaya.visitorpattern;

import java.util.ArrayList;
import java.util.List;

import com.tugbakaya.visitorpattern.node.City;
import com.tugbakaya.visitorpattern.node.Industry;
import com.tugbakaya.visitorpattern.node.Node;
import com.tugbakaya.visitorpattern.visitor.StringVisitor;
import com.tugbakaya.visitorpattern.visitor.Visitor;

public class VisitorPatternApplication {

	public static void main(String[] args) {
		System.out.println("Visitor pattern application");
		List<Node> nodes = new ArrayList<Node>();
		nodes.add(new City());
		nodes.add(new Industry());
		Visitor v = new StringVisitor(); 
		for(Node n :nodes)
		{
			n.accept(v);
		}
	}

}
