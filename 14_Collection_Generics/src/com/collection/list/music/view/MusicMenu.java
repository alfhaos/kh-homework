package com.collection.list.music.view;


import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.collection.list.music.controller.MusicManger;
import com.collection.list.music.model.vo.Music;

public class MusicMenu {
	Scanner sc = new Scanner(System.in);
	MusicManger manager = new MusicManger();
	

	public MusicMenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void MusicMenurun() {
		
		
		mm:
		while(true) {
			printmenu();
			int n = sc.nextInt();
			
			
			switch(n) {
			case 1: 
				System.out.println(manager.selectList());
				break;
			case 2: 
				manager.addList(inputMusic());
				break;
			case 3: 
				manager.addAtZero(inputMusic());
				break;
			case 4: 
				System.out.println(manager.removeMusic(inputTitle()) ? "삭제 성공" : "삭제 실패");
				break;
			case 5: 
				boolean bl = manager.replaceMusic(inputMusic(),inputMusic());
				System.out.println(bl ? "교체 성공" : "교체 실패");
				break;
			case 6: 
				System.out.println(manager.searchMusicByTitle(inputTitle()));
				break;
			case 7: 
				System.out.println(manager.searchMusicBySinger(inputSinger()));
				break;
			case 8: 
				System.out.println("================== 정렬 메뉴 ===================\r\n"
						+ "1. 가수명 오름차순\r\n"
						+ "2. 가수명 내림차순\r\n"
						+ "3. 곡명 오름차순\r\n"
						+ "4. 곡명 내림차순\r\n"
						+ "5. 메인메뉴 돌아가기\r\n"
						+ "===============================================\n"
						+" >> 정렬 선택 : ");
				int order = sc.nextInt();
				switch(order) {
				case 1 : 
					Comparator<Music> comp1 = new singerorder();
					System.out.println(manager.orderBy(comp1));
					break;
				case 2 : 
					Comparator<Music> comp2 = Collections.reverseOrder(new singerorder());
					System.out.println(manager.orderBy(comp2));
					break;
				case 3 : 
					Comparator<Music> comp3 = new titleorder();
					System.out.println(manager.orderBy(comp3));
					break;
				case 4 : 
					Comparator<Music> comp4 = Collections.reverseOrder(new titleorder());
					System.out.println(manager.orderBy(comp4));
					break;
				case 5 : 
		
					continue;
	
				}
				break;
			case 0: 
				break mm;
				
			default :
				System.out.println("번호를 입력하세요.");
				continue mm;
			}
			
		}
		
	}
	public void printmenu() {
		 String menu = "================ Music Playlist Menu ================\r\n"
				+ "1.목록보기\r\n"
				+ "2.마지막에 음악추가\r\n"
				+ "3.맨처음에 음악추가\r\n"
				+ "4.곡삭제\r\n"
				+ "5.곡변경\r\n"
				+ "6.곡명검색\r\n"
				+ "7.가수검색\r\n"
				+ "8.목록정렬(곡명오름차순)\r\n"
				+ "0.종료\r\n"
				+ "================================================================\r\n"
				+ ">> 메뉴선택 : ";
		System.out.print(menu);
	}
	
	public String inputTitle() {
		System.out.println("곡명 입력 : ");
		String title = sc.next();
		return title;
	}
	
	public String inputSinger() {
		System.out.println("가수 입력 : ");
		String singer = sc.next();
		return singer;
	}
	
	public Music inputMusic() {
		System.out.println("곡명 입력 : ");
		String title = sc.next();
		System.out.println("가수 입력 : ");
		String singer = sc.next();
		
		return new Music(title,singer);
	}

	static class singerorder implements Comparator<Music>{
		
		/**
		 * name필드값 비교
		 * - s1.name < s2.name : -1
		 * - s1.name = s2.name : 0
		 * - s1.name > s2.name : 1
		 * 
		 * 
		 * 	name : String의 기본연산 compareTo
		 * 
		 */
		@Override
		public int compare(Music o1, Music o2) {
			// TODO Auto-generated method stub
			return o1.getSinger().compareTo(o2.getSinger());
		}
	}
	static class titleorder implements Comparator<Music>{
		
		/**
		 * name필드값 비교
		 * - s1.name < s2.name : -1
		 * - s1.name = s2.name : 0
		 * - s1.name > s2.name : 1
		 * 
		 * 
		 * 	name : String의 기본연산 compareTo
		 * 
		 */
		@Override
		public int compare(Music o1, Music o2) {
			// TODO Auto-generated method stub
			return o1.getTitle().compareTo(o2.getTitle());
		}
	}

	
}
