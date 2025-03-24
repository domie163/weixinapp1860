package com.dao;

import com.entity.HuanzhexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanzhexinxiVO;
import com.entity.view.HuanzhexinxiView;


/**
 * 患者信息
 * 
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
public interface HuanzhexinxiDao extends BaseMapper<HuanzhexinxiEntity> {
	
	List<HuanzhexinxiVO> selectListVO(@Param("ew") Wrapper<HuanzhexinxiEntity> wrapper);
	
	HuanzhexinxiVO selectVO(@Param("ew") Wrapper<HuanzhexinxiEntity> wrapper);
	
	List<HuanzhexinxiView> selectListView(@Param("ew") Wrapper<HuanzhexinxiEntity> wrapper);

	List<HuanzhexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuanzhexinxiEntity> wrapper);
	
	HuanzhexinxiView selectView(@Param("ew") Wrapper<HuanzhexinxiEntity> wrapper);
	
}
