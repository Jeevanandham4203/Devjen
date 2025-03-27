package com.Devjen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devjen")
public class DevjenController {
	@GetMapping("/getname")
	public String getMethodName() {
		return "hello jeeva";
	}
	
	@GetMapping("/getvalue")
	public String getvalue() {
		return "10+5 = "+15;
	}
	@GetMapping("/geteven/{a}")
	public String geteven(@PathVariable int a) {
		if(a%2==0)
			return "even";
		else
			return "odd";
	}
	@GetMapping("/palindrom/{a}")
	public String getMethodName(@PathVariable int a) {
		int store=a;
		int temp=0;
		while(a>0) {
			int b=a%10;
			temp=(temp*10)+b;
			a=a/10;
		}
		if(temp==store)
			return "This is a palindrome "+a;
		else
			return "not a palindrome"+a;
	}
	
	
}
