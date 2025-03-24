package com.entity.view;

import com.entity.YiyuanjieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医院介绍
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
@TableName("yiyuanjieshao")
public class YiyuanjieshaoView  extends YiyuanjieshaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiyuanjieshaoView(){
	}
 
 	public YiyuanjieshaoView(YiyuanjieshaoEntity yiyuanjieshaoEntity){
 	try {
			BeanUtils.copyProperties(this, yiyuanjieshaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
