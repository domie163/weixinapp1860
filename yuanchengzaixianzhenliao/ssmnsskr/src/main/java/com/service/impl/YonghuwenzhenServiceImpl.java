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


import com.dao.YonghuwenzhenDao;
import com.entity.YonghuwenzhenEntity;
import com.service.YonghuwenzhenService;
import com.entity.vo.YonghuwenzhenVO;
import com.entity.view.YonghuwenzhenView;

@Service("yonghuwenzhenService")
public class YonghuwenzhenServiceImpl extends ServiceImpl<YonghuwenzhenDao, YonghuwenzhenEntity> implements YonghuwenzhenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuwenzhenEntity> page = this.selectPage(
                new Query<YonghuwenzhenEntity>(params).getPage(),
                new EntityWrapper<YonghuwenzhenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuwenzhenEntity> wrapper) {
		  Page<YonghuwenzhenView> page =new Query<YonghuwenzhenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuwenzhenVO> selectListVO(Wrapper<YonghuwenzhenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuwenzhenVO selectVO(Wrapper<YonghuwenzhenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuwenzhenView> selectListView(Wrapper<YonghuwenzhenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuwenzhenView selectView(Wrapper<YonghuwenzhenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
