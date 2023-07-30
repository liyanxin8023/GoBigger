package com.hspedu.homework;

public class LabeledPoint extends Point{
	private String lade;
	public LabeledPoint(String lade ,double x, double y) {
		super(x,y);
		this.lade=lade;
	}
}
