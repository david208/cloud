package org.feign.check.service.impl;

import org.feign.check.entity.ACheck;
import org.feign.check.mapper.ACheckMapper;
import org.feign.check.service.IACheckService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-01-23
 */
@Service
public class ACheckServiceImpl extends ServiceImpl<ACheckMapper, ACheck> implements IACheckService {

}
