package com.inswave.edu.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import com.inswave.edu.dao.TestDao;
import com.inswave.edu.dto.Insa;
import com.inswave.edu.dto.SelectInsaDTO;
import com.inswave.edu.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {
	
	@Resource(name="testDao")
	private TestDao testDao;

	@Override
	public int getYuInfo(Map sParam) {
		return testDao.getYuInfo(sParam);
	}

	@Override
	public int insertInsa(Insa insa) {
		return testDao.insertInsa(insa);
	}

	@Override
	public Insa selectInsaSabun(String insa_sabun) {
		return testDao.selectInsaSabun(insa_sabun);
	}

	@Override
	public List selectInsaAll() {
		return testDao.selectInsaAll();
	}

	@Override
	public JSONObject selectYooAll() throws Exception{
		JSONObject resObj = new JSONObject();
	
		resObj.put("dc_yoo", selectSpYooAll());
		
		return resObj;
	}
	
	public List selectSpYooAll() throws Exception{
		return testDao.selectYooAll();
	}

	@Override
	public List selectSabun(SelectInsaDTO insadto) throws Exception{
		return testDao.selectSabun(insadto);
	}

	@Override
	public JSONObject updateForm(String insa_sabun) throws Exception{
		JSONObject resObj = new JSONObject();
		
		resObj.put("dc_insa", updateSpForm(insa_sabun));
		
		return resObj;
	}
	
	public Map updateSpForm(String insa_sabun) throws Exception{
		return testDao.updateForm(insa_sabun);
	}

	@Override
	public int memberupdate(Insa insa) throws Exception {
		return testDao.memberupdate(insa);
	}

	@Override
	public int memberdelete(String insa_sabun) throws Exception {
		return testDao.memberdelete(insa_sabun);
	}

	@Override
	public int selectMemberTotal(SelectInsaDTO insadto) {
		return testDao.selectMemberTotal(insadto);
	}

	@Override
	public boolean idcheck(String insa_id) throws Exception {
		return testDao.idcheck(insa_id);
	}

}
