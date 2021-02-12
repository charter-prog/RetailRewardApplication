package com.patil.springboot.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patil.springboot.Dao.CustomerRewardDao;
import com.patil.springboot.Entity.CustomerReward;
import com.patil.springboot.Entity.Transaction;
import com.patil.springboot.Entity.TransactionRewards;

@Service
public class CustomerService {
	@Autowired
	private CustomerRewardDao customerRewardDao;
	
	public Collection<TransactionRewards> getAllRewards() {
		
		return customerRewardDao.getAllRewards();
		
		
		
		
		
	}
	
}
