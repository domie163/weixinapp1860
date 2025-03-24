package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuwenzhenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuwenzhenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuwenzhenView;


/**
 * 用户问诊
 *
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
public interface YonghuwenzhenService extends IService<YonghuwenzhenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuwenzhenVO> selectListVO(Wrapper<YonghuwenzhenEntity> wrapper);
   	
   	YonghuwenzhenVO selectVO(@Param("ew") Wrapper<YonghuwenzhenEntity> wrapper);
   	
   	List<YonghuwenzhenView> selectListView(Wrapper<YonghuwenzhenEntity> wrapper);
   	
   	YonghuwenzhenView selectView(@Param("ew") Wrapper<YonghuwenzhenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuwenzhenEntity> wrapper);
   	
}

