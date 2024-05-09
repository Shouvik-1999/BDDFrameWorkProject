package com.tutorialsninja.utils;

import java.util.Date;

public class Utilities {
	public static String createRandomEmailAddr() {
		  Date date=new Date();
		  String email=date.toString().replace(" ","-").replace(":", "-")+"@gmail.com";
		  return email;
		}
}
