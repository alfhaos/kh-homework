package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.vip;
import member.model.vo.vvip;

public class MemberManager {
	
	private static final int max = 10;
	int Silvercount = 0;
	int Goldcount = 0;
	int Vipcount,Vvipcount = 0;
	String information = "---------------------------<<회원정보>>---------------------------\n"
			+ "이름\t등급\t포인트\t이자포인트\n"
			+ "-----------------------------------------------------------------";
	Silver[] sl = new Silver[max];
	Gold[] gl = new Gold[max];
	vip[] vi = new vip[max];
	vvip[] vvi = new vvip[max];
	
	
	public void silverInsert(Silver si) {
		sl[Silvercount] = si;
		Silvercount++;
		
	}
	
	public void goldInsert(Gold gi) {
		gl[Goldcount] = gi;
		Goldcount++;
	}
	
	public void vipInsert(vip vp) {
		vi[Vipcount] = vp;
		Vipcount++;
	}
	
	public void VvipInsert(vvip Vvp) {
		vvi[Vvipcount] = Vvp;
		Vvipcount++;
	}
	
	public void printData() {
		
		System.out.println(information);
		for(int i = 0 ; i < Silvercount ; i++) {
			System.out.println(sl[i].getName() + " \t" + sl[i].getGrade() + " \t" + sl[i].getNormalPoint() + " \t" + sl[i].getPoint());
			
		}
		for(int j = 0 ; j < Goldcount ; j++) {
			System.out.println(gl[j].getName() + " \t" + gl[j].getGrade() + " \t" +gl[j].getNormalPoint() + " \t" + gl[j].getPoint());		
		}
		System.out.println("---------------------------<<vip,Vvip>>---------------------------");
		for(int k = 0 ; k < Vipcount ; k++) {
			System.out.println(vi[k].getName() + " \t" + vi[k].getGrade() + " \t" +vi[k].getNormalPoint() + " \t" + vi[k].getPoint());		
		}
		for(int l = 0 ; l < Vvipcount ; l++) {
			System.out.println(vvi[l].getName() + " \t" + vvi[l].getGrade() + " \t" +vvi[l].getNormalPoint() + " \t" + vvi[l].getPoint());		
		}
		
	}
}
