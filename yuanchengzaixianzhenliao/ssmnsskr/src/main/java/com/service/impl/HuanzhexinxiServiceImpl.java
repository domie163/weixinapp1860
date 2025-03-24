package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuanzhexinxiDao;
import com.entity.HuanzhexinxiEntity;
import com.service.HuanzhexinxiService;
import com.entity.vo.HuanzhexinxiVO;
import com.entity.view.HuanzhexinxiView;

@Service("huanzhexinxiService")
public class HuanzhexinxiServiceImpl extends ServiceImpl<HuanzhexinxiDao, HuanzhexinxiEntity> implements HuanzhexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanzhexinxiEntity> page = this.selectPage(
                new Query<HuanzhexinxiEntity>(params).getPage(),
                new EntityWrapper<HuanzhexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanzhexinxiEntity> wrapper) {
		  Page<HuanzhexinxiView> page =new Query<HuanzhexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuanzhexinxiVO> selectListVO(Wrapper<HuanzhexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanzhexinxiVO selectVO(Wrapper<HuanzhexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanzhexinxiView> selectListView(Wrapper<HuanzhexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanzhexinxiView selectView(Wrapper<HuanzhexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
