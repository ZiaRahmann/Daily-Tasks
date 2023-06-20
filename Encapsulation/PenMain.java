package Encapsulation;

import java.util.LinkedList;

public class PenMain {
	
public static void main(String[] args) {
	
	Pen p1 = new Pen();
	p1.setPenName("FineGrip");
	p1.setPenInk("Blue");
	p1.setPenCompany("Reynolds");
	
	
	System.out.println("Pen Name -- "+p1.getPenName()+"  "+"Pen Ink -- "+
	      p1.getPenInk()+"  "+"Pen Company -- "+ p1.getPenCompany());
	
}
}
