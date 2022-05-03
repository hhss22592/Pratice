package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.TestDAO;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	TestDAO dao;
	
	@Override
	public List<String> list() {
		return dao.list();
	}
	
	
}
