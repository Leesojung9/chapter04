package com.javaex.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {
		
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(1, 11);  //권상우
		Point p02 = new Point(2, 22);  //정우성
		Point p03 = new Point(3, 33);  //이효리
		
		pMap.put("권상우", p01);
		pMap.put("정우성", p02);
		pMap.put("이효리", p03);
		
		System.out.println(pMap.toString());
		
		//System.out.println(pMap.get("정우성").getX());
		//System.out.println(pMap.size());
		
		//키셋 구하기
		Set<String> keySet = pMap.keySet();
		
		for(String key : keySet ) {
			System.out.println(pMap.get(key).getX());
		}
		
		
		//////////////////////////////////////////
		Map<String, String> boardMap = new HashMap<String, String>();
		
		boardMap.put("title", "게시판 제목입니다.");
		boardMap.put("regDate", "2021-12-08");
		boardMap.put("content", "게시판 내용입니다.");
		
		System.out.println(boardMap.get("title"));
		
		
	}

}