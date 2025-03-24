package com.entity.view;

import com.entity.HuanzhexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 患者信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
@TableName("huanzhexinxi")
public class HuanzhexinxiView  extends HuanzhexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuanzhexinxiView(){
	}
 
 	public HuanzhexinxiView(HuanzhexinxiEntity huanzhexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, huanzhexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
