package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.InfoMapper;
import com.example.demo.model.Info;

@Service
public class InfoService {
	@Resource
	InfoMapper infoMapper;

	
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
		int code = infoMapper.addInfo(entity);
        return code;
	}
	
	public int deleteInfo(String id) {
		int code=infoMapper.deleteInfo(id);
		return code;
	}
	
	public int editInfo(Info entity) {
		int code=infoMapper.editInfo(entity);
		return code;
	}
	
	public int deleteAll() {
		int code=infoMapper.deleteAll();
		return code;
	}
	
}
