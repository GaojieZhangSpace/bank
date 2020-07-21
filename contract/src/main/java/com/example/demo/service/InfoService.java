package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.InfoMapper;
import com.example.demo.mapper.PersonMapper;
import com.example.demo.model.Info;

@Service
public class InfoService {
	@Resource
	InfoMapper infoMapper;
	
	@Resource
	PersonMapper personMapper;
	
	
	public List<Info> getAll() {
		List<Info> list= infoMapper.getAll();
		
		for(int i=0;i<list.size();i++) {
			Info info = list.get(i);
			String cnum=info.getCurrency(); 
			if (cnum.equals("1")) { 
				info.setCurrency("人民币"); 
			}
			else if(cnum.equals("2")) { 
				info.setCurrency("美元"); 
			}
		}
		return list;
	}
	
	public Info getById(String id){
		Info info=infoMapper.getById(id);
		
		return info;
		
	}
	
	public List<Info> getInfo(String cn,String date) {
		List<Info> list=infoMapper.getInfo(cn, date);
		for(Info info:list) {
			String cnum=info.getCurrency();
			if (cnum.equals("1")) {
				info.setCurrency("人民币");
			} else if(cnum.equals("2")){
				info.setCurrency("美元");
			}
		}
		return list;
	}
	
	public int addInfo(Info entity) {
		 int code = 0;
		try {
			infoMapper.addInfo(entity);
			personMapper.addPerson(entity.getPerson());
			
			
		} catch (Exception e) {
		  code=1;
		}
        return code;
	}
	
	public int deleteInfo(String cn) {
		int code=0;
		try {
			infoMapper.deleteInfo(cn);
		} catch (Exception e) {
			// TODO: handle exception
			code=1;
		}
		return code;
	}
	
	public int editInfo(Info entity) {
		int code=0;
		try {
		     infoMapper.editInfo(entity);
		} catch (Exception e) {
			// TODO: handle exception
			code=1;
		}
		return code;
	}
	
	public int deleteAll() {
		int code=0;
		try {
			infoMapper.deleteAll();
		} catch (Exception e) {
			// TODO: handle exception
			code=1;
		}
		return code;
	}
	
}
