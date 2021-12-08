package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex02 {

	public static void main(String[] args) {

		//정수형 관리
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		int i04 = 100;
		Integer i05 = new Integer(13);
		Integer i06 = new Integer(17);
		
		Set<Integer> iSet = new HashSet<Integer>();
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04);  //자동 박싱
		iSet.add(i05);
		iSet.add(i06);
		
		iSet.remove(13);
		
		System.out.println("갯수:" + iSet.size());
		
		for( Integer no : iSet) {
			System.out.println(no.toString());
		}

		System.out.println(iSet.toString());
		
		
		System.out.println("------------------------");
		
		//Point 관리
		Point p01 = new Point(3, 13);  
		Point p02 = new Point(4, 14);  
		Point p03 = new Point(5, 15);   
		Point p04 = new Point(3, 13);  
		Point p05 = new Point(10, 6);  
		
		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		//pSet.remove(p04);
		//pSet.remove(p02);
		
		for(Point i: pSet) {
			System.out.println(i.getX());
			System.out.println();
		}
		
		
		System.out.println(pSet.toString());
		
	}

}