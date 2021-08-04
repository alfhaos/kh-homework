package member.controller;

import member.model.vo.Gold;
import member.model.vo.Member;
import member.model.vo.Silver;
import member.model.vo.vip;
import member.model.vo.vvip;

public class MemberManager {
	
	private static final int max = 40;
	int count = 0;
	
	String information = "---------------------------<<회원정보>>---------------------------\n"
			+ "이름\t등급\t포인트\t이자포인트\n"
			+ "-----------------------------------------------------------------";
	Member[] arr = new Member[max];

	
	public void insertMember(Member m ) {
		arr[count] = m;
		count++;
	}
	
	public void printData() {
		
		System.out.println(information);
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == null)
				break;
			Member mb = arr[i];
			System.out.println(mb.toString());
			
		}
		
	}
}
