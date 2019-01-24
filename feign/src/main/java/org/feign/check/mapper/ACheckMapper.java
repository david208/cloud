package org.feign.check.mapper;

import org.apache.ibatis.annotations.Param;
import org.feign.check.entity.ACheck;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-01-23
 */
public interface ACheckMapper extends BaseMapper<ACheck> {

	
	 IPage<ACheck> selectPageVo(Page page, @Param("id") long id);

}
