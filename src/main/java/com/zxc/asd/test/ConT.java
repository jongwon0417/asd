package com.zxc.asd.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConT {
	
	@GetMapping
	public String aaa() {
		return"<h1>�̰Ÿ³�</h1>";
	}
}
