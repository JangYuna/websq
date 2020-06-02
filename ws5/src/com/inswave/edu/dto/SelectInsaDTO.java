package com.inswave.edu.dto;

public class SelectInsaDTO {
	private String insa_sabun;
	private String insa_name;
	private String insa_join_type;
	private String insa_put_yn;
	private String insa_pos_gbn_code;
	private String insa_join_day;
	private String insa_retire_day;
	private String insa_join_gbn_code;
	
	private int page;
	private int count;
	private int startNum;
	private int endNum;
	private int totCount;
	
	public String getInsa_sabun() {
		return insa_sabun;
	}
	public void setInsa_sabun(String insa_sabun) {
		this.insa_sabun = insa_sabun;
	}
	public String getInsa_name() {
		return insa_name;
	}
	public void setInsa_name(String insa_name) {
		this.insa_name = insa_name;
	}
	public String getInsa_join_type() {
		return insa_join_type;
	}
	public void setInsa_join_type(String insa_join_type) {
		this.insa_join_type = insa_join_type;
	}
	public String getInsa_put_yn() {
		return insa_put_yn;
	}
	public void setInsa_put_yn(String insa_put_yn) {
		this.insa_put_yn = insa_put_yn;
	}
	public String getInsa_pos_gbn_code() {
		return insa_pos_gbn_code;
	}
	public void setInsa_pos_gbn_code(String insa_pos_gbn_code) {
		this.insa_pos_gbn_code = insa_pos_gbn_code;
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
	public String getInsa_join_gbn_code() {
		return insa_join_gbn_code;
	}
	public void setInsa_join_gbn_code(String insa_join_gbn_code) {
		this.insa_join_gbn_code = insa_join_gbn_code;
	}	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	public int getEndNum() {
		return endNum;
	}
	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
	public int getTotCount() {
		return totCount;
	}
	public void setTotCount(int totCount) {
		this.totCount = totCount;
	}
	
}
