package com.io.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test1 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		 Test1 t1 = new  Test1();
		 //t1.fileSave();
		 t1.fileRead();
		 

	}

	private void fileRead() {
		BufferedReader br = null;
		String filename;
		FileReader fr = null;
		StringBuilder sb = new StringBuilder();
		int data;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("파일명 입력 : ");
		try {
			filename = br.readLine();
			fr = new FileReader(filename);
			
			while((data = fr.read()) != -1) {
				sb.append((char)data);
				
			}
			System.out.println(sb.toString());
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("------------ 프로그램 종료 ------------");
		
		
	}

	private void fileSave() {
		BufferedReader br = null;
		FileWriter fw = null;
	
		String name,data;
		
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파일명 입력 : ");
		try {
			name = br.readLine();
			File src = new File(name+".txt");
			fw = new FileWriter(src);
			
			while((data = br.readLine()) != null) {
				if(data.equals("exit"))
					break;
				System.out.println("파일에 저장할 내용을 입력하시오");
				fw.write(data);
				fw.write("\n");
				
				
			}
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("파일에 성공적으로 저장되었습니다.");
		
	}
	
	
	

}
