package com.entity.vo;

import com.entity.YiyuanjieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 医院介绍
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
public class YiyuanjieshaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhuceriqi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
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
