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
	
	
	public void silverInsert(Silver sl) {
		this.sl[Silvercount] = sl;
		Silvercount++;
		
	}
	
	public void goldInsert(Gold gl) {
		this.gl[Goldcount] = gl;
		Goldcount++;
	}
	
	public void vipInsert(vip vi) {
		this.vi[Vipcount] = vi;
		Vipcount++;
	}
	
	public void VvipInsert(vvip vvi) {
		this.vvi[Vvipcount] = vvi;
		Vvipcount++;
	}
	
	public void printData() {
		
		System.out.println(information);
		for(int i = 0 ; i < Silvercount ; i++) {
			System.out.println(sl[i].getName() + " \t" + sl[i].getGrade() + " \t" + sl[i].getPoint() + " \t" + sl[i].getEjaPoint());
			
		}
		for(int j = 0 ; j < Goldcount ; j++) {
			System.out.println(gl[j].getName() + " \t" + gl[j].getGrade() + " \t" +gl[j].getPoint() + " \t" + gl[j].getEjaPoint());		
		}
		System.out.println("---------------------------<<vip,Vvip>>---------------------------");
		for(int k = 0 ; k < Vipcount ; k++) {
			System.out.println(vi[k].getName() + " \t" + vi[k].getGrade() + " \t" +vi[k].getPoint() + " \t" + vi[k].getEjaPoint());		
		}
		for(int l = 0 ; l < Vvipcount ; l++) {
			System.out.println(vvi[l].getName() + " \t" + vvi[l].getGrade() + " \t" +vvi[l].getPoint() + " \t" + vvi[l].getEjaPoint());		
		}
		
	}
}
