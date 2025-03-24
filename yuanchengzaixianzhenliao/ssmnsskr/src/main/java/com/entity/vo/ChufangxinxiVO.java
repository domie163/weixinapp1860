package com.entity.vo;

import com.entity.ChufangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 处方信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
public class ChufangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 科室名称
	 */
	
	private String keshimingcheng;
		
	/**
	 * 病情解析
	 */
	
	private String bingqingjiexi;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 治疗周期
	 */
	
	private String zhiliaozhouqi;
		
	/**
	 * 处方单
	 */
	
	private String chufangdan;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
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
	 * 设置：病情解析
	 */
	 
	public void setBingqingjiexi(String bingqingjiexi) {
		this.bingqingjiexi = bingqingjiexi;
	}
	
	/**
	 * 获取：病情解析
	 */
	public String getBingqingjiexi() {
		return bingqingjiexi;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：治疗周期
	 */
	 
	public void setZhiliaozhouqi(String zhiliaozhouqi) {
		this.zhiliaozhouqi = zhiliaozhouqi;
	}
	
	/**
	 * 获取：治疗周期
	 */
	public String getZhiliaozhouqi() {
		return zhiliaozhouqi;
	}
				
	
	/**
	 * 设置：处方单
	 */
	 
	public void setChufangdan(String chufangdan) {
		this.chufangdan = chufangdan;
	}
	
	/**
	 * 获取：处方单
	 */
	public String getChufangdan() {
		return chufangdan;
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
