package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuanzhexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuanzhexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanzhexinxiView;


/**
 * 患者信息
 *
 * @author 
 * @email 
 * @date 2021-05-05 14:26:19
 */
public interface HuanzhexinxiService extends IService<HuanzhexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuanzhexinxiVO> selectListVO(Wrapper<HuanzhexinxiEntity> wrapper);
   	
   	HuanzhexinxiVO selectVO(@Param("ew") Wrapper<HuanzhexinxiEntity> wrapper);
   	
   	List<HuanzhexinxiView> selectListView(Wrapper<HuanzhexinxiEntity> wrapper);
   	
   	HuanzhexinxiView selectView(@Param("ew") Wrapper<HuanzhexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuanzhexinxiEntity> wrapper);
   	
}

