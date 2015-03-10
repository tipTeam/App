package com.tip.product.app.ws.get_doctor_info;

import java.sql.Date;

public class ResponseItem {
	
	 private String  id; 
	 private String Name; 		//医生姓名
	 private String code; 		//医生编码
	 private String sex;  		//医生性别
	 private String birthday; 	//生日
	 private String pohne_num; 	//手机号
	 private String email;  	//邮箱
	 private String id_card;    //身份证号
	 private String title_type; //职称类型
	 private String clinical_title; //临床职称
	 private String hospital;    //所在医院
	 private String hospital_dep;  //所在医院科室
	 private String language;   //语言
	 private String address;    //地址
	 private String natives;    //籍贯
	 private String good_at;    //擅长
	 private String introduce;  //自我介绍
	 private String major;      //专业,研究方向
	 private String education;  //教育
	 private String award;      //所获荣誉,奖项
	 private String video_url;  //视频介绍地址
	 private String pohto_url;  //个人形象照地址
	 private String create_time;  //创建时间
	 private String last_modifile_time;  //上一次修改时间
	 private String qr_code_url;  //二维码
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	 
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPohne_num() {
		return pohne_num;
	}
	public void setPohne_num(String pohne_num) {
		this.pohne_num = pohne_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId_card() {
		return id_card;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	public String getTitle_type() {
		return title_type;
	}
	public void setTitle_type(String title_type) {
		this.title_type = title_type;
	}
	public String getClinical_title() {
		return clinical_title;
	}
	public void setClinical_title(String clinical_title) {
		this.clinical_title = clinical_title;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public String getHospital_dep() {
		return hospital_dep;
	}
	public void setHospital_dep(String hospital_dep) {
		this.hospital_dep = hospital_dep;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNatives() {
		return natives;
	}
	public void setNatives(String natives) {
		this.natives = natives;
	}
	public String getGood_at() {
		return good_at;
	}
	public void setGood_at(String good_at) {
		this.good_at = good_at;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getAward() {
		return award;
	}
	public void setAward(String award) {
		this.award = award;
	}
	public String getVideo_url() {
		return video_url;
	}
	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}
	public String getPohto_url() {
		return pohto_url;
	}
	public void setPohto_url(String pohto_url) {
		this.pohto_url = pohto_url;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getLast_modifile_time() {
		return last_modifile_time;
	}
	public void setLast_modifile_time(String last_modifile_time) {
		this.last_modifile_time = last_modifile_time;
	}
	public String getQr_code_url() {
		return qr_code_url;
	}
	public void setQr_code_url(String qr_code_url) {
		this.qr_code_url = qr_code_url;
	}
	
	
	
}
