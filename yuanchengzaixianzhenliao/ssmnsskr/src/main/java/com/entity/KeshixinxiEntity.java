package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 科室信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
@TableName("keshixinxi")
public class KeshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KeshixinxiEntity() {
		
	}
	
	public KeshixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 科室名称
	 */
					
	private String keshimingcheng;
	
	/**
	 * 科室类型
	 */
					
	private String keshileixing;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	/**
	 * 职位
	 */
					
	private String zhiwei;
	
	/**
	 * 医生介绍
	 */
					
	private String yishengjieshao;
	
	/**
	 * 挂号费用
	 */
					
	private Integer guahaofeiyong;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 排班表
	 */
					
	private String paibanbiao;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：科室名称
	 */
	public void setKeshimingcheng(String keshimingcheng) {
		this.keshimingcheng = keshimingcheng;
	}
	/**
	 * 获取：科室名称
	 */
	public String getKeshimingcheng() {
		return keshimingcheng;
	}
	/**
	 * 设置：科室类型
	 */
	public void setKeshileixing(String keshileixing) {
		this.keshileixing = keshileixing;
	}
	/**
	 * 获取：科室类型
	 */
	public String getKeshileixing() {
		return keshileixing;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：医生姓名
	 */
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
	/**
	 * 设置：职位
	 */
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
	/**
	 * 设置：医生介绍
	 */
	public void setYishengjieshao(String yishengjieshao) {
		this.yishengjieshao = yishengjieshao;
	}
	/**
	 * 获取：医生介绍
	 */
	public String getYishengjieshao() {
		return yishengjieshao;
	}
	/**
	 * 设置：挂号费用
	 */
	public void setGuahaofeiyong(Integer guahaofeiyong) {
		this.guahaofeiyong = guahaofeiyong;
	}
	/**
	 * 获取：挂号费用
	 */
	public Integer getGuahaofeiyong() {
		return guahaofeiyong;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：排班表
	 */
	public void setPaibanbiao(String paibanbiao) {
		this.paibanbiao = paibanbiao;
	}
	/**
	 * 获取：排班表
	 */
	public String getPaibanbiao() {
		return paibanbiao;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
