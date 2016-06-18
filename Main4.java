package com.orilore.dk.test1;
import java.util.*;
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar t =  Calendar.getInstance();
		t.set(1994,8,02);
		Date t1= t.getTime();
		System.out.println(t1.getTime());
Date time = new Date();
System.out.println(time.getTime());
double sum = time.getTime()-t1.getTime();
double day = sum/1000/60/60/24;
System.out.println(day);
	}

	

}
