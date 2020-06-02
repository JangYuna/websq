package com.inswave.edu.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("Insa")
public class Insa implements Serializable{
	private static final long serialVersionUID=1105091737L;
	
	private String insa_sabun;
	private String insa_join_day;
	private String insa_retire_day;
	private String insa_put_yn;
	private String insa_name;
	private String insa_reg_no;
	private String insa_eng_name;
	private String insa_phone;
	private String insa_hp;
	private String insa_carrier;
	private String insa_pos_gbn_code;
	private String insa_cmp_reg_no;
	private String insa_cmp_reg_image;
	private String insa_gender;
	private String insa_years;
	private String insa_email;
	private String insa_zip;
	private String insa_addr1;
	private String insa_addr2;
	private String insa_dept_code;
	private String insa_join_gbn_code;
	private String insa_id;
	private String insa_pwd;
	private String insa_salary;
	private String insa_kosa_reg_yn;
	private String insa_kosa_class_code;
	private String insa_mil_yn;
	private String insa_mil_type;
	private String insa_mil_level;
	private String insa_mil_startdate;
	private String insa_mil_enddate;
	private String insa_join_type;
	private String insa_gart_level;
	private String insa_self_intro;
	private String insa_crm_name;
	private String insa_profile;
	
	public Insa() {
		
	}

	public Insa(String insa_sabun, String insa_join_day, String insa_retire_day, String insa_put_yn, String insa_name,
			String insa_reg_no, String insa_eng_name, String insa_phone, String insa_hp, String insa_carrier,
			String insa_pos_gbn_code, String insa_cmp_reg_no, String insa_cmp_reg_image, String insa_gender,
			String insa_years, String insa_email, String insa_zip, String insa_addr1, String insa_addr2,
			String insa_dept_code, String insa_join_gbn_code, String insa_id, String insa_pwd, String insa_salary,
			String insa_kosa_reg_yn, String insa_kosa_class_code, String insa_mil_yn, String insa_mil_type,
			String insa_mil_level, String insa_mil_startdate, String insa_mil_enddate, String insa_join_type,
			String insa_gart_level, String insa_self_intro, String insa_crm_name, String insa_profile) {
		super();
		this.insa_sabun = insa_sabun;
		this.insa_join_day = insa_join_day;
		this.insa_retire_day = insa_retire_day;
		this.insa_put_yn = insa_put_yn;
		this.insa_name = insa_name;
		this.insa_reg_no = insa_reg_no;
		this.insa_eng_name = insa_eng_name;
		this.insa_phone = insa_phone;
		this.insa_hp = insa_hp;
		this.insa_carrier = insa_carrier;
		this.insa_pos_gbn_code = insa_pos_gbn_code;
		this.insa_cmp_reg_no = insa_cmp_reg_no;
		this.insa_cmp_reg_image = insa_cmp_reg_image;
		this.insa_gender = insa_gender;
		this.insa_years = insa_years;
		this.insa_email = insa_email;
		this.insa_zip = insa_zip;
		this.insa_addr1 = insa_addr1;
		this.insa_addr2 = insa_addr2;
		this.insa_dept_code = insa_dept_code;
		this.insa_join_gbn_code = insa_join_gbn_code;
		this.insa_id = insa_id;
		this.insa_pwd = insa_pwd;
		this.insa_salary = insa_salary;
		this.insa_kosa_reg_yn = insa_kosa_reg_yn;
		this.insa_kosa_class_code = insa_kosa_class_code;
		this.insa_mil_yn = insa_mil_yn;
		this.insa_mil_type = insa_mil_type;
		this.insa_mil_level = insa_mil_level;
		this.insa_mil_startdate = insa_mil_startdate;
		this.insa_mil_enddate = insa_mil_enddate;
		this.insa_join_type = insa_join_type;
		this.insa_gart_level = insa_gart_level;
		this.insa_self_intro = insa_self_intro;
		this.insa_crm_name = insa_crm_name;
		this.insa_profile = insa_profile;
	}

	public String getInsa_sabun() {
		return insa_sabun;
	}

	public void setInsa_sabun(String insa_sabun) {
		this.insa_sabun = insa_sabun;
	}

	public String getInsa_join_day() {
		return insa_join_day;
	}

