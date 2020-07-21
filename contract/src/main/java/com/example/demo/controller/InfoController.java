package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.BaseModel;
import com.example.demo.service.InfoService;
import com.example.demo.model.Info;
import com.example.demo.model.Person;

@Controller
public class InfoController extends BaseController {
  
	@Autowired
	private InfoService infoService;
	@Autowired
	private Person person;
	
	@ResponseBody
	@RequestMapping(value = "/getAll")
	public BaseModel getAll() {
		return makeModel(SUCC_CODE, MSG_SUCC, infoService.getAll());
	}
	
	@ResponseBody
	@RequestMapping(value = "/getById")
	public BaseModel getById(String cn) {
		return makeModel(SUCC_CODE, MSG_SUCC, infoService.getById(cn));
	}
	
	@ResponseBody
	@RequestMapping(value = "/getInfo")
	public BaseModel getInfo(String cn,String date) {
		return makeModel(SUCC_CODE, MSG_SUCC, infoService.getInfo(cn,date));
	}
	
	@ResponseBody
	@RequestMapping(value = "/addInfo")
	public BaseModel addInfo(Info model) {
		String r=model.getCn();
		person.setRecord(r);
		person.setBorrower(model.getBorrower());
		person.setLender(model.getLender());
		person.setbAgent(model.getbAgent());
		person.setlAgent(model.getlAgent());
		person.setbPlace(model.getbPlace());
		person.setlPlace(model.getlPlace());
		person.setbTel(model.getbTel());
		person.setlTel(model.getbTel());
	    person.setbIsCom(model.getbIsCom());
	    person.setlIsCom(model.getlIsCom());
		model.setPerson(person);
		int code=infoService.addInfo(model);
		
		if (code==0) {
			return makeModel(code, MSG_ADD_SUCC);
		} else {
			return makeModel(code, MSG_ADD_ERROR);
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/deleteInfo")
	public BaseModel deleteInfo(String cn) {
		int code=infoService.deleteInfo(cn);
		if (code==0) {
			return makeModel(code, MSG_DELETE_SUCC);
		} else {
			return makeModel(code, MSG_DELETE_ERROR );
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/editInfo")
	public BaseModel editInfo(Info model) {
		int code=infoService.editInfo(model);
		if(code==0) {
			return makeModel(code, MSG_UPDATE_SUCC);
		}else {
			return makeModel(code, MSG_UPDATE_ERROR);
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/deleteAll")
	public BaseModel deleteAll() {
		int code=infoService.deleteAll();
		if(code==0) {
			return makeModel(code, MSG_DELETE_SUCC);
		}else {
			return makeModel(code, MSG_DELETE_ERROR);
		}
	}
	
	
}
