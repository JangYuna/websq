package com.inswave.edu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inswave.edu.dto.Insa;
import com.inswave.edu.dto.SelectInsaDTO;
import com.inswave.edu.dto.Yoo;

@Repository("testDao")
public class TestDao {
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NS = "com.inswave.edu.dao.TestDao.";
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;  
	}

	public int getYuInfo(Map sParam) {
		return sqlSession.insert(NS + "getYuInfo", sParam);
	}

	public int insertInsa(Insa insa) {
		return sqlSession.insert(NS + "insertInsa", insa);
	}

	public Insa selectInsaSabun(String insa_sabun) {
		return sqlSession.selectOne(NS + "selectSabun", insa_sabun);
	}

	public List selectInsaAll() {
		return sqlSession.selectList(NS + "selectInsaAll");
	}

	public List selectYooAll() {		
		return sqlSession.selectList(NS + "selectYooAll");
	}

	public List selectSabun(SelectInsaDTO insadto) {
		return sqlSession.selectList(NS + "selectSabunSearch", insadto);
	}

	public Map updateForm(String insa_sabun) {
		return sqlSession.selectOne(NS + "updateForm", insa_sabun);
	}

	public int memberupdate(Insa insa) {
		return sqlSession.update(NS + "memberupdate", insa);
	}

	public int memberdelete(String insa_sabun) {
		return sqlSession.delete(NS + "memberdelete", insa_sabun);
	}

	public int selectMemberTotal(SelectInsaDTO insadto) {
		return sqlSession.selectOne(NS + "selectMemberTotal", insadto);
	}

	public boolean idcheck(String insa_id) {
		if(sqlSession.selectOne(NS + "idcheck", insa_id) == null) {
			return true;
		}else {
			return false;
		}
	}


}
