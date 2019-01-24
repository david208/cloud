package org.feign.check.controller;


import org.feign.check.entity.ACheck;
import org.feign.check.mapper.ACheckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-01-23
 */
@RestController
@RequestMapping("/check/a-check")
public class ACheckController {
	
	@Autowired
	ACheckMapper aCheckMapper;
	
	@RequestMapping
	public void check(){
		ACheck aCheck = new ACheck();
		aCheck.setName("1");
		aCheckMapper.insert(aCheck);
	}
	
	@RequestMapping("page")
	public IPage<ACheck> page(Page page,long id){
		return aCheckMapper.selectPageVo(page, id);
	}

}
