package com.entity.view;

import com.entity.YonghuwenzhenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户问诊
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
@TableName("yonghuwenzhen")
public class YonghuwenzhenView  extends YonghuwenzhenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuwenzhenView(){
	}
 
 	public YonghuwenzhenView(YonghuwenzhenEntity yonghuwenzhenEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuwenzhenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
