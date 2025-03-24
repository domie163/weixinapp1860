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
 * 医院介绍
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
@TableName("yiyuanjieshao")
public class YiyuanjieshaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiyuanjieshaoEntity() {
		
	}
	
	public YiyuanjieshaoEntity(T t) {
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
	 * 医院名称
	 */
					
	private String yiyuanmingcheng;
	
	/**
	 * 医院地址
	 */
					
	private String yiyuandizhi;
	
	/**
	 * 等级
	 */
					
	private String dengji;
	
	/**
	 * 医院介绍
	 */
					
	private String yiyuanjieshao;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 设备介绍
	 */
					
	private String shebeijieshao;
	
	/**
	 * 注册日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zhuceriqi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：医院名称
	 */
	public void setYiyuanmingcheng(String yiyuanmingcheng) {
		this.yiyuanmingcheng = yiyuanmingcheng;
	}
	/**
	 * 获取：医院名称
	 */
	public String getYiyuanmingcheng() {
		return yiyuanmingcheng;
	}
	/**
	 * 设置：医院地址
	 */
	public void setYiyuandizhi(String yiyuandizhi) {
		this.yiyuandizhi = yiyuandizhi;
	}
	/**
	 * 获取：医院地址
	 */
	public String getYiyuandizhi() {
		return yiyuandizhi;
	}
	/**
	 * 设置：等级
	 */
	public void setDengji(String dengji) {
		this.dengji = dengji;
	}
	/**
	 * 获取：等级
	 */
	public String getDengji() {
		return dengji;
	}
	/**
	 * 设置：医院介绍
	 */
	public void setYiyuanjieshao(String yiyuanjieshao) {
		this.yiyuanjieshao = yiyuanjieshao;
	}
	/**
	 * 获取：医院介绍
	 */
	public String getYiyuanjieshao() {
		return yiyuanjieshao;
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
	 * 设置：设备介绍
	 */
	public void setShebeijieshao(String shebeijieshao) {
		this.shebeijieshao = shebeijieshao;
	}
	/**
	 * 获取：设备介绍
	 */
	public String getShebeijieshao() {
		return shebeijieshao;
	}
	/**
	 * 设置：注册日期
	 */
	public void setZhuceriqi(Date zhuceriqi) {
		this.zhuceriqi = zhuceriqi;
	}
	/**
	 * 获取：注册日期
	 */
	public Date getZhuceriqi() {
		return zhuceriqi;
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

}
