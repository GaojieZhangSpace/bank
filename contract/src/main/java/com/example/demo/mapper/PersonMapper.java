package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Info;
import com.example.demo.model.Person;

@Mapper
public interface PersonMapper {
 int addPerson(Person entity);
}
