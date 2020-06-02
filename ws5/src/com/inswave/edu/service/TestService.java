package com.inswave.edu.service;

import java.util.List;

import java.util.Map;

import org.json.simple.JSONObject;

import com.inswave.edu.dto.Insa;
import com.inswave.edu.dto.SelectInsaDTO;
import com.inswave.edu.dto.Yoo;

public interface TestService {

	public int getYuInfo(Map sParam);

	public int insertInsa(Insa insa);

	public Insa selectInsaSabun(String insa_sabun);

	public List selectInsaAll();

	public JSONObject selectYooAll() throws Exception;

	public List selectSabun(SelectInsaDTO insadto) throws Exception;

	public JSONObject updateForm(String insa_sabun) throws Exception;

	public int memberupdate(Insa insa) throws Exception;

	public int memberdelete(String insa_sabun) throws Exception;

	public int selectMemberTotal(SelectInsaDTO insadto) throws Exception;

	public boolean idcheck(String insa_id) throws Exception;

}
