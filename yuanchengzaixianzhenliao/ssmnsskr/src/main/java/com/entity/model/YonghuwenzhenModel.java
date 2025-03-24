package com.entity.model;

import com.entity.YonghuwenzhenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 用户问诊
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
public class YonghuwenzhenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 问诊内容
	 */
	
	private String wenzhenneirong;
		
	/**
	 * 问诊时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date wenzhenshijian;
		
	/**
	 * 就诊卡号
	 */
	
	private String jiuzhenkahao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：问诊时间
	 */
	 
	public void setWenzhenshijian(Date wenzhenshijian) {
		this.wenzhenshijian = wenzhenshijian;
	}
	
	/**
	 * 获取：问诊时间
	 */
	public Date getWenzhenshijian() {
		return wenzhenshijian;
	}
				
	
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
