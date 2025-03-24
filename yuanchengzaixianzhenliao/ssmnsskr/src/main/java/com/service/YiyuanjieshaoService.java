package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuanjieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuanjieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuanjieshaoView;


/**
 * 医院介绍
 *
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
public interface YiyuanjieshaoService extends IService<YiyuanjieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuanjieshaoVO> selectListVO(Wrapper<YiyuanjieshaoEntity> wrapper);
   	
   	YiyuanjieshaoVO selectVO(@Param("ew") Wrapper<YiyuanjieshaoEntity> wrapper);
   	
   	List<YiyuanjieshaoView> selectListView(Wrapper<YiyuanjieshaoEntity> wrapper);
   	
   	YiyuanjieshaoView selectView(@Param("ew") Wrapper<YiyuanjieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuanjieshaoEntity> wrapper);
   	
}

