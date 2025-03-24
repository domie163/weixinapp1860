package com.dao;

import com.entity.YonghuwenzhenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuwenzhenVO;
import com.entity.view.YonghuwenzhenView;


/**
 * 用户问诊
 * 
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
public interface YonghuwenzhenDao extends BaseMapper<YonghuwenzhenEntity> {
	
	List<YonghuwenzhenVO> selectListVO(@Param("ew") Wrapper<YonghuwenzhenEntity> wrapper);
	
	YonghuwenzhenVO selectVO(@Param("ew") Wrapper<YonghuwenzhenEntity> wrapper);
	
	List<YonghuwenzhenView> selectListView(@Param("ew") Wrapper<YonghuwenzhenEntity> wrapper);

	List<YonghuwenzhenView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuwenzhenEntity> wrapper);
	
	YonghuwenzhenView selectView(@Param("ew") Wrapper<YonghuwenzhenEntity> wrapper);
	
}
