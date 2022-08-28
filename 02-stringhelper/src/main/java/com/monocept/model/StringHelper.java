package com.monocept.model;

public class StringHelper {
	
	public String truncateAinFirst2Pos(String str) {
		String ans="";
		int len=str.length();
		int index=1;
		if((len==1) && str.equals("A")){
				return ans;
		}
		for(char ch:str.toCharArray()) {
			if((index==1 || index==2) && ch=='A') {
				index++;
				continue;
			}
			ans+=ch;
			index++;
		}
		
		return ans;
	}
	
	public boolean firstAndLastTwoCharSame(String str) {
		int len=str.length();
		if(len==1) {
			return true;
		}
		if(str.charAt(0)==(str.charAt(len-1))) {
			return true;
		}
		return false;
	}
}
