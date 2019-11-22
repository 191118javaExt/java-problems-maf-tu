package com.revature.eval.java.personal;

import java.time.temporal.Temporal;
import java.util.List;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		System.out.println(reverse("Test"));
		System.out.println(acronym("Test for People"));
		
		System.out.println(cleanPhoneNumber("111-222-3333"));

	}
	
	public static String reverse(String string) {
		//System.out.println("reverse started");
		String holder="";
		for(int i=string.length()-1;i>=0;i--) {
			//System.out.println("looped");
			holder=holder+string.substring(i,i+1);//check later idk
			//System.out.println(holder);
		}
		return holder;
	}
	
	public static String acronym(String phrase) {
		System.out.println("acro activated");
		String holder="";
		for(int i=0;i<phrase.length();i++) {
			System.out.println(phrase.substring(i,i+1).toUpperCase()+" compared "+phrase.substring(i,i+1));
			if(!(phrase.substring(i,i+1).equals(" "))) {
				//System.out.println("passed");
				if(phrase.substring(i,i+1).toUpperCase().equals(phrase.substring(i,i+1))) {
					System.out.println("passed");
					holder=holder+phrase.substring(i,i+1);
				}
			}
		}
		return holder;
	}
	
	
	public static String cleanPhoneNumber(String string) {
		Pattern p=Pattern.compile("(\\d{3})\\D*(\\d{3})\\D*(\\d{4})");
		Matcher m=p.matcher(string);
		if(m.find()==true) {
			String ans=m.group(1)+m.group(2)+m.group(3);
			return ans;
		}
		else {
			return null;
		}
	}

}
