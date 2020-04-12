package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller		
public class Auth {

	@RequestMapping("/urlMan")
	public @ResponseBody String MyFun()
	{
		return "Man";
	}
	@RequestMapping("/urlHoney")
	public @ResponseBody String MyFunc()
	{
		return "Honey";
	}
}
