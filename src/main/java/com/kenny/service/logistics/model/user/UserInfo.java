package com.kenny.service.logistics.model.user;

import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

@ApiModel("")
public class UserInfo{
	@ApiModelProperty("")
	private Integer id;
	@ApiModelProperty("")
	private Integer user_id;
	@ApiModelProperty("")
	private String nickname;
	@ApiModelProperty("")
	private String sex;
	@ApiModelProperty("")
	private String img;
	@ApiModelProperty("")
	private Date birthday;

	public Integer getId(){
		return id;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getUser_id(){
		return user_id;
	}

	public void setUser_id(Integer user_id){
		this.user_id = user_id;
	}

	public String getNickname(){
		return nickname;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getSex(){
		return sex;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public String getImg(){
		return img;
	}

	public void setImg(String img){
		this.img = img;
	}

	public Date getBirthday(){
		return birthday;
	}

	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}

}