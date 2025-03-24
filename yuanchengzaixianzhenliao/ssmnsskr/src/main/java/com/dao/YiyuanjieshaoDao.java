package com.dao;

import com.entity.YiyuanjieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiyuanjieshaoVO;
import com.entity.view.YiyuanjieshaoView;


/**
 * 医院介绍
 * 
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
public interface YiyuanjieshaoDao extends BaseMapper<YiyuanjieshaoEntity> {
	
	List<YiyuanjieshaoVO> selectListVO(@Param("ew") Wrapper<YiyuanjieshaoEntity> wrapper);
	
	YiyuanjieshaoVO selectVO(@Param("ew") Wrapper<YiyuanjieshaoEntity> wrapper);
	
	List<YiyuanjieshaoView> selectListView(@Param("ew") Wrapper<YiyuanjieshaoEntity> wrapper);

	List<YiyuanjieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<YiyuanjieshaoEntity> wrapper);
	
	YiyuanjieshaoView selectView(@Param("ew") Wrapper<YiyuanjieshaoEntity> wrapper);
	
}
