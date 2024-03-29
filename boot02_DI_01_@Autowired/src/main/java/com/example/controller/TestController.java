package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.TestService;

@RestController//(@Controller+@ResponseBody)
public class TestController {
	
	@Autowired
	TestService tService;
	
	@GetMapping("/aaa")
	public String hello() {
		return "HelloWorld";
	}
	
	@GetMapping("/bbb")
	public List<String> bbb(){
		System.out.println("뭐지");
		return tService.list();
	}
	
	@GetMapping("/ccc")
	public String good(){
		return "good!";
	}
	
	@GetMapping("/ddd")
	public String soGood(){
		return "good!";
	}
	
	@GetMapping("/fff")
	public String yes(){
		return "verygood!";
	}
	
	@GetMapping("/eee")
	public String gogo(){
		return "gogo!";
	}
	
	@GetMapping("/aaaaa")
	public String hahah(){
		return "hahah!";
	}
	
	@GetMapping("/aaaaa")
	public String bbbh(){
		return "hb!";
	}
	
	@GetMapping("/zzzz")
	public String bbbhzz(){
		return "hzzb!";
	}
	
	@GetMapping("/aaa")
	public String aaa(){
		return "hzzb!";
	}
	
	@GetMapping("/bbb")
	public String bbbb(){
		return "bbb!";
	}
	
	@GetMapping("/cccc")
	public String cccc(){
		return "cccc!";
	}
	
	@GetMapping("/dddd")
	public String dddd(){
		return "dddd!";
	}
	
	@GetMapping("/eeee")
	public String eeee(){
		return "eeee!";
	}
	
	@GetMapping("/eeee22222")
	public String eeee22222(){
		return "eeee222222!";
	}
}
