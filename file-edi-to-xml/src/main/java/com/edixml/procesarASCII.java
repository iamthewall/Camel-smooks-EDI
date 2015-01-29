package com.edixml;

public class procesarASCII {	
	public String doSomething(String body)
	{		
		char caracter = 28;
		
		if(body.startsWith(caracter+"UNH") == false)
		{
			body = caracter + "UNH" + body;
		}
		body = body.concat("UNT");				
		return body;
	}
}
