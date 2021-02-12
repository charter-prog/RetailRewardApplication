package com.patil.springboot.Controller;


import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.patil.springboot.Entity.TransactionRewards;
import com.patil.springboot.Service.CustomerService;

@RestController
@RequestMapping("/CustomerReward")
public class CustomerController {
	@Autowired
	private CustomerService studentService;
	
	@RequestMapping(value = "/getRewardPoints", method = RequestMethod.GET)
	public Collection<TransactionRewards> getAllRewardPoints() {
		
		return studentService.getAllRewards();
	}
	
}