	public void setInsa_join_day(String insa_join_day) {
		this.insa_join_day = insa_join_day;
	}

	public String getInsa_retire_day() {
		return insa_retire_day;
	}

	public void setInsa_retire_day(String insa_retire_day) {
		this.insa_retire_day = insa_retire_day;
	}

	public String getInsa_put_yn() {
		return insa_put_yn;
	}

	public void setInsa_put_yn(String insa_put_yn) {
		this.insa_put_yn = insa_put_yn;
	}

	public String getInsa_name() {
		return insa_name;
	}

	public void setInsa_name(String insa_name) {
		this.insa_name = insa_name;
	}

	public String getInsa_reg_no() {
		return insa_reg_no;
	}

	public void setInsa_reg_no(String insa_reg_no) {
		this.insa_reg_no = insa_reg_no;
	}

	public String getInsa_eng_name() {
		return insa_eng_name;
	}

	public void setInsa_eng_name(String insa_eng_name) {
		this.insa_eng_name = insa_eng_name;
	}

	public String getInsa_phone() {
		return insa_phone;
	}

	public void setInsa_phone(String insa_phone) {
		this.insa_phone = insa_phone;
	}

	public String getInsa_hp() {
		return insa_hp;
	}

	public void setInsa_hp(String insa_hp) {
		this.insa_hp = insa_hp;
	}

	public String getInsa_carrier() {
		return insa_carrier;
	}

	public void setInsa_carrier(String insa_carrier) {
		this.insa_carrier = insa_carrier;
	}

	public String getInsa_pos_gbn_code() {
		return insa_pos_gbn_code;
	}

	public void setInsa_pos_gbn_code(String insa_pos_gbn_code) {
		this.insa_pos_gbn_code = insa_pos_gbn_code;
	}

	public String getInsa_cmp_reg_no() {
		return insa_cmp_reg_no;
	}

	public void setInsa_cmp_reg_no(String insa_cmp_reg_no) {
		this.insa_cmp_reg_no = insa_cmp_reg_no;
	}

	public String getInsa_cmp_reg_image() {
		return insa_cmp_reg_image;
	}

	public void setInsa_cmp_reg_image(String insa_cmp_reg_image) {
		this.insa_cmp_reg_image = insa_cmp_reg_image;
	}

	public String getInsa_gender() {
		return insa_gender;
	}

	public void setInsa_gender(String insa_gender) {
		this.insa_gender = insa_gender;
	}

	public String getInsa_years() {
		return insa_years;
	}

	public void setInsa_years(String insa_years) {
		this.insa_years = insa_years;
	}

	public String getInsa_email() {
		return insa_email;
	}

	public void setInsa_email(String insa_email) {
		this.insa_email = insa_email;
	}

	public String getInsa_zip() {
		return insa_zip;
	}

	public void setInsa_zip(String insa_zip) {
		this.insa_zip = insa_zip;
	}

	public String getInsa_addr1() {
		return insa_addr1;
	}

	public void setInsa_addr1(String insa_addr1) {
		this.insa_addr1 = insa_addr1;
	}

	public String getInsa_addr2() {
		return insa_addr2;
	}

	public void setInsa_addr2(String insa_addr2) {
		this.insa_addr2 = insa_addr2;
	}

	public String getInsa_dept_code() {
		return insa_dept_code;
	}

	public void setInsa_dept_code(String insa_dept_code) {
		this.insa_dept_code = insa_dept_code;
	}

	public String getInsa_join_gbn_code() {
		return insa_join_gbn_code;
	}

	public void setInsa_join_gbn_code(String insa_join_gbn_code) {
		this.insa_join_gbn_code = insa_join_gbn_code;
	}

	public String getInsa_id() {
		return insa_id;
	}

	public void setInsa_id(String insa_id) {
		this.insa_id = insa_id;
	}

	public String getInsa_pwd() {
		return insa_pwd;
	}

	public void setInsa_pwd(String insa_pwd) {
		this.insa_pwd = insa_pwd;
	}

	public String getInsa_salary() {
		return insa_salary;
	}

	public void setInsa_salary(String insa_salary) {
		this.insa_salary = insa_salary;
	}

	public String getInsa_kosa_reg_yn() {
		return insa_kosa_reg_yn;
	}

