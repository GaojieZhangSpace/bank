package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Curr;

@Mapper
public interface CurrMapper {
  
  List<Curr> getAll();
  
  List<Curr> getById(String c_id);
}
