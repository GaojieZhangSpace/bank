package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.BaseModel;
import com.example.demo.service.InfoService;
import com.example.demo.model.Info;

@Controller
public class InfoController extends BaseController {
  
	@Autowired
	private InfoService infoService;
	
	
	
	@ResponseBody
	@RequestMapping(value = "/getAll")
	public BaseModel getAll() {
		return makeModel(SUCC_CODE, MSG_SUCC, infoService.getAll());
	}
	
	@ResponseBody
	@RequestMapping(value = "/getById")
	public BaseModel getById(String id) {
		return makeModel(SUCC_CODE, MSG_SUCC, infoService.getById(id));
	}
	
	@ResponseBody
	@RequestMapping(value = "/getInfo")
	public BaseModel getInfo(String cn,String date) {
		return makeModel(SUCC_CODE, MSG_SUCC, infoService.getInfo(cn,date));
	}
	
	@ResponseBody
	@RequestMapping(value = "/addInfo")
	public BaseModel addInfo(Info model) {
		
		int code=infoService.addInfo(model);
		if (code==0) {
			return makeModel(code, MSG_ADD_ERROR);
		} else {
			return makeModel(code, MSG_ADD_SUCC);
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/deleteInfo")
	public BaseModel deleteInfo(String id) {
		int code=infoService.deleteInfo(id);
		if (code==0) {
			return makeModel(code, MSG_DELETE_ERROR);
		} else {
			return makeModel(code, MSG_DELETE_SUCC);
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/editInfo")
	public BaseModel editInfo(Info model) {
		int code=infoService.editInfo(model);
		if(code==0) {
			return makeModel(code, MSG_UPDATE_ERROR);
		}else {
			return makeModel(code, MSG_UPDATE_SUCC);
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/deleteAll")
	public BaseModel deleteAll() {
		int code=infoService.deleteAll();
		if(code==0) {
			return makeModel(code, MSG_DELETE_ERROR);
		}else {
			return makeModel(code, MSG_DELETE_SUCC);
		}
	}
	
	
}
