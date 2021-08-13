package com.collection.list.music.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.collection.list.music.model.vo.Music;


public class MusicManger {
	
	private ArrayList<Music> musicList = new ArrayList<Music>();

	{
		 musicList.add(new Music("썸탈거야","볼사"));
		 musicList.add(new Music("교통정리","헤이즈"));
		 musicList.add(new Music("댄싱카툰","볼사"));
		 musicList.add(new Music("마리골드","아이묭"));
		 musicList.add(new Music("사랑했나봐","윤도현"));
		 musicList.add(new Music("사랑했나봐","아이유"));
	}
	
	
	public List<Music> selectList(){
		
		return musicList;
	}
	
	public void addList(Music m) {
		
		musicList.add(m);
	}
	public void addAtZero(Music m) {
		musicList.add(0, m);
	}
	
	public boolean removeMusic(String name) {
		int count = 0;
		for(Music m : musicList) {
			if(name.equals(m.getTitle())) {
				musicList.remove(count);
				return true;
			}
			count++;
		}
		
		return false;
	}
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		String oldname = oldMusic.getTitle();
		String oldsinger = oldMusic.getSinger();
		int count = 0;
		for(Music m : musicList) {
			if(m.getTitle().equals(oldname) && m.getSinger().equals(oldsinger)) {
				musicList.set(count, newMusic);
				return true;
			}
			count++;
		}
		
		return false;
	}
	
	public List<Music> searchMusicByTitle(String title){

		ArrayList<Music> smbList = new ArrayList<Music>();

		for(Music m : musicList) {
			if(title.equals(m.getTitle())) {
				smbList.add(m);
			}
		}
		if(smbList.isEmpty())
			System.out.println("검색결과가 없습니다.");
		
		return smbList;
	}
	
	public List<Music> searchMusicBySinger(String singer){
		
		ArrayList<Music> SingerList = new ArrayList<Music>();

		for(Music m : musicList) {
			if(singer.equals(m.getSinger())) {
				SingerList.add(m);
			}
		}
		if(SingerList.isEmpty())
			System.out.println("검색결과가 없습니다.");
		
		return SingerList;
		
	}
	public List<Music> orderBy(Comparator<Music> c){
		musicList.sort(c); 
		
		return musicList;
	}
	
	
}
