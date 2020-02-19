package com.example.Helloworld;

import org.springframework.stereotype.Component;
@Component
public class Bikini implements OutFit{
	@Override
public void wear() {
	System.out.println("Em đang mặc Bikini");
}; 
}
