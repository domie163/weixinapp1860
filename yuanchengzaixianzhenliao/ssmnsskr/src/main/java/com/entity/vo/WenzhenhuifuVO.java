package com.entity.vo;

import com.entity.WenzhenhuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 问诊回复
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
public class WenzhenhuifuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 就诊卡号
	 */
	
	private String jiuzhenkahao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 问诊内容
	 */
	
	private String wenzhenneirong;
		
	/**
	 * 问诊答复
	 */
	
	private String wenzhendafu;
		
	/**
	 * 答复时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dafushijian;
		
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
	 * 设置：就诊卡号
	 */
	 
	public void setJiuzhenkahao(String jiuzhenkahao) {
		this.jiuzhenkahao = jiuzhenkahao;
	}
	
	/**
	 * 获取：就诊卡号
	 */
	public String getJiuzhenkahao() {
		return jiuzhenkahao;
	}
				
	
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
	 * 设置：问诊内容
	 */
	 
	public void setWenzhenneirong(String wenzhenneirong) {
		this.wenzhenneirong = wenzhenneirong;
	}
	
	/**
	 * 获取：问诊内容
	 */
	public String getWenzhenneirong() {
		return wenzhenneirong;
	}
				
	
	/**
	 * 设置：问诊答复
	 */
	 
	public void setWenzhendafu(String wenzhendafu) {
		this.wenzhendafu = wenzhendafu;
	}
	
	/**
	 * 获取：问诊答复
	 */
	public String getWenzhendafu() {
		return wenzhendafu;
	}
				
	
	/**
	 * 设置：答复时间
	 */
	 
	public void setDafushijian(Date dafushijian) {
		this.dafushijian = dafushijian;
	}
	
	/**
	 * 获取：答复时间
	 */
	public Date getDafushijian() {
		return dafushijian;
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