	public void setInsa_kosa_reg_yn(String insa_kosa_reg_yn) {
		this.insa_kosa_reg_yn = insa_kosa_reg_yn;
	}

	public String getInsa_kosa_class_code() {
		return insa_kosa_class_code;
	}

	public void setInsa_kosa_class_code(String insa_kosa_class_code) {
		this.insa_kosa_class_code = insa_kosa_class_code;
	}

	public String getInsa_mil_yn() {
		return insa_mil_yn;
	}

	public void setInsa_mil_yn(String insa_mil_yn) {
		this.insa_mil_yn = insa_mil_yn;
	}

	public String getInsa_mil_type() {
		return insa_mil_type;
	}

	public void setInsa_mil_type(String insa_mil_type) {
		this.insa_mil_type = insa_mil_type;
	}

	public String getInsa_mil_level() {
		return insa_mil_level;
	}

	public void setInsa_mil_level(String insa_mil_level) {
		this.insa_mil_level = insa_mil_level;
	}

	public String getInsa_mil_startdate() {
		return insa_mil_startdate;
	}

	public void setInsa_mil_startdate(String insa_mil_startdate) {
		this.insa_mil_startdate = insa_mil_startdate;
	}

	public String getInsa_mil_enddate() {
		return insa_mil_enddate;
	}

	public void setInsa_mil_enddate(String insa_mil_enddate) {
		this.insa_mil_enddate = insa_mil_enddate;
	}

	public String getInsa_join_type() {
		return insa_join_type;
	}

	public void setInsa_join_type(String insa_join_type) {
		this.insa_join_type = insa_join_type;
	}

	public String getInsa_gart_level() {
		return insa_gart_level;
	}

	public void setInsa_gart_level(String insa_gart_level) {
		this.insa_gart_level = insa_gart_level;
	}

	public String getInsa_self_intro() {
		return insa_self_intro;
	}

	public void setInsa_self_intro(String insa_self_intro) {
		this.insa_self_intro = insa_self_intro;
	}

	public String getInsa_crm_name() {
		return insa_crm_name;
	}

	public void setInsa_crm_name(String insa_crm_name) {
		this.insa_crm_name = insa_crm_name;
	}

	public String getInsa_profile() {
		return insa_profile;
	}

	public void setInsa_profile(String insa_profile) {
		this.insa_profile = insa_profile;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Insa [insa_sabun=" + insa_sabun + ", insa_join_day=" + insa_join_day + ", insa_retire_day="
				+ insa_retire_day + ", insa_put_yn=" + insa_put_yn + ", insa_name=" + insa_name + ", insa_reg_no="
				+ insa_reg_no + ", insa_eng_name=" + insa_eng_name + ", insa_phone=" + insa_phone + ", insa_hp="
				+ insa_hp + ", insa_carrier=" + insa_carrier + ", insa_pos_gbn_code=" + insa_pos_gbn_code
				+ ", insa_cmp_reg_no=" + insa_cmp_reg_no + ", insa_cmp_reg_image=" + insa_cmp_reg_image
				+ ", insa_gender=" + insa_gender + ", insa_years=" + insa_years + ", insa_email=" + insa_email
				+ ", insa_zip=" + insa_zip + ", insa_addr1=" + insa_addr1 + ", insa_addr2=" + insa_addr2
				+ ", insa_dept_code=" + insa_dept_code + ", insa_join_gbn_code=" + insa_join_gbn_code + ", insa_id="
				+ insa_id + ", insa_pwd=" + insa_pwd + ", insa_salary=" + insa_salary + ", insa_kosa_reg_yn="
				+ insa_kosa_reg_yn + ", insa_kosa_class_code=" + insa_kosa_class_code + ", insa_mil_yn=" + insa_mil_yn
				+ ", insa_mil_type=" + insa_mil_type + ", insa_mil_level=" + insa_mil_level + ", insa_mil_startdate="
				+ insa_mil_startdate + ", insa_mil_enddate=" + insa_mil_enddate + ", insa_join_type=" + insa_join_type
				+ ", insa_gart_level=" + insa_gart_level + ", insa_self_intro=" + insa_self_intro + ", insa_crm_name="
				+ insa_crm_name + ", insa_profile=" + insa_profile + "]";
	}
	
}
