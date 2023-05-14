package com.bosch.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestAPI {
 @GetMapping("/welcome")
	public String getMsg() {
		String msg="Welcome to Rober Bosch!!!";
		return msg;
	}
   
 @GetMapping("/loan")
    public String getLoan() {
    	String loan="Here is your loan amount";
    	return loan;
    }
 @GetMapping("/contact")
   public String contactUs() {
	   String contact="hereis my contact detail";
	  return contact;
   }
}
