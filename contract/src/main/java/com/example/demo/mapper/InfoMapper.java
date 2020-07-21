package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.*;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InfoMapper {
	
  Info getById(String cn);
	
  List<Info> getInfo(String cn,String date);
  
  List<Info> getAll();
  
  int addInfo(Info entity);
  
  int deleteInfo(String cn);
  
  int editInfo(Info entity);
  
  int deleteAll();
}
