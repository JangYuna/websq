package com.inswave.edu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.inswave.edu.dto.Insa;
import com.inswave.edu.dto.SelectInsaDTO;
import com.inswave.edu.service.TestService;
import com.inswave.edu.util.EduUtils;

@RestController
public class TestController {
	
	@Resource(name = "testService")
	private TestService testService;
	
	@RequestMapping(value="/insa/test.do")
	public void test (@RequestBody(required = false) Map param) {
		Map resObj = new HashMap();
		Map sParam = null;
		try {
			if(param == null){
				throw new RuntimeException("필수 파라메터가 누락되었습니다.");
			}
			sParam = (Map)param.get("yu");
			if(sParam == null || sParam.get("yu") == null){
				throw new RuntimeException("필수 파라메터가 누락되었습니다.");
			}
			testService.getYuInfo(sParam);
//			resObj.put("dc_userInfo", testService.getYuInfo(sParam));
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@RequestMapping(value="/insa/insert.do")
	public void insaInsert (@RequestBody(required = false) Map param, Insa insa) {
		Map resObj = new HashMap();
		Map sParam = null;
		String insa_join_day = null;
		String insa_retire_day = null;
		String insa_put_yn = null;
		String insa_name = null;
		String insa_reg_no = null;
		String insa_eng_name = null;
		String insa_phone = null;
		String insa_hp = null;
		String insa_pos_gbn_code = null;
		String insa_cmp_reg_no = null;
		String insa_gender = null;
		String insa_years = null;
		String insa_email = null;
		String insa_zip = null;
		String insa_addr1 = null;
		String insa_addr2 = null;
		String insa_dept_code = null;
		String insa_join_gbn_code = null;
		String insa_id = null;
		String insa_pwd = null;
		String insa_salary = null;
		String insa_kosa_reg_yn = null;
		String insa_kosa_class_code = null;
		String insa_mil_yn = null;
		String insa_mil_type = null;
		String insa_mil_level = null;
		String insa_mil_startdate = null;
		String insa_mil_enddate = null;
		String insa_join_type = null;
		String insa_gart_level = null;
		String insa_self_intro = null;
		String insa_crm_name = null;
		String insa_profile = null;
		
		String insa_cmp_reg_image = null;
		String insa_carrier = null;
		
//		ArrayList<String> arrayList1 = null;
//		String[] insa_cmp_reg_image = null;
//		ArrayList<String> arrayList2 = null;
//		String[] insa_carrier = null;
		
		try {
			if(param == null){
				throw new RuntimeException("필수 파라메터가 누락되었습니다.");
			}
			sParam = (Map)param.get("insa");
			
//			if(sParam.get("INSA_CMP_REG_IMAGE") != "") {
//				arrayList1 = new ArrayList<>();
//				arrayList1 = (ArrayList)sParam.get("INSA_CMP_REG_IMAGE");
//				
//				insa_cmp_reg_image = new String[arrayList1.size()];
//				int size1 = 0;			
//				for(String temp : arrayList1) {
//					insa_cmp_reg_image[size1++]=temp;
//				}
//				insa.setInsa_cmp_reg_image(insa_cmp_reg_image[0]);
//			}else {
//				insa.setInsa_cmp_reg_image("");
//			}
//			
//			if(sParam.get("INSA_CARRIER") != "") {
//				arrayList2 = new ArrayList<>();
//				arrayList2 = (ArrayList)sParam.get("INSA_CARRIER");
//				
//				insa_carrier = new String[arrayList2.size()];
//				int size2 = 0;
//				for(String temp : arrayList2) {
//					insa_carrier[size2++]=temp;
//				}
//				insa.setInsa_carrier(insa_carrier[0]);
//			}else {
//				insa.setInsa_carrier("");
//			}
			
			insa_cmp_reg_image = (String)sParam.get("INSA_CMP_REG_IMAGE");
			insa_carrier = (String)sParam.get("INSA_CARRIER");
			
			insa_join_day = (String)sParam.get("INSA_JOIN_DAY");
			insa_retire_day = (String)sParam.get("INSA_RETIRE_DAY");
			insa_put_yn = (String)sParam.get("INSA_PUT_YN");
			insa_name = (String)sParam.get("INSA_NAME");
			insa_reg_no = (String)sParam.get("INSA_REG_NO");
			insa_eng_name = (String)sParam.get("INSA_ENG_NAME");
			insa_phone = (String)sParam.get("INSA_PHONE");
			insa_hp = (String)sParam.get("INSA_HP");
			insa_pos_gbn_code = (String)sParam.get("INSA_POS_GBN_CODE");
			insa_cmp_reg_no = (String)sParam.get("INSA_CMP_REG_NO");
			insa_gender = (String)sParam.get("INSA_GENDER");
			insa_years = String.valueOf(sParam.get("INSA_YEARS"));
			insa_email = (String)sParam.get("INSA_EMAIL1") + (String)sParam.get("INSA_EMAIL2");
			insa_zip = (String)sParam.get("INSA_ZIP");
			insa_addr1 = (String)sParam.get("INSA_ADDR1");
			insa_addr2 = (String)sParam.get("INSA_ADDR2");
			insa_dept_code = (String)sParam.get("INSA_DEPT_CODE");
			insa_join_gbn_code = (String)sParam.get("INSA_JOIN_GBN_CODE");
			insa_id = (String)sParam.get("INSA_ID");
			insa_pwd = (String)sParam.get("INSA_PWD");
			insa_salary = (String)sParam.get("INSA_SALARY");
			insa_kosa_reg_yn = (String)sParam.get("INSA_KOSA_REG_YN");
			insa_kosa_class_code = (String)sParam.get("INSA_KOSA_CLASS_CODE");
			insa_mil_yn = (String)sParam.get("INSA_MIL_YN");
			insa_mil_type = (String)sParam.get("INSA_MIL_TYPE");
			insa_mil_level = (String)sParam.get("INSA_MIL_LEVEL");
			insa_mil_startdate = (String)sParam.get("INSA_MIL_STARTDATE");
			insa_mil_enddate = (String)sParam.get("INSA_MIL_ENDDATE");
			insa_join_type = (String)sParam.get("INSA_JOIN_TYPE");
			insa_gart_level = (String)sParam.get("INSA_GART_LEVEL");
			insa_self_intro = (String)sParam.get("INSA_SELF_INTRO");
			insa_crm_name = (String)sParam.get("INSA_CRM_NAME");
			insa_profile = (String)sParam.get("INSA_PROFILE");
			
			insa.setInsa_cmp_reg_image(insa_cmp_reg_image);
			insa.setInsa_carrier(insa_carrier);
			
			insa.setInsa_join_day(insa_join_day);
			insa.setInsa_retire_day(insa_retire_day);
			insa.setInsa_put_yn(insa_put_yn);
			insa.setInsa_name(insa_name);
			insa.setInsa_reg_no(insa_reg_no);
			insa.setInsa_eng_name(insa_eng_name);
			insa.setInsa_phone(insa_phone);
			insa.setInsa_hp(insa_hp);
			insa.setInsa_pos_gbn_code(insa_pos_gbn_code);
			insa.setInsa_cmp_reg_no(insa_cmp_reg_no);
			insa.setInsa_gender(insa_gender);
			insa.setInsa_years(insa_years);
			insa.setInsa_email(insa_email);
			insa.setInsa_zip(insa_zip);
			insa.setInsa_addr1(insa_addr1);
			insa.setInsa_addr2(insa_addr2);
			insa.setInsa_dept_code(insa_dept_code);
			insa.setInsa_join_gbn_code(insa_join_gbn_code);
			insa.setInsa_id(insa_id);
			insa.setInsa_pwd(insa_pwd);
			insa.setInsa_salary(insa_salary);
			insa.setInsa_kosa_reg_yn(insa_kosa_reg_yn);
			insa.setInsa_kosa_class_code(insa_kosa_class_code);
			insa.setInsa_mil_yn(insa_mil_yn);
			insa.setInsa_mil_type(insa_mil_type);
			insa.setInsa_mil_level(insa_mil_level);
			insa.setInsa_mil_startdate(insa_mil_startdate);
			insa.setInsa_mil_enddate(insa_mil_enddate);
			insa.setInsa_join_type(insa_join_type);
			insa.setInsa_gart_level(insa_gart_level);
			insa.setInsa_self_intro(insa_self_intro);
			insa.setInsa_crm_name(insa_crm_name);
			insa.setInsa_profile(insa_profile);
			
			System.out.println("insa:"+sParam);
			System.out.println("insa2:"+insa);
			
			int result = testService.insertInsa(insa);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "memberupdateForm.do")
	public ModelAndView memberupdateForm(@RequestBody(required = false) Map param, Insa insa) {
		Map resObj = new HashMap();
		Map sParam = null;
		String insa_sabun = null;
		
		ModelAndView mv = new ModelAndView();
		
		try {
			if(param == null){
				throw new RuntimeException("필수 파라메터가 누락되었습니다.");
			}
			sParam = (Map)param.get("dc_reqSabun");
			
			insa_sabun = (String)sParam.get("INSA_SABUN");
			
			Insa detailInsa = testService.selectInsaSabun(insa_sabun);
			
			String allEmail = detailInsa.getInsa_email();
			
			System.out.println("email:"+allEmail);
			
			String[] email = allEmail.split("@");
			String email1 = email[0];
			String email2 = "@"+email[1];
			
			System.out.println("detailInsa:" + detailInsa);
				
			mv.addObject("insa", detailInsa);
			mv.addObject("email1", email1);
			mv.addObject("email2", email2);
			mv.setViewName("sawon_update");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return mv;		
	}
	
	@RequestMapping(value = "/insa/search.do", method = RequestMethod.POST)
	public Map select_insa(@RequestBody(required = true) Map param) throws Exception{
		Map resObj = new HashMap();
		Map sParam = null;
		Map pageParam = null;
		String insa_sabun = null;
		String insa_name = null;
		String insa_join_type = null;
		String insa_put_yn = null;
		String insa_pos_gbn_code = null;
		String insa_join_day = null;
		String insa_retire_day = null;
		String insa_join_gbn_code = null;
		
		int sPage = 0;
		int sCount = 0;
		int startNum = 0;
		int endNum = 0;
		int totCount = 0;
		
		try {
			sParam = (Map)param.get("req_insa");
			pageParam = (Map)param.get("dma_SearchParam");
			if (sParam == null) {
				throw new RuntimeException("필수 파라메터가 누락되었습니다.");
			}
			System.out.println("sParam:"+sParam);
			
			sPage = EduUtils.getInt(pageParam.get("page"));
			sCount = 5;
			
			insa_sabun = (String)sParam.get("INSA_SABUN");
			insa_name = (String)sParam.get("INSA_NAME");
			insa_join_type = (String)sParam.get("INSA_JOIN_TYPE");
			insa_put_yn = (String)sParam.get("INSA_PUT_YN");
			insa_pos_gbn_code = (String)sParam.get("INSA_POS_GBN_CODE");
			insa_join_day = (String)sParam.get("INSA_JOIN_DAY");
			insa_retire_day = (String)sParam.get("INSA_RETIRE_DAY");
			insa_join_gbn_code = (String)sParam.get("INSA_JOIN_GBN_CODE");
					
			SelectInsaDTO insadto = new SelectInsaDTO();
			insadto.setInsa_sabun(insa_sabun);
			insadto.setInsa_name(insa_name);
			insadto.setInsa_join_type(insa_join_type);
			insadto.setInsa_put_yn(insa_put_yn);
			insadto.setInsa_pos_gbn_code(insa_pos_gbn_code);
			insadto.setInsa_join_day(insa_join_day);
			insadto.setInsa_retire_day(insa_retire_day);
			insadto.setInsa_join_gbn_code(insa_join_gbn_code);
			
			totCount = testService.selectMemberTotal(insadto);
			System.out.println("totCoutn:"+totCount);
			
			startNum = (sPage-1)*sCount+1;
			endNum = sPage * sCount;
			
			if(startNum > totCount){
				throw new Exception("최대 데이터를 초과하였습니다.");
			}
			
			pageParam.put("startNum", startNum );
			
			if(endNum > totCount){
				pageParam.put("endNum", totCount);
			}else{
				pageParam.put("endNum", endNum);
			}
			
			pageParam.put("totalCount", totCount);
			
			pageParam.put("page", sPage);
			pageParam.put("count", sCount);
			
			resObj.put("dma_SearchResult", pageParam);
			
			insadto.setPage(sPage);
			insadto.setCount(sCount);
			insadto.setStartNum(startNum);
			insadto.setEndNum(endNum);
			insadto.setTotCount(totCount);
			
			//resObj = testService.selectSabun(insadto);
			resObj.put("insa", testService.selectSabun(insadto));
			System.out.println("resObj:"+resObj);
			System.out.println("pageParam:"+pageParam);
		}catch(Exception e) {
			e.printStackTrace();
			resObj = EduUtils.setErrorMessage(resObj);
		}		
		
		return resObj;
		
	}
	
	@RequestMapping(value = "/insa/updateForm.do", method = RequestMethod.POST)
	public Map updateForm(@RequestBody(required = true) Map param) throws Exception{
		Map resObj = new HashMap();
		Map sParam = null;
		Map resObj2 = null;
		String insa_sabun = null;
		String[] emailAll = null;
		String email1 = null;
		String email2 = null;
		String pwd = null;
		
		System.out.println("updateForm실행aaaaaaaaaaaaaa");
		
		try {
			sParam = (Map)param.get("dc_reqSabun");
			if (sParam == null) {
				throw new RuntimeException("필수 파라메터가 누락되었습니다.");
			}
			System.out.println("sParam:"+sParam);
			
			insa_sabun = (String)sParam.get("INSA_SABUN");
			
			resObj = testService.updateForm(insa_sabun);
			System.out.println("insa_sabun:"+insa_sabun);
			System.out.println("resObj:"+resObj);
			
			resObj2 = (Map)resObj.get("dc_insa");
			
			System.out.println("이메일:"+resObj2.get("INSA_EMAIL"));
			
			if(!(resObj2.get("INSA_EMAIL") == "") && !(resObj2.get("INSA_EMAIL") == null)) {
				emailAll = ((String)resObj2.get("INSA_EMAIL")).split("@");
				email1 = emailAll[0];
				email2 = "@"+emailAll[1];
				
				System.out.println("email1:"+email1);
				System.out.println("email2:"+email2);
				
				resObj2.remove("INSA_EMAIL");
				resObj2.put("INSA_EMAIL1", email1);
				resObj2.put("INSA_EMAIL2", email2);
			}
						
			if(!(resObj2.get("INSA_PWD") == "") && !(resObj2.get("INSA_PWD") == null)) {
				pwd = ((String)resObj2.get("INSA_PWD"));
				
				System.out.println("pwd:"+pwd);
				
				resObj2.put("INSA_PWD2", pwd);
			}
			
			System.out.println("resObj2:"+resObj2);
			
			resObj.put("dc_insa", resObj2);
			
			System.out.println("resObj:"+resObj);
			
		}catch(Exception e) {
			e.printStackTrace();
			resObj = EduUtils.setErrorMessage(resObj);
		}
		
		return resObj;
	
	}
	
	@RequestMapping(value = "/insa/memberupdate.do", method = RequestMethod.POST)
	public void memberupdate(@RequestBody(required = true) Map param, Insa insa) throws Exception{
		Map sParam = null;		
		String insa_sabun = null;
		String insa_join_day = null;
		String insa_retire_day = null;
		String insa_put_yn = null;
		String insa_name = null;
		String insa_reg_no = null;
		String insa_eng_name = null;
		String insa_phone = null;
		String insa_hp = null;
		String insa_pos_gbn_code = null;
		String insa_cmp_reg_no = null;
		String insa_gender = null;
		String insa_years = null;
		String insa_email = null;
		String insa_zip = null;
		String insa_addr1 = null;
		String insa_addr2 = null;
		String insa_dept_code = null;
		String insa_join_gbn_code = null;
		String insa_id = null;
		String insa_pwd = null;
		String insa_salary = null;
		String insa_kosa_reg_yn = null;
		String insa_kosa_class_code = null;
		String insa_mil_yn = null;
		String insa_mil_type = null;
		String insa_mil_level = null;
		String insa_mil_startdate = null;
		String insa_mil_enddate = null;
		String insa_join_type = null;
		String insa_gart_level = null;
		String insa_self_intro = null;
		String insa_crm_name = null;
		String insa_profile = null;
		
		String insa_cmp_reg_image = null;
		String insa_carrier = null;
		
//		ArrayList<String> arrayList1 = null;
//		String[] insa_cmp_reg_image = null;
//		ArrayList<String> arrayList2 = null;
//		String[] insa_carrier = null;
		
		try {
			sParam = (Map)param.get("dc_insa");
			if (sParam == null) {
				throw new RuntimeException("필수 파라메터가 누락되었습니다.");
			}
			System.out.println("sParam:"+sParam);
			
//			if(sParam.get("INSA_CMP_REG_IMAGE") != "") {
//				arrayList1 = new ArrayList<>();
//				arrayList1 = (ArrayList)sParam.get("INSA_CMP_REG_IMAGE");
//				
//				insa_cmp_reg_image = new String[arrayList1.size()];
//				int size1 = 0;			
//				for(String temp : arrayList1) {
//					insa_cmp_reg_image[size1++]=temp;
//				}
//				insa.setInsa_cmp_reg_image(insa_cmp_reg_image[0]);
//			}else {
//				insa.setInsa_cmp_reg_image("");
//			}
//			
//			if(sParam.get("INSA_CARRIER") != "") {
//				arrayList2 = new ArrayList<>();
//				arrayList2 = (ArrayList)sParam.get("INSA_CARRIER");
//				
//				insa_carrier = new String[arrayList2.size()];
//				int size2 = 0;
//				for(String temp : arrayList2) {
//					insa_carrier[size2++]=temp;
//				}
//				insa.setInsa_carrier(insa_carrier[0]);
//			}else {
//				insa.setInsa_carrier("");
//			}
			
			insa_cmp_reg_image = (String)sParam.get("INSA_CMP_REG_IMAGE");
			insa_carrier = (String)sParam.get("INSA_CARRIER");
			
			insa_sabun = String.valueOf(sParam.get("INSA_SABUN"));
			insa_join_day = (String)sParam.get("INSA_JOIN_DAY");
			insa_retire_day = (String)sParam.get("INSA_RETIRE_DAY");
			insa_put_yn = (String)sParam.get("INSA_PUT_YN");
			insa_name = (String)sParam.get("INSA_NAME");
			insa_reg_no = (String)sParam.get("INSA_REG_NO");
			insa_eng_name = (String)sParam.get("INSA_ENG_NAME");
			insa_phone = (String)sParam.get("INSA_PHONE");
			insa_hp = (String)sParam.get("INSA_HP");
			insa_pos_gbn_code = (String)sParam.get("INSA_POS_GBN_CODE");
			insa_cmp_reg_no = (String)sParam.get("INSA_CMP_REG_NO");
			insa_gender = (String)sParam.get("INSA_GENDER");
			insa_years = String.valueOf(sParam.get("INSA_YEARS"));
			insa_email = (String)sParam.get("INSA_EMAIL1") + (String)sParam.get("INSA_EMAIL2");
			insa_zip = (String)sParam.get("INSA_ZIP");
			insa_addr1 = (String)sParam.get("INSA_ADDR1");
			insa_addr2 = (String)sParam.get("INSA_ADDR2");
			insa_dept_code = (String)sParam.get("INSA_DEPT_CODE");
			insa_join_gbn_code = (String)sParam.get("INSA_JOIN_GBN_CODE");
			insa_id = (String)sParam.get("INSA_ID");
			insa_pwd = (String)sParam.get("INSA_PWD");
			insa_salary = (String)sParam.get("INSA_SALARY");
			insa_kosa_reg_yn = (String)sParam.get("INSA_KOSA_REG_YN");
			insa_kosa_class_code = (String)sParam.get("INSA_KOSA_CLASS_CODE");
			insa_mil_yn = (String)sParam.get("INSA_MIL_YN");
			insa_mil_type = (String)sParam.get("INSA_MIL_TYPE");
			insa_mil_level = (String)sParam.get("INSA_MIL_LEVEL");
			insa_mil_startdate = (String)sParam.get("INSA_MIL_STARTDATE");
			insa_mil_enddate = (String)sParam.get("INSA_MIL_ENDDATE");
			insa_join_type = (String)sParam.get("INSA_JOIN_TYPE");
			insa_gart_level = (String)sParam.get("INSA_GART_LEVEL");
			insa_self_intro = (String)sParam.get("INSA_SELF_INTRO");
			insa_crm_name = (String)sParam.get("INSA_CRM_NAME");
			insa_profile = (String)sParam.get("INSA_PROFILE");
			
			insa.setInsa_cmp_reg_image(insa_cmp_reg_image);
			insa.setInsa_carrier(insa_carrier);
			
			insa.setInsa_sabun(insa_sabun);
			insa.setInsa_join_day(insa_join_day);
			insa.setInsa_retire_day(insa_retire_day);
			insa.setInsa_put_yn(insa_put_yn);
			insa.setInsa_name(insa_name);
			insa.setInsa_reg_no(insa_reg_no);
			insa.setInsa_eng_name(insa_eng_name);
			insa.setInsa_phone(insa_phone);
			insa.setInsa_hp(insa_hp);
			insa.setInsa_pos_gbn_code(insa_pos_gbn_code);
			insa.setInsa_cmp_reg_no(insa_cmp_reg_no);
			insa.setInsa_gender(insa_gender);
			insa.setInsa_years(insa_years);
			insa.setInsa_email(insa_email);
			insa.setInsa_zip(insa_zip);
			insa.setInsa_addr1(insa_addr1);
			insa.setInsa_addr2(insa_addr2);
			insa.setInsa_dept_code(insa_dept_code);
			insa.setInsa_join_gbn_code(insa_join_gbn_code);
			insa.setInsa_id(insa_id);
			insa.setInsa_pwd(insa_pwd);
			insa.setInsa_salary(insa_salary);
			insa.setInsa_kosa_reg_yn(insa_kosa_reg_yn);
			insa.setInsa_kosa_class_code(insa_kosa_class_code);
			insa.setInsa_mil_yn(insa_mil_yn);
			insa.setInsa_mil_type(insa_mil_type);
			insa.setInsa_mil_level(insa_mil_level);
			insa.setInsa_mil_startdate(insa_mil_startdate);
			insa.setInsa_mil_enddate(insa_mil_enddate);
			insa.setInsa_join_type(insa_join_type);
			insa.setInsa_gart_level(insa_gart_level);
			insa.setInsa_self_intro(insa_self_intro);
			insa.setInsa_crm_name(insa_crm_name);
			insa.setInsa_profile(insa_profile);
			
			System.out.println("insa:"+sParam);
			System.out.println("insa2:"+insa);
			
			int result = testService.memberupdate(insa);
			
			System.out.println("result:"+result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping(value = "/insa/memberdelete.do", method = RequestMethod.POST)
	public void memberdelete(@RequestBody(required = true) Map param) throws Exception{
		Map sParam = null;
		String insa_sabun = null;
		
		try {
			sParam = (Map)param.get("dc_reqSabun");
			if (sParam == null) {
				throw new RuntimeException("필수 파라메터가 누락되었습니다.");
			}
			System.out.println("sParam:"+sParam);
			
			insa_sabun = (String)sParam.get("INSA_SABUN");
			
			int result = testService.memberdelete(insa_sabun);
			System.out.println("insa_sabun:"+insa_sabun);
			System.out.println("result:"+result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping(value="/insa/idConfirmation.do", method = RequestMethod.POST)
	public Map idcheck(@RequestBody(required = true) Map param) throws Exception{
		Map resObj = new HashMap();
		Map resObj2 = new HashMap();
		Map sParam = null;
		String insa_id = null;
		
		try {
			sParam = (Map)param.get("insa_id_dw");
			if (sParam == null) {
				throw new RuntimeException("필수 파라메터가 누락되었습니다.");
			}
			System.out.println("sParam:"+sParam);
			
			insa_id = (String)sParam.get("INSA_ID");
			
			boolean idcheck = testService.idcheck(insa_id);
			System.out.println("idcheck:"+idcheck);
			
			resObj2.put("ID_CHECK", idcheck);
			
			resObj.put("insa_id_check", resObj2);
			
			System.out.println("resObj:"+resObj);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return resObj;
	}
}
