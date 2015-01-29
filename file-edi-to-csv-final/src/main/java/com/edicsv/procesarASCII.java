package com.edicsv;

public class procesarASCII {	
	public String doSomething(String body)
	{		
		body = body
				.replaceAll("[^\\p{L}\\p{Nd}]", ",")
				.replaceAll("UNH+", "")
				.replaceAll(",UNT", "\r\n")
				.replaceAll("\r\n,", "\r\n")								
				.substring(1);
		return body;
	}
}
