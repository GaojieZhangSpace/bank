package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.CurrMapper;
import com.example.demo.model.Curr;

@Service
public class CurrService {
	@Resource
	CurrMapper currMapper;
	
	public List<Curr> getAll(){
		return currMapper.getAll();
	}
	
	public List<Curr> getById(String c_id){
		return currMapper.getById(c_id);
	}
}
