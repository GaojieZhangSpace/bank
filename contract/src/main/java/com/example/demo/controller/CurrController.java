package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.BaseModel;
import com.example.demo.service.CurrService;

@Controller
public class CurrController extends BaseController {
	
	@Autowired
	private CurrService currService;
	
	@ResponseBody
	@RequestMapping(value = "/getAllCurr")
	public BaseModel getAll() {
		return makeModel(SUCC_CODE,MSG_SUCC,currService.getAll());
	}
	
	@ResponseBody
	@RequestMapping(value = "/getOneCurr")
	public BaseModel getById(String c_id) {
		return makeModel(SUCC_CODE, MSG_SUCC, currService.getById(c_id));
	}
}
